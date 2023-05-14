package com.example.firebaseloginyt;

public class Car {

    private int logo;
    private String marka,model;

    public Car(int logo, String marka, String model) {
        this.logo = logo;
        this.marka = marka;
        this.model = model;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
