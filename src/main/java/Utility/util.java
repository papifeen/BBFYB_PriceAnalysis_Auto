package Utility;

import excelReader.Xls_Reader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class util {

    private WebDriver driver;
    private ArrayList<String> productNameList = new ArrayList<>();
    private ArrayList<String> productPriceList = new ArrayList<>();

    private Xls_Reader reader;
    private String xlsLocation;
    private String sheetNameDate = "nov 19, 2023";

    public util (WebDriver driver, String xlsLocation){
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

    public void getProductAndPrice(String xlsLocation, String linkToStore, String storeNameForColumns) {

        driver.get(linkToStore);

        By productLocator = By.xpath("//tbody/tr/td[1]");
//        By priceLocator = By.xpath("//tbody/tr/td[3]");
        By priceLocator = By.xpath("//tbody/tr/td[2]");
        By searchBar = By.id("SearchBox");

        driver.findElement(searchBar).sendKeys("1340 danforth road");
//
        WebDriverWait wait = new WebDriverWait(driver, 5);;
//
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-shadow']")).click();

        wait = new WebDriverWait(driver, 5);



//        List<WebElement> productEleList = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(productLocator)));
        List<WebElement> productEleList = (driver.findElements(productLocator));

//        List<WebElement> priceEleList = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(priceLocator)));
        List<WebElement> priceEleList = (driver.findElements(priceLocator));


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
