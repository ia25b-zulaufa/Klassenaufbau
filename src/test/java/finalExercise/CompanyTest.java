package finalExercise;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    Company company;

    @BeforeEach
    void setUp() {
        company = new Company("ZKB", "Neue Hard", 10, 35, false);
    }

    @AfterEach
    void tearDown() {
        company = null;
    }

    @Test
    void addRoom() {
        company.addRoom(19);
        assertEquals(company.getRooms().getFirst().roomNumber, 0);
        assertEquals(company.getRooms().getFirst().capacity, 19);
    }

    @Test
    void searchRoom() {
    }

    @Test
    void freeRooms() {
    }

    @Test
    void bookRoom() {
        company.addRoom(20);
        company.addRoom(12);
        company.addRoom(42);
        company.bookRoom("0");
        company.bookRoom("2");
        assertTrue(company.getRooms().getFirst().isBooked);
        assertTrue(company.getRooms().get(2).isBooked);
        assertFalse(company.getRooms().get(1).isBooked);
    }
}