package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class radioTest {

    @Test
    public void myTest1() {
        radio cond = new radio();
        cond.increaseVolume(9);

        int expected = 10;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest2() {
        radio cond = new radio();
        cond.increaseVolume(10);

        int expected = cond.maxCurrentVolume();
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest3() {
        radio cond = new radio();
        cond.increaseVolume(11);

        int expected = cond.maxCurrentVolume();
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest4() {
        radio cond = new radio();
        cond.decreaseVolume(-1);

        int expected = cond.minCurrentVolume();
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest5() {
        radio cond = new radio();
        cond.decreaseVolume(0);

        int expected = cond.minCurrentVolume();
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest6() {
        radio cond = new radio();
        cond.decreaseVolume(1);

        int expected = 2;
        int actual = cond.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest7() {
        radio cond = new radio();
        cond.nextRadioStation(1);

        int expected = 2;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest8() {
        radio cond = new radio();
        cond.nextRadioStation(9);

        int expected = 0;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest9() {
        radio cond = new radio();
        cond.prevRadioStation(0);

        int expected = 9;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void myTest10() {
        radio cond = new radio();
        cond.prevRadioStation(1);

        int expected = 2;
        int actual = cond.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
}
