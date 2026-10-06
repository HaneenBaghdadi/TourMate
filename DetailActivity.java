package com.example.tourmate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private String name;
    private SharedPreferences preferences;
    private Button favoriteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Connect Java with your existing XML IDs
        TextView placeName = findViewById(R.id.placeName);
        TextView placeEmoji = findViewById(R.id.placeEmoji);
        TextView placeDescription = findViewById(R.id.placeDescription);
        TextView attractions = findViewById(R.id.attractions);
        TextView tips = findViewById(R.id.tips);

        favoriteButton = findViewById(R.id.favoriteButton);
        Button mapButton = findViewById(R.id.mapButton);
        Button backButton = findViewById(R.id.backButton);

        // Get destination information
        name = getIntent().getStringExtra("name");

        String emoji = getIntent().getStringExtra("emoji");
        String description = getIntent().getStringExtra("description");
        String attractionText = getIntent().getStringExtra("attractions");
        String travelTips = getIntent().getStringExtra("travelTips");

        double latitude =
                getIntent().getDoubleExtra("latitude", 20.5937);

        double longitude =
                getIntent().getDoubleExtra("longitude", 78.9629);

        // Display destination information
        placeName.setText(name);
        placeEmoji.setText(emoji);
        placeDescription.setText(description);
        attractions.setText(attractionText);
        tips.setText(travelTips);

        // Favorites storage
        preferences =
                getSharedPreferences(
                        "TourMatePrefs",
                        MODE_PRIVATE
                );

        updateFavoriteButton();

        // Add / Remove Favorite
        favoriteButton.setOnClickListener(v -> {

            boolean isFavorite =
                    preferences.getBoolean(name, false);

            preferences.edit()
                    .putBoolean(name, !isFavorite)
                    .apply();

            updateFavoriteButton();
        });

        // Open Google Maps
        mapButton.setOnClickListener(v -> {

            String mapUrl =
                    "https://www.google.com/maps/search/?api=1"
                            + "&query="
                            + latitude
                            + ","
                            + longitude;

            Intent mapIntent =
                    new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse(mapUrl)
                    );

            startActivity(mapIntent);
        });

        // Back to destinations
        backButton.setOnClickListener(v -> finish());
    }

    private void updateFavoriteButton() {

        boolean isFavorite =
                preferences.getBoolean(name, false);

        if (isFavorite) {

            favoriteButton.setText(
                    "♥ Remove from Favorites"
            );

        } else {

            favoriteButton.setText(
                    "♡ Add to Favorites"
            );
        }
    }
}