package tests.day11_POM_assertions;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PozitifLoginTesti {

    @Test
    public void pozitifLoginTesti(){

        //qd anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        //login linkine tiklayin




    }
}
