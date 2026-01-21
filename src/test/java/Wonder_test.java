import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Wonder_test {

    WebDriver driver;

    @BeforeTest
    public void setup() {
//        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.get("https://wonde-lust.onrender.com/listings");
    }

    @Test
    public void openWebsiteTest() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
