package NorthernHelm;

import BaseClass.base;
import Utility.util;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class kingstonTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Northern Helm/KingstonPriceAuto.xlsx";

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

//            // Northern Helm ( 225 Gore Rd , Kingston )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-gore-road", "NORTHERN HELM (225 Gore Rd , Kingston)");
//            utility.makeEmptyColumn(xlsLocation);

            //Spiritleaf ( 27 Princess St , Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-kingston", "SPIRIT LEAF (27 Princess St , Kingston)");
            utility.makeEmptyColumn(xlsLocation);

//            //https://dutchie.com/dispensary/710-kingston
//            //710 Kingston ( 471 Princess St , Kingston )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/710-kingston", "710 KINGSTON (471 Princess St , Kingston)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            //https://dutchie.com/dispensary/the-herbary-kingston
//            //The Herbary ( 1650 Bath Rd , Kingston )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-herbary-kingston", "THE HERBARY (1650 Bath Rd , Kingston)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // https://dutchie.com/dispensary/710-kingston-west1
//            //710 Kingston - West ( 1057 Midland Ave , Kingston )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/710-kingston-west", "710 KINGSTON (1057 Midland Ave , Kingston)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // https://dutchie.com/stores/tokyo-smoke-kingston-2790-princess
//            // Tokyo Smoke ( 2790 Princess Street, Kingston )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/tokyo-smoke-kingston-2790-princess", "Tokyo Smoke ( 2790 Princess Street, Kingston )");
//            utility.makeEmptyColumn(xlsLocation);
//
//            //  https://dutchie.com/dispensary/star-buds-amherstview
//            //Star Buds (Amherstview) ( 4507 Bath Road, Amherstview )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/star-buds-amherstview", "Star Buds (Amherstview) ( 4507 Bath Road, Amherstview )");
//            utility.makeEmptyColumn(xlsLocation);



        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
