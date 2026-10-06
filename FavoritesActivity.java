package com.example.tourmate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.List;

public class FavoritesActivity extends AppCompatActivity {

    private LinearLayout favoritesContainer;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        favoritesContainer =
                findViewById(R.id.favoritesContainer);

        TextView backButton =
                findViewById(R.id.backButton);

        preferences =
                getSharedPreferences(
                        "TourMatePrefs",
                        MODE_PRIVATE
                );

        // Back button
        backButton.setOnClickListener(v -> finish());
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadFavorites();
    }

    private void loadFavorites() {

        favoritesContainer.removeAllViews();

        List<Destination> destinations =
                DestinationData.getDestinations();

        boolean found = false;

        for (Destination destination :
                destinations) {

            boolean isFavorite =
                    preferences.getBoolean(
                            destination.getName(),
                            false
                    );

            if (isFavorite) {

                found = true;

                CardView card =
                        new CardView(this);

                LinearLayout.LayoutParams params =
                        new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.MATCH_PARENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT
                        );

                params.setMargins(
                        0,
                        0,
                        0,
                        20
                );

                card.setLayoutParams(params);
                card.setRadius(22);
                card.setCardElevation(5);

                TextView text =
                        new TextView(this);

                text.setText(
                        destination.getEmoji()
                                + "  "
                                + destination.getName()
                );

                text.setTextSize(20);
                text.setTextColor(0xFF222222);
                text.setPadding(
                        25,
                        25,
                        25,
                        25
                );

                card.addView(text);

                // Open favorite destination
                card.setOnClickListener(v -> {

                    Intent intent =
                            new Intent(
                                    FavoritesActivity.this,
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

                favoritesContainer.addView(card);
            }
        }

        // No favorites
        if (!found) {

            TextView empty =
                    new TextView(this);

            empty.setText(
                    "♡ No favorites yet\n\n"
                            + "Open a destination and tap "
                            + "\"Add to Favorites\"."
            );

            empty.setTextSize(18);
            empty.setTextColor(0xFF444444);
            empty.setPadding(
                    20,
                    40,
                    20,
                    20
            );

            favoritesContainer.addView(empty);
        }
    }
}