package regionBannerPack;

import BaseClass.base;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class spiritLeafTests extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Banner SKU List/Spiritleaf Regional SKU List.xlsx";

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


           //Spiritleaf Kingston( 27 Princess St , Kingston )
//           utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-kingston", "SPIRIT LEAF (27 Princess St , Kingston)");
//           utility.makeEmptyColumn(xlsLocation);
//
//            //Spiritleaf Barrie ( 120 Park Place Boulevard, Barrie, ON )
////            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-park-place", "SPIRIT LEAF - Barrie (120 Park Place Boulevard, Barrie, ON)");
////            utility.makeEmptyColumn(xlsLocation);
//
//            //Spiritleaf Brampton( 2456 Queen Street East, Brampton, ON )
////            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-imperial-centre", "SPIRIT LEAF - Brampton (2456 Queen Street East, Brampton, ON)");
////            utility.makeEmptyColumn(xlsLocation);
////
////            //Spiritleaf Downtown Toronto ( 2116 Queen Street East, Toronto, ON )
////            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-beaches", "SPIRIT LEAF - Downtown Toronto (2456 Queen Street East, Brampton, ON)");
////            utility.makeEmptyColumn(xlsLocation);
//
//            //Spiritleaf Hamilton ( 1090 Wilson Street West, Hamilton, ON )
////            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-ancaster", "SPIRIT LEAF Hamilton (1090 Wilson Street West, Hamilton, ON)");
////            utility.makeEmptyColumn(xlsLocation);
//
//            //Spiritleaf Oshawa ( 250 Taunton Road East, Oshawa, ON )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-oshawa", "SPIRIT LEAF Oshawa (250 Taunton Road East, Oshawa, ON)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            //Spiritleaf Kitchener ( 1400 Ottawa Street South, Kitchener, ON )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-sunrise", "SPIRIT LEAF Kitchener ( 1400 Ottawa Street South, Kitchener, ON )");
//            utility.makeEmptyColumn(xlsLocation);
//
//            //Spiritleaf Pickering ( Liverpool Road, Pickering, ON )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-pickering", "SPIRIT LEAF Pickering ( Liverpool Road, Pickering, ON )");
//            utility.makeEmptyColumn(xlsLocation);
//
//            //Spiritleaf St. Catharines ( 400 Scott Street, St. Catharines, ON)
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-st-catharines", "SPIRIT LEAF St. Catharines ( 400 Scott Street, St. Catharines, ON)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            //Spiritleaf Guelph( 492 Edinburgh Road South, Guelph, ON)
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-st-catharines", "SPIRIT LEAF Guelph( 492 Edinburgh Road South, Guelph, ON)");
//            utility.makeEmptyColumn(xlsLocation);



        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
