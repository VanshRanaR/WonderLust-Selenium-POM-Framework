package org.example;

import Pages.Login;
import org.openqa.selenium.Beta;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wonder_Test {
    private static WebDriver driver ;
    public static void main(String args [])
    {
        driver = new ChromeDriver();
        driver.get("https://wonde-lust.onrender.com/listings");
        Login.login(driver).click();
        Login.click(driver).sendKeys("22BAI70287");
        Login.password(driver).sendKeys("12");
        Login.button(driver).click();





    }
}
