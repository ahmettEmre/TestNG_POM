package tests.day11_POM_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C04_HardAssert_SoftAssert {
    @Test
    public void hardAssertionTesti(){

        Assert.assertTrue(5>8);

        Assert.assertFalse(8==8);

        Assert.assertEquals(5,9);

        Assert.assertNotEquals(6,6);

    }

    @Test
    public void softAssertionTesti(){

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(5>8,"true testi");

        softAssert.assertFalse(8==8,"false testi");

        softAssert.assertEquals(5,9,"equals testi");

        softAssert.assertNotEquals(6,6,"notequals testi");



        softAssert.assertAll();

    }
}
