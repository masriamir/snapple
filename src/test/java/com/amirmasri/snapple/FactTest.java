package com.amirmasri.snapple;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Fact test class.
 * Here we only test the constructor.
 * @author Amir Masri
 */
public class FactTest {

    private Fact fact;

    @Before
    public void setUp() {
        fact = new Fact(1, "Test");
    }

    @After
    public void tearDown() {
        fact = null;
    }

    @Test
    public void FactTest() {
        Assert.assertFalse(fact == null);
        Assert.assertEquals(1, fact.getId().intValue());
        Assert.assertEquals("Test", fact.getDetail());
    }

}
