package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return volume;
    }


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    public int setNextStation() {

        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation >= 9) {
            currentStation = 0;
        }
        return currentStation;
    }


    public void setPrevStation() {
        if (currentStation > 1) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation=9;
        }
    }


    public void setCurrentVolume(int newVolume) {
        if (newVolume > 10) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        this.volume = newVolume;
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void lowerVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}

