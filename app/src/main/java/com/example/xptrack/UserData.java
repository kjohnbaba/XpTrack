package com.example.xptrack;

public class UserData {

    private int totalXP;
    private int strength;

    public UserData(int totalXP, int strength) {
        this.totalXP = totalXP;
        this.strength = strength;
    }

    public UserData() {
    }

    // todo toString


    @Override
    public String toString() {
        return "UserData{" +
                "totalXP=" + totalXP +
                ", strength=" + strength +
                '}';
    }

    public int getTotalXP() {
        return totalXP;
    }

    public void setTotalXP(int totalXP) {
        this.totalXP = totalXP;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
