package ru.shureck.java2020.Hack;

public class Courier {
    private float lat, lon;
    private int transport; // 0 - walking; 1 - bacikling; 2 - driving
    private int rating;

    public Courier(float lat, float lon, int transport, int rating) {
        this.lat = lat;
        this.lon = lon;
        this.transport = transport;
        this.rating = rating;
    }

    public Courier(int transport, int rating) {
        this.transport = transport;
        this.rating = rating;
    }

    public void setLocation(float lat, float lon){
        this.lat = lat;
        this.lon = lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
