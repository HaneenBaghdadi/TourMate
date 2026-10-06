package com.example.tourmate;

public class Destination {

    private String name;
    private String type;
    private String emoji;
    private String description;
    private String attractions;
    private String travelTips;
    private String bestTime;
    private double latitude;
    private double longitude;
    private String keywords;

    public Destination(String name, String type, String emoji,
                       String description, String attractions,
                       String travelTips, String bestTime,
                       double latitude, double longitude,
                       String keywords) {

        this.name = name;
        this.type = type;
        this.emoji = emoji;
        this.description = description;
        this.attractions = attractions;
        this.travelTips = travelTips;
        this.bestTime = bestTime;
        this.latitude = latitude;
        this.longitude = longitude;
        this.keywords = keywords;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getEmoji() {
        return emoji;
    }

    public String getDescription() {
        return description;
    }

    public String getAttractions() {
        return attractions;
    }

    public String getTravelTips() {
        return travelTips;
    }

    public String getBestTime() {
        return bestTime;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getKeywords() {
        return keywords;
    }
}