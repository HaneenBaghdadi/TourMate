package com.example.tourmate;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class DestinationsActivity extends AppCompatActivity {

    private LinearLayout destinationContainer;
    private EditText destinationSearch;

    private List<Destination> allDestinations;
    private List<Destination> displayedDestinations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destinations);

        destinationContainer =
                findViewById(R.id.destinationContainer);

        destinationSearch =
                findViewById(R.id.destinationSearch);

        Button backButton =
                findViewById(R.id.backButton);

        // Load all destinations
        allDestinations =
                DestinationData.getDestinations();

        displayedDestinations =
                new ArrayList<>(allDestinations);

        // Back button
        backButton.setOnClickListener(v -> finish());

        // Get category from Home screen
        String category =
                getIntent().getStringExtra("category");

        // Get search entered from Home screen
        String searchFromHome =
                getIntent().getStringExtra("search");

        // Decide what to display
        if (searchFromHome != null &&
                !searchFromHome.trim().isEmpty()) {

            destinationSearch.setText(searchFromHome);

            searchDestinations(searchFromHome);

        } else if (category != null) {

            showCategory(category);

        } else {

            showDestinations(allDestinations);
        }

        // Search while typing
        destinationSearch.addTextChangedListener(
                new TextWatcher() {

                    @Override
                    public void beforeTextChanged(
                            CharSequence s,
                            int start,
                            int count,
                            int after) {
                    }

                    @Override
                    public void onTextChanged(
                            CharSequence s,
                            int start,
                            int before,
                            int count) {

                        searchDestinations(
                                s.toString()
                        );
                    }

                    @Override
                    public void afterTextChanged(
                            Editable s) {
                    }
                }
        );
    }

    // Search destinations
    private void searchDestinations(String query) {

        query =
                query.trim()
                        .toLowerCase(Locale.ROOT);

        displayedDestinations.clear();

        if (query.isEmpty()) {

            displayedDestinations.addAll(
                    allDestinations
            );

        } else {

            for (Destination destination :
                    allDestinations) {

                String searchableText =
                        destination.getName()
                                .toLowerCase(Locale.ROOT)
                                + " "
                                + destination.getKeywords()
                                .toLowerCase(Locale.ROOT);

                if (searchableText.contains(query)) {

                    displayedDestinations.add(
                            destination
                    );
                }
            }
        }

        showDestinations(displayedDestinations);
    }

    // Display destination cards
    private void showDestinations(
            List<Destination> destinations) {

        destinationContainer.removeAllViews();

        for (Destination destination :
                destinations) {

            CardView card =
                    new CardView(this);

            LinearLayout.LayoutParams cardParams =
                    new LinearLayout.LayoutParams(
                            LinearLayout.LayoutParams.MATCH_PARENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT
                    );

            cardParams.setMargins(
                    0,
                    0,
                    0,
                    20
            );

            card.setLayoutParams(cardParams);
            card.setRadius(22);
            card.setCardElevation(5);

            LinearLayout content =
                    new LinearLayout(this);

            content.setOrientation(
                    LinearLayout.VERTICAL
            );

            content.setPadding(
                    25,
                    22,
                    25,
                    22
            );

            // Destination name
            TextView title =
                    new TextView(this);

            title.setText(
                    destination.getEmoji()
                            + "  "
                            + destination.getName()
            );

            title.setTextSize(21);
            title.setTextColor(0xFF222222);

            // Destination type
            TextView type =
                    new TextView(this);

            type.setText(
                    destination.getType()
            );

            type.setTextSize(14);
            type.setTextColor(0xFF777777);

            type.setPadding(
                    0,
                    8,
                    0,
                    8
            );

            // Description
            TextView description =
                    new TextView(this);

            description.setText(
                    destination.getDescription()
            );

            description.setTextSize(15);
            description.setTextColor(0xFF555555);

            content.addView(title);
            content.addView(type);
            content.addView(description);

            card.addView(content);

            // Open destination details
            card.setOnClickListener(v -> {

                Intent intent =
                        new Intent(
                                DestinationsActivity.this,
                                DetailActivity.class
                        );

                intent.putExtra(
                        "name",
                        destination.getName()
                );

                intent.putExtra(
                        "type",
                        destination.getType()
                );

                intent.putExtra(
                        "emoji",
                        destination.getEmoji()
                );

                intent.putExtra(
                        "description",
                        destination.getDescription()
                );

                intent.putExtra(
                        "attractions",
                        destination.getAttractions()
                );

                intent.putExtra(
                        "travelTips",
                        destination.getTravelTips()
                );

                intent.putExtra(
                        "bestTime",
                        destination.getBestTime()
                );

                intent.putExtra(
                        "latitude",
                        destination.getLatitude()
                );

                intent.putExtra(
                        "longitude",
                        destination.getLongitude()
                );

                startActivity(intent);
            });

            destinationContainer.addView(card);
        }
    }

    // Display category destinations
    private void showCategory(String category) {

        displayedDestinations.clear();

        for (Destination destination :
                allDestinations) {

            String type =
                    destination.getType()
                            .toLowerCase(Locale.ROOT);

            String keywords =
                    destination.getKeywords()
                            .toLowerCase(Locale.ROOT);

            // Cities
            if (category.equals("city")) {

                if (type.contains("city")
                        || keywords.contains("city")) {

                    displayedDestinations.add(
                            destination
                    );
                }

                // Beaches
            } else if (category.equals("beach")) {

                if (type.contains("beach")
                        || keywords.contains("beach")
                        || keywords.contains("coast")
                        || keywords.contains("sea")) {

                    displayedDestinations.add(
                            destination
                    );
                }

                // Mountains
            } else if (category.equals("mountain")) {

                if (type.contains("mountain")
                        || keywords.contains("mountain")
                        || keywords.contains("hill")
                        || keywords.contains("himalaya")) {

                    displayedDestinations.add(
                            destination
                    );
                }
            }
        }

        showDestinations(displayedDestinations);
    }
}