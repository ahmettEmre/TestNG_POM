package tests.day12_xmlFiles;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReausableMethods;
import utilities.TestBaseReport;

public class C03_RaporluPozitifLoginTesti extends TestBaseReport {

    @Test
    public void pozitifLoginTesti(){
        extentTest =extentReports.createTest("PozitifLoginTesti","gecerli bilgilerle giris yapilabilmeli");
        ReausableMethods.bekle(3);

        //qd anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        extentTest.info("QD anasayfaya gidildi");

        //login linkine tiklayin
        QdPage qdPage=new QdPage();
        qdPage.ilkLogin.click();
        extentTest.info("Ilk login linkine tiklandi");

        //gecerli kullanici adi ve password ile giris yapin
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername")); extentTest.info("gecerli email yazildi");
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword")); extentTest.info("gecerli password yazildi");
        qdPage.loginButonu.click(); extentTest.info("login butonuna basildi");

        //basarili sekilde giris yapildigini test edin
    }
}
