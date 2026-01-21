import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListingsTest extends Wonder_test {

    @Test
    public void testListingsDisplayed() {
        int cards = driver.findElements(By.className("card-img-top")).size();
        Assert.assertTrue(cards > 0, "No listings found");
    }
}
