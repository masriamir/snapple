package com.amirmasri.snapple;

import org.junit.Assert;
import org.junit.Test;

/**
 * Util test class.
 * @author Amir Masri
 */
public class UtilTest {

    @Test
    public void generateIdTest() {
        for (int i = 0; i < 1000000; ++i) {
            int id = Util.generateId();
            Assert.assertFalse(id == 0);
            Assert.assertFalse(id >= 990);
            Assert.assertFalse(id > 497 && id < 650);
        }
    }

    @Test
    public void getFactDetailTest() {
        for (int i = 0; i < 10; ++i) {
            String detail = Util.getFactDetail(Util.generateId());
            Assert.assertFalse(detail.isEmpty());
        }
    }

}
