package main.java.com.my.kargo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class mainTest {
    @Test
    public void shouldReturnTrueForABCAndBCD() {
        assertTrue(main.hasOneToOneMapping("abc", "bcd"));
    }

    @Test
    public void shouldReturnTrueForBARAndFOO() {
        assertTrue(main.hasOneToOneMapping("bar", "foo"));
    }

    @Test
    public void shouldReturnFalseForFOOAndBAR() {
        assertFalse(main.hasOneToOneMapping("foo", "bar"));
    }

    @Test
    public void shouldOnlyAnalyzeAlphabets() {
        assertFalse(main.hasOneToOneMapping("fo;o", "b#ar"));
    }

    @Test
    public void shouldReturnFalseIfAStringIsEmpty() {
        assertFalse(main.hasOneToOneMapping("fo;o", ""));
    }
}