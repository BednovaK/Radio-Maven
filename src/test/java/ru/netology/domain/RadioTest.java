package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void test() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);

        int expected = 5;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.setNextStation();


        int expected = 6;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation(5);
        rad.setPrevStation();

        int expected = 4;
        int actual = rad.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    public void volume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);

        int expected = 5;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseOverMaxVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void lowerMinVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.lowerVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        assertEquals(expected, actual);
    }

}