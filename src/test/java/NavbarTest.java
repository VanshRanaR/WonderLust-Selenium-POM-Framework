import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavbarTest extends Wonder_test {

    @Test
    public void testNavbarVisible() {
        WebElement navbar = driver.findElement(By.tagName("nav"));
        Assert.assertTrue(navbar.isDisplayed(), "Navbar is not visible");
    }

    @Test
    public void testNavbarLinks() {
        int links = driver.findElements(By.cssSelector("nav a")).size();
        Assert.assertTrue(links > 0, "Navbar links missing");
    }
}
