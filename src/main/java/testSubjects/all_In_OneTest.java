package testSubjects;

import excelReader.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class all_In_OneTest {

    static WebDriver driver;
    static ArrayList<String> productNameList = new ArrayList<>();
    static ArrayList<String> productPriceList = new ArrayList<>();

    static Xls_Reader reader;
    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Northern Helm/OttawaPriceAuto.xlsx";
    static String sheetNameDate = "April 14, 2022";

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        createSheet(xlsLocation);

        getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/dutch-love-ottawa-merivale", "DUTCH LOVE");
        makeEmptyColumn(xlsLocation);

        getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-baseline", "NORTHERN HELM");
        makeEmptyColumn(xlsLocation);

        getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-hog-s-back", "SPIRIT LEAF");
        makeEmptyColumn(xlsLocation);

        getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/stash-co-merivale-road", "STASH N CO");

        driver.quit();

    }

    public static void createSheet(String xlsLocation) {

        reader = new Xls_Reader(xlsLocation);

        if (reader.isSheetExist(sheetNameDate) != true) {
            reader.addSheet(sheetNameDate);
        } else {
            System.out.println("Most likely sheet already exists or something else is wrong");
        }

    }

    public static void makeEmptyColumn(String xlsLocation) {
        reader = new Xls_Reader(xlsLocation);
        reader.addColumn(sheetNameDate, "");
    }

    public static void getProductAndPrice(String xlsLocation, String linkToStore, String storeNameForColumns) {

        driver.get(linkToStore);

        By productLocator = By.xpath("//tbody/tr/td[1]");
        By priceLocator = By.xpath("//tbody/tr/td[3]");

        WebDriverWait wait = new WebDriverWait(driver, 5);

        List<WebElement> productEleList = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(productLocator)));
        List<WebElement> priceEleList = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(priceLocator)));

        int productSize = productEleList.size();
        int priceSize = priceEleList.size();

        for (WebElement productEleLoop : productEleList) {
            String productNames = productEleLoop.getText();
            productNameList.add(productNames);

        }

        for (WebElement priceEleLoop : priceEleList) {
            String productNames = priceEleLoop.getText();
            productPriceList.add(productNames);

        }

        for (int i = 0; i <= priceSize - 1; i++) {
            System.out.println(productNameList.get(i) + " : " + productPriceList.get(i));
        }

        reader = new Xls_Reader(xlsLocation);

        reader.addColumn(sheetNameDate, storeNameForColumns + " Product Name");
        reader.addColumn(sheetNameDate, storeNameForColumns + " Product Price");

        for (int j = 0; j <= productNameList.size() - 1; j++) {

            reader.setCellData(sheetNameDate, storeNameForColumns + " Product Name", j + 2, productNameList.get(j));
            reader.setCellData(sheetNameDate, storeNameForColumns + " Product Price", j + 2, productPriceList.get(j));

        }

        productNameList.clear();
        productPriceList.clear();

    }
}