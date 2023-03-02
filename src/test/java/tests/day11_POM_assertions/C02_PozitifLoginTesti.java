package tests.day11_POM_assertions;

import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReausableMethods;

public class C02_PozitifLoginTesti {

    @Test
    public void pozitifLoginTesti(){
        ReausableMethods.bekle(3);

        //qd anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        //login linkine tiklayin
        QdPage qdPage=new QdPage();
        qdPage.ilkLogin.click();

        //gecerli kullanici adi ve password ile giris yapin
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qdPage.loginButonu.click();

        //basarili sekilde giris yapildigini test edin


        Driver.closeDriver();





    }
}
