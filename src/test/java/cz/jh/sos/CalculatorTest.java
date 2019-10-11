package cz.jh.sos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void scitani() {
        assertEquals(10, calculator.scitani(5,5));
        assertEquals(2, calculator.scitani(1,1));
        assertEquals(7, calculator.scitani(-5,12));
        assertEquals(10, calculator.scitani(3,7));
        assertEquals(10, calculator.scitani(11,-1));
        assertEquals(10, calculator.scitani(7,3));
    }

    @Test
    void odcitani() {
        assertEquals(10, calculator.odcitani(15,5));
        assertEquals(2, calculator.odcitani(5,3));
        assertEquals(7, calculator.odcitani(2,-5));
        assertEquals(10, calculator.odcitani(25,15));
        assertEquals(-4, calculator.odcitani(2,6));
        assertEquals(13, calculator.odcitani(7,-6));
    }

    @Test
    void nasobeni() {
        assertEquals(75, calculator.nasobeni(15,5));
        assertEquals(15, calculator.nasobeni(5,3));
        assertEquals(-10, calculator.nasobeni(2,-5));
        assertEquals(375, calculator.nasobeni(25,15));
        assertEquals(12, calculator.nasobeni(2,6));
        assertEquals(-42, calculator.nasobeni(7,-6));
    }

    @Test
    void deleni() {
        assertEquals(8, calculator.deleni(40,5));
        assertEquals(6, calculator.deleni(18,3));
        assertEquals(0, calculator.deleni(0, 15));
    }

    @Test
    void deleniZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.deleni(2,0));
    }

    @Test
    void factorial() {
        assertEquals(6, calculator.factorial(3));
        assertEquals(5040, calculator.factorial(7));
        assertEquals(40320, calculator.factorial(8));
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void arraySort() {
        final Integer[] t1 = new Integer[]{3, 5, 6, 8, 11, 33, 56};
        assertEquals(t1, calculator.arraySort(new Integer[]{11, 8, 33, 6, 3, 5, 56}));
        final Integer[] t2 = new Integer[]{4, 8, 9, 11, 80};
        assertEquals(t2, calculator.arraySort(new Integer[]{80, 8, 9, 11, 4}));
    }
}