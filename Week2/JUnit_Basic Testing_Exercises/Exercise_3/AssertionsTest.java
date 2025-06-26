package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertEquals() {
        assertEquals(10, 5 + 5);
    }

    @Test
    public void testAssertTrue() {
        assertTrue("Should be true", 10 > 5);
    }

    @Test
    public void testAssertFalse() {
        assertFalse("Should be false", 5 > 10);
    }

    @Test
    public void testAssertNull() {
        String name = null;
        assertNull("Should be null", name);
    }

    @Test
    public void testAssertNotNull() {
        String name = "JUnit";
        assertNotNull("Should not be null", name);
    }

    @Test
    public void testAssertSame() {
        String s1 = "hello";
        String s2 = "hello";
        assertSame("Should refer to the same object", s1, s2);
    }

    @Test
    public void testAssertNotSame() {
        String s1 = new String("hello");
        String s2 = new String("hello");
        assertNotSame("Should not refer to the same object", s1, s2);
    }
}
