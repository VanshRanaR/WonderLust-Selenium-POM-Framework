import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends Wonder_test {

    @Test
    public void testPageTitle() {
        String title = driver.getTitle();
        Assert.assertTrue(title.length() > 0, "Title is empty");
    }

    @Test
    public void testPageLoaded() {
        Assert.assertTrue(driver.getPageSource().contains("Listings"),
                "Page not loaded properly");
    }
}
