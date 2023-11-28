package CannabisJacks;

import BaseClass.base;
import Utility.util;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class northBayTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Cannabis Jacks/NorthBayPriceAuto.xlsx";

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

            // Cannabis Jacks - North Bay ( 1881 Cassells St , North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cannabis-jacks-north-bay", "CANNABIS JACKS (1881 Cassells St , North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // One Plant (1899 Algonquin Avenue, North Bay)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/one-plant-c23574fd-282d-4ab5-9735-abb8f3c72714", "ONE PLANT (1899 Algonquin Avenue, North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // Miss Jones - McKeown Outpost ( 955 Mckeown Avenue, North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/miss-jones-mckeown-outpost", "MISS JONES (955 Mckeown Avenue, North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // Happy Life ( 42 Lakeshore Drive, North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/happy-life-north-bay-lakeshore", "HAPPY LIFE (42 Lakeshore Drive, North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke ( 390 Lakeshore Dr , North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/tokyo-smoke-north-bay", "TOKYO SMOKE (390 Lakeshore Dr , North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // King of Queens - North Bay ( 176 Oak St W , North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/king-of-queens-north-bay", "KING OF QUEENS (176 Oak St W , North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // True North Cannabis - Main St. East ( 496 Main St E , North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/true-north-cannabis-main-st-east", "TRUE NORTH CANNABIS (496 Main St E , North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // True North Cannabis - Algonquin Ave ( 1720 Algonquin Avenue, North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/true-north-cannabis-algonquin-ave", "TRUE NORTH CANNABIS (1720 Algonquin Avenue, North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // Cantopia Cannabis Co. - North Bay ( 45 Lakeshore Drive, North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cantopia-cannabis-co-north-bay", "CANTOPIA CANNABIS CO (45 Lakeshore Drive, North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // Miss Jones - Lakeshore Outpost ( 300 Lakeshore Dr #727, North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/miss-jones-lakeshore-outpost", "MISS JONES (300 Lakeshore Dr #727, North Bay)");
            utility.makeEmptyColumn(xlsLocation);




        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
