package tests.day12_xmlFiles;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReausableMethods;

public class C02_ReusableMethodsSwitchingwindows {

    @Test
    public void switchinWindowsTesti(){

        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.

        ReausableMethods.switchToWindow("New Window");

        System.out.println(Driver.getDriver().getTitle());


        //● Sayfadaki textin “New Window” olduğunu doğrulayın.
        //● Bir önceki pencereye geri döndükten sonra sayfa başlığının “The Internet” olduğunu doğrulayın.

        Driver.quitDriver();


    }

}
