package com.example.tourmate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText searchBox;
    private Button exploreButton;
    private Button aboutButton;
    private Button favoritesButton;

    private LinearLayout citiesCard;
    private LinearLayout beachesCard;
    private LinearLayout mountainsCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Existing buttons
        searchBox = findViewById(R.id.searchBox);
        exploreButton = findViewById(R.id.exploreButton);
        aboutButton = findViewById(R.id.aboutButton);
        favoritesButton = findViewById(R.id.favoritesButton);

        // Category cards
        citiesCard = findViewById(R.id.citiesCard);
        beachesCard = findViewById(R.id.beachesCard);
        mountainsCard = findViewById(R.id.mountainsCard);

        // Explore all destinations
        exploreButton.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity.this,
                            DestinationsActivity.class
                    );

            startActivity(intent);
        });

        // About
        aboutButton.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity.this,
                            AboutActivity.class
                    );

            startActivity(intent);
        });

        // Favorites
        favoritesButton.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity.this,
                            FavoritesActivity.class
                    );

            startActivity(intent);
        });

        // Cities category
        citiesCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity.this,
                            DestinationsActivity.class
                    );

            intent.putExtra("category", "city");

            startActivity(intent);
        });

        // Beaches category
        beachesCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity.this,
                            DestinationsActivity.class
                    );

            intent.putExtra("category", "beach");

            startActivity(intent);
        });

        // Mountains category
        mountainsCard.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            MainActivity.this,
                            DestinationsActivity.class
                    );

            intent.putExtra("category", "mountain");

            startActivity(intent);
        });

        // Search
        searchBox.setOnEditorActionListener(
                (v, actionId, event) -> {

                    String query =
                            searchBox.getText()
                                    .toString()
                                    .trim();

                    if (!query.isEmpty()) {

                        Intent intent =
                                new Intent(
                                        MainActivity.this,
                                        DestinationsActivity.class
                                );

                        intent.putExtra(
                                "search",
                                query
                        );

                        startActivity(intent);
                    }

                    return true;
                }
        );
    }
}