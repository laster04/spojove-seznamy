package cz.jh.sos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class SpojovySeznamTest {

    private SpojovySeznam spojovySeznam;

    @Before
    public void before() {
        spojovySeznam = new SpojovySeznam();
    }

    @Test
    public void initSeznam150Test() {
        testInitSeznam(150);
    }

    @Test
    public void initSeznam20Test() {
        testInitSeznam(20);
    }

    @Test
    public void iniSeznam300Test() {
        testInitSeznam(300);
    }

    @Test
    public void initSeznamMinusTest() {
        testInitSeznam(-50);
    }

    private void testInitSeznam(int delkaSeznamu) {
        Uzel uzel = spojovySeznam.initSeznam(delkaSeznamu);
        assertNotNull(uzel);
        assertEquals(delkaSeznamu, coutNasledujici(uzel));
    }

    private int coutNasledujici(Uzel uzel) {
        int count = 1;

        while(uzel.getNasledujici() != null) {
            count++;
            uzel = uzel.getNasledujici();
        }
        return count;
    }


}