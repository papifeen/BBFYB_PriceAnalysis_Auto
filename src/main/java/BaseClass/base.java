package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base {
    public WebDriver driver;

    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/Code Stuff/code Utils/ChromeDriver/chromedriver 119");

        driver = new ChromeDriver();
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
    }

    @AfterClass
    public void driverQuit() throws InterruptedException {
        driver.quit();
    }
}
