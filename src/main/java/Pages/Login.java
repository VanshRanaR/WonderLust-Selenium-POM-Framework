package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    private static WebElement element = null;
    public static WebElement login(WebDriver driver)
    {
        element = driver.findElement(By.linkText("Login"));
                return element;
    }
    public  static WebElement click (WebDriver driver){
        element = driver.findElement(By.id("username"));
        return element;
    }
    public  static WebElement password (WebDriver driver){
        element = driver.findElement(By.id("password"));
        return element;
    }
    public  static WebElement button (WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div/div/div/div/div/form/div[3]/button"));
        return element;
    }

}
