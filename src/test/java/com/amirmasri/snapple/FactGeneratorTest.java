package com.amirmasri.snapple;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * FactGenerator test class.
 * @author Amir Masri
 */
public class FactGeneratorTest {

    private FactGenerator factGenerator;
    private Fact fact;

    @Before
    public void setUp() {
        factGenerator = new FactGenerator();
    }

    @After
    public void tearDown() {
        factGenerator = null;
        fact = null;
    }

    @Test
    public void generateFactTest() {
        fact = factGenerator.generateFact();
        Assert.assertFalse(fact == null);
        Assert.assertFalse(fact.getId().toString().isEmpty());
        Assert.assertFalse(fact.getDetail().isEmpty());
    }

}
