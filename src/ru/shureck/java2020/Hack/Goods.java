package ru.shureck.java2020.Hack;

public class Goods {
    private float lat, lon;

    public Goods(float lat, float lon) {
        this.lat = lat;
        this.lon = lon;
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
}
