package NorthernHelm;

import BaseClass.base;
import Utility.util;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class oshawaTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Northern Helm/OshawaPriceAuto.xlsx";

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
            // Northern Helm ( 9 Wentworth St W , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-oshawa", "NORTHERN HELM (9 Wentworth St W , Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // Purple Moose Cannabis ( 575 Laval Drive, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/oshawa", "PURPLE MOOSE (575 Laval Drive, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke - Oshawa - 400 King St W ( 400 King St W, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/tokyo-smoke-oshawa-king-st", "TOKYO SMOKE(400 King St W, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // Nature's Canopy House ( 22 Stevenson Rd S , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/nature-s-canopy-house-oshawa", "NATURES CANOPY (22 Stevenson Rd S, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // Northern Tokes ( 474 Simcoe St S , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-tokes-oshawa", "NORTHERN TOKES (474 Simcoe St S, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // Canna Buzz Inc. ( 142 Simcoe St South, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/canna-buzz-inc", "CANNA BUZZ INC (142 Simcoe St South, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // The Peace Pipe ( 31 Celina St , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-peace-pipe-oshawa", "THE PEACE PIPE (31 Celina St, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // Old West Cannabis Company ( 215 King St E , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/old-west-cannabis-company", "OLD WEST CANNABIS COMPANY (215 King St E, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // Phoenix Cannabis ( 12 Simcoe St S , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/phoenix-cannabis", "PHOENIX CANNABIS (12 Simcoe St S , Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // The 420 Store ( 14 Ontario St , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-420-store-oshawa", "THE 420 STORE (14 Ontario St , Oshawa)");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
