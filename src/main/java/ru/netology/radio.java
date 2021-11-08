package ru.netology;

public class radio {
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int maxCurrentVolume() {
        currentVolume = 10;
        return 10;
    }

    public int minCurrentVolume() {
        currentVolume = 0;
        return 0;
    }

    public void increaseVolume(int currentVolume) {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
        return;

    }

    public void decreaseVolume(int currentVolume) {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume + 1;
        }
        return;
    }

    private int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextRadioStation(int currentRadioStation) {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }

    public void prevRadioStation(int currentRadioStation) {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation = currentRadioStation + 1;
    }
}





