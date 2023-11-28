package Utility;

import excelReader.Xls_Reader;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class utilRe {

    private WebDriver driver;
    private ArrayList<String> productNameList = new ArrayList<>();
    private ArrayList<String> productPriceList = new ArrayList<>();

    private Xls_Reader reader;
    private String xlsLocation;
    private String sheetNameDate = "nov 28, 2023";

    public utilRe(WebDriver driver, String xlsLocation){
        this.driver = driver;
        this.xlsLocation = xlsLocation;

    }
    public Boolean createSheet(String xlsLocation) {

        Boolean b = null;
        reader = new Xls_Reader(xlsLocation);

        if (reader.isSheetExist(sheetNameDate) != true) {
            reader.addSheet(sheetNameDate);
            b = true;
        } else {
//            System.out.println("Most likely sheet already exists or something else is wrong");
            b = false;
        }
        return b;

    }

    public void makeEmptyColumn(String xlsLocation) {
        reader = new Xls_Reader(xlsLocation);
        reader.addColumn(sheetNameDate, "");
    }

    public void getProductAndPrice(String xlsLocation, String linkToStore, String storeNameForColumns) throws InterruptedException {

//        driver.get(linkToStore);
//
//        Thread.sleep(3000);
//
//        //init webdriver wait
//        WebDriverWait wait = new WebDriverWait(driver, 15);
//
//        //locators for search
//        By searchBar = By.id("SearchBox");
//        By searchBtn = By.xpath("//button[@class='btn btn-primary btn-shadow']");
//
//        //wait and send keys to search bar
//        WebElement searchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar));
//        Thread.sleep(3000);
//
//        searchElement.sendKeys("1340 danforth road");
//        searchElement.sendKeys(Keys.ENTER);
//
//        WebElement searchBtnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn));
//        searchBtnElement.click();




        //////////////////////////////

        driver.get(linkToStore);

        // init webdriver wait
        WebDriverWait wait = new WebDriverWait(driver, 15);

        // locators for search
        By searchBar = By.id("SearchBox");
        By searchBtn = By.xpath("//button[@class='btn btn-primary btn-shadow']");

        try {
            // wait for the pop-up button
            WebElement searchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar));
            Thread.sleep(3000);

            searchElement.sendKeys("1340 danforth road");
            searchElement.sendKeys(Keys.ENTER);

            WebElement searchBtnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBtn));
            searchBtnElement.click();

            // Add the actions for the pop-up button
            // ...

        } catch (TimeoutException e) {
            // Continue with the method if the pop-up button is not present
            // Add the actions for cases where the pop-up is not present
            // ...
        }

                                                    ///////////////////////


        Thread.sleep(3000);

        //getting locators for price and product
        By productLocator = By.xpath("//tbody/tr/td[1]");
//      By priceLocator = By.xpath("//tbody/tr/td[3]");
        By priceLocator = By.xpath("//tbody/tr/td[2]");

        List<WebElement> productEleList = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(productLocator)));
//        List<WebElement> productEleList = (driver.findElements(productLocator));

        for (WebElement element : productEleList) {
            wait.until(ExpectedConditions.visibilityOf(element));
            // Perform actions on each visible element
        }

        List<WebElement> priceEleList = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(priceLocator)));
//         List<WebElement> priceEleList = (driver.findElements(priceLocator));

        for (WebElement element : priceEleList) {
            wait.until(ExpectedConditions.visibilityOf(element));
            // Perform actions on each visible element
        }

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

        for (int i = 0; i <= productSize - 1; i++) {
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
