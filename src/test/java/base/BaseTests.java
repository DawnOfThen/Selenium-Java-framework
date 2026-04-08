package base;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ScreenshotUtil;
import org.junit.jupiter.api.TestInfo;

import java.time.Duration;

public class BaseTests {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    public void tearDown(TestInfo testInfo) {
        if (driver != null) {
            ScreenshotUtil.takeScreenshot(driver, testInfo.getDisplayName());
            driver.quit();
        }
    }
}