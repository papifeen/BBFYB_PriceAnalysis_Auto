package regionBannerPack;

import BaseClass.base;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class trueNorthTests extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Banner SKU List/True North Regional SKU List.xlsx";

    @Test
    public void getProductPrices() throws InterruptedException {

        utilRe utility = new utilRe(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            //wait init
            WebDriverWait wait = new WebDriverWait(driver, 15);

            //go to link and note the locator (btn)
            driver.get("https://bestbangforyourbud.com/");
            By btn = By.xpath("//span[@aria-hidden='true']");

            // wait for visibility and click
            WebElement searchElement = wait.until(ExpectedConditions.visibilityOfElementLocated(btn));
            searchElement.click();

            ////////////////////


          // True North Kitchener ( 4396 King Street East, Kitchener, ON )
           utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/true-north-cannabis-kitchener", "Kitchener ( 4396 King Street East, Kitchener, ON )");
           utility.makeEmptyColumn(xlsLocation);

           // True North Hamilton ( 326 Ottawa Street North, Hamilton, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/true-north-cannabis-hamilton", "Hamilton ( 326 Ottawa Street North, Hamilton, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // True North Niagara Falls ( 4695 Queen Street, Niagara Falls, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/true-north-cannabis-niagara-falls", "Niagara Falls ( 4695 Queen Street, Niagara Falls, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // True North North Bay ( 496 Main Street East, North Bay, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/true-north-cannabis-main-st-east", "North Bay ( 496 Main Street East, North Bay, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // True North Oshawa ( 1076 Cedar Street, Oshawa, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/true-north-cannabis-oshawa", "Oshawa ( 1076 Cedar Street, Oshawa, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // True North Sault Ste. Marie ( 898 Queen Street East, Sault Ste. Marie, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/true-north-cannabis-sault-st-marie", "Sault Ste.Marie ( 898 Queen Street East, Sault Ste. Marie, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // True North Sarnia ( 129 Mitton Street South, Sarnia, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/true-north-cannabis-south-sarnia", "Sarnia ( 129 Mitton Street South, Sarnia, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // True North Timmins ( 214 3rd Avenue, Timmins, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/true-north-cannabis-timmins-third-ave", "Timmins ( 214 3rd Avenue, Timmins, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // True North Windsor ( 1368 Ottawa Street, Windsor, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/true-north-cannabis-windsor", "Windsor ( 1368 Ottawa Street, Windsor, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // True North Trenton ( 82 Division Street, Quinte West, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/true-north-cannabis-quinte-west-trenton", "Trenton ( 82 Division Street, Quinte West, ON )");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
