package tests.day13_crossBrowserTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReausableMethods;
import utilities.TestBaseCross;

public class C01_PozitifLoginTestiCross extends TestBaseCross {
    @Test(groups = "smoke")
    public void pozitifLoginTesti(){

        driver.get(ConfigReader.getProperty("qdUrl"));
        WebElement ilkLogin= driver.findElement(By.linkText("Log in"));
        ilkLogin.click();

        WebElement emailKutusu= driver.findElement(By.id("login-email"));
        emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));

        WebElement passwordKutusu= driver.findElement(By.id("login-password"));
        passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));

        WebElement loginButonu= driver.findElement(By.xpath("//button[text()='Login']"));
        loginButonu.click();

        WebElement basariliGirisElementi= driver.findElement(By.xpath("//a[text()=]"));
        Assert.assertTrue(basariliGirisElementi.isDisplayed());

        Driver.closeDriver();
}
}
