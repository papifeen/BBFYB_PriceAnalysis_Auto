package CannabisJacks;

import BaseClass.base;
import Utility.util;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class timminsTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Cnb Jacks Price Comp Analysis/TimminsPriceAnalysis.xlsx";

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

            // Cannabis Jacks - Timmins ( 1869 Riverside Dr , Timmins )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cannabis-jacks-timmins-cd14018b-8dc7-4644-99ea-3e6f8609989b", "CANNABIS JACKS (1869 Riverside Dr , Timmins)");
            utility.makeEmptyColumn(xlsLocation);

            // Miss Jones - Timmins - Golden City ( 2125 Riverside Dr Unit 5a, Timmins )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/miss-jones-timmins-golden-city", "MISS JONES (2125 Riverside Dr Unit 5a, Timmins)");
            utility.makeEmptyColumn(xlsLocation);

            // Roll N Rock Cannabis Co. Timmins - (993 Riverside Dr , Timmins)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/roll-n-rock-cannabis-co-timmins", "ROCK N ROLL (993 Riverside Dr , Timmins)");
            utility.makeEmptyColumn(xlsLocation);

            // Casabliss Cannabis ( 82 3rd Ave , Timmins )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/casabliss-cannabis", "CASA BLISS (82 3rd Ave , Timmins)");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions Cannabis ( 425 Algonquin Blvd E , Timmins )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/sessions-cannabis-timmins", "SESSIONS (425 Algonquin Blvd E , Timmins)");
            utility.makeEmptyColumn(xlsLocation);

            //True North Cannabis - Timmins Third Ave ( 214 3rd Ave , Timmins )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/true-north-cannabis-timmins-third-ave", "TRUE NORTH CANNABIS (214 3rd Ave , Timmins)");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}