package testSubjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class quickFix {

    public WebDriver driver;

    private ArrayList<String> productNameList = new ArrayList<>();
    private ArrayList<String> productPriceList = new ArrayList<>();


    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/Code Stuff/code Utils/ChromeDriver/chromedriver 119");

        driver = new ChromeDriver();
        driver.get("https://bestbangforyourbud.com/store/spiritleaf-kingston");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
    }

    @Test
    public void findSkuLocatator() throws InterruptedException {

        WebDriverWait wait;
        wait = new WebDriverWait(driver, 5);


        By searchBar = By.id("SearchBox");

            //send location keys
            WebElement element = driver.findElement(searchBar);
            element.sendKeys("1340 danforth road");
            element.sendKeys(Keys.ENTER);

            //click search button
            driver.findElement(By.xpath("//button[@class='btn btn-primary btn-shadow']")).click();

            Thread.sleep(3000);

            //get products and put in list
            By products = By.xpath("//tbody/tr/td[1]");
        List<WebElement> productEleList = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(products)));

            for (WebElement prodLoop : productEleList) {
                String prodName = prodLoop.getText();
                productNameList.add(prodName);

            }

            //print list
            for (int i = 0; i < productNameList.size() - 1; i++) {
                System.out.println(productNameList.get(i));

            }

        }



    @AfterClass
    public void driverQuit() throws InterruptedException {
        driver.quit();
    }
}