package baseTest;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver = new ChromeDriver();
    @BeforeAll
    public void setup(){
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    }
    @BeforeEach
    public void start() {
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
    public void clear() {
        driver.manage().deleteAllCookies();
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }
}
