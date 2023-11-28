package testSubjects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class test1 {
    static WebDriver driver;

    public static void main(String[] args) {

        ArrayList<String> catTextList = new ArrayList<>();
        ArrayList<String> productTextList = new ArrayList<>();

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://bestbangforyourbud.com/store/northern-helm-gore-road");
//
//        System.setProperty("webdriver.chrome.driver", "/Users/selenium/Documents/Code Stuff/code Utils/ChromeDriver/chromedriver 100");
//
//        ChromeOptions op = new ChromeOptions();
//        op.addArguments("window-size=1400,800");
//        op.addArguments("headless");
//        driver = new ChromeDriver(op);

        driver.manage().timeouts().implicitlyWait(1500,TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        By legendCategoryLocator = By.xpath("//div[@style='font-size: 130%; text-align: center;']/a");

        List<WebElement> catLists = driver.findElements(legendCategoryLocator);
        int size = catLists.size();
//        System.out.println(size-1);

        for(int i = 0; i<=size-1; i++){
            String text = driver.findElement(By.xpath("//a[@id='cat"+i+"']//following-sibling::h3")).getText();
            catTextList.add(text);
        }

        catTextList.forEach(System.out::println);

        for(int j = 0 ; j <= catTextList.size()-1; j++ ){
            String categoryFromArraylist = catTextList.get(j);

            List<WebElement> productEles = driver.findElements(By.xpath("//h3[text()='"+categoryFromArraylist+"']//parent::div//following-sibling::div/table//tbody/tr"));

            int productPerCategory = productEles.size();
            System.out.println(productPerCategory);

            for(WebElement ele: productEles){
                String productText = ele.getText();

                productTextList.add(productText);
            }
        }

//        System.out.println(productTextList.size());

        driver.quit();

    }

    //locator for categories: //div[@style='font-size: 130%; text-align: center;']/a

    // locator for specified category products - //h3[text()='Concentrate']//parent::div//following-sibling::div/table//tbody/tr




}
