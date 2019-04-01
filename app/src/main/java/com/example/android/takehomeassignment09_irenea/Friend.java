package com.example.android.takehomeassignment09_irenea;

import java.io.Serializable;

class Friend implements Serializable {
    String sFriName;
    int sFriAge;
    boolean sEatSweets;

    public Friend() {

    }

    public Friend(String sFriName, int sFriAge, boolean sEatSweets) {
        this.sFriName = sFriName;
        this.sFriAge = sFriAge;
        this.sEatSweets = sEatSweets;
    }

    public String getsFriName() {
        return sFriName;
    }

    public void setsFriName(String sFriName) {
        this.sFriName = sFriName;
    }

    public int getsFriAge() {
        return sFriAge;
    }

    public void setsFriAge(int sFriAge) {
        this.sFriAge = sFriAge;
    }

    public boolean issEatSweets() {
        return sEatSweets;
    }

    public void setsEatSweets(boolean sEatSweets) {
        this.sEatSweets = sEatSweets;
    }
    @Override
    public String toString() {
        return "Friend's Name: "+sFriName+
                "\nAge: "+ sFriAge+
                "\nDoes he/she like sweets? "+sEatSweets;
    }
}
