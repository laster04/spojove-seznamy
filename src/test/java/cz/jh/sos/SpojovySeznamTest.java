package cz.jh.sos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpojovySeznamTest {

    private SpojovySeznam spojovySeznam;

    @BeforeEach
    void setUp() {
        spojovySeznam = new SpojovySeznam();
    }

    @Test
    void initSeznam() {
        spojovySeznam.initSeznam(4);
        assertEquals(4, spojovySeznam.getSize());
        Uzel u = spojovySeznam.getByIndex(2);
        assertEquals("aaaa2", u.getHodnota());
    }

    @Test
    void add() {
        spojovySeznam.add("Martin");
        assertEquals(1, spojovySeznam.getSize());
        spojovySeznam.add("Lukas");
        spojovySeznam.add("Franta");
        assertEquals(3, spojovySeznam.getSize());
    }

    @Test
    void getByIndex() {
        spojovySeznam.add("Jarda");
        spojovySeznam.add("Bozik");
        assertEquals(2, spojovySeznam.getSize());
        Uzel u = spojovySeznam.getByIndex(2);
        assertEquals("Bozik", u.getHodnota());
    }

    @Test()
    void getByIndexException() {
        spojovySeznam.add("Josef");
        assertThrows(IndexOutOfBoundsException.class, () -> spojovySeznam.getByIndex(5));
    }

    @Test
    void removeLast() {
        spojovySeznam.add("Jarda");
        spojovySeznam.add("Bozik");
        assertEquals(2, spojovySeznam.getSize());
        Uzel u = spojovySeznam.getByIndex(2);
        assertEquals("Bozik", u.getHodnota());
        spojovySeznam.removeLast();
        assertEquals(1, spojovySeznam.getSize());
        assertThrows(IndexOutOfBoundsException.class, () -> spojovySeznam.getByIndex(2));
        u = spojovySeznam.getByIndex(1);
        assertEquals("Jarda", u.getHodnota());
    }

    @Test
    void getSize() {
        spojovySeznam.add("Pavel");
        spojovySeznam.add("Pepa");
        assertNotEquals(4, spojovySeznam.getSize());
    }
}