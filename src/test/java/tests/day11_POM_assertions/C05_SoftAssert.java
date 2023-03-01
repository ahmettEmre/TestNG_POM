package tests.day11_POM_assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_SoftAssert {
    @Test
    public void amazonTesti (){

        //amazon anasayfaya gidip, dogru sayfaya gittigimizi dogrulayin
        AmazonPage amazonPage=new AmazonPage();
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedIcerik),"Expected iceriyor mu?");


        //nutella icin arama yapip, sonuclarinin nutella icerdigini dogrulayin



        //ilk urune tiklayip, urun isminde Nutella gectigini dogrulayin


        softAssert.assertAll();
        Driver.closeDriver();

    }
}
