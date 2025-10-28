package exercise5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio;

    @BeforeEach
    void setUp() {
        radio = new Radio();
    }

    @AfterEach
    void tearDown() {
        radio = null;
    }

    @Test
    void on() {
        radio.on();
        assertTrue(radio.getisOn());
    }

    @Test
    void off() {
        radio.off();
        assertFalse(radio.getisOn());
    }

    @Test
    void increaseVolume() {
        radio.setVolume(1);
        radio.increaseVolume();
        assertEquals(2, radio.getVolume());
    }

    @Test
    void decreaseVolume() {
        radio.setVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getVolume());
    }

    @Test
    void selectChannel() {
        radio.setFrequency(10123);
        radio.selectChannel(3323);
        assertEquals(3323, radio.getFrequency());
    }
}