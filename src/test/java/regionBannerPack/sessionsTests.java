package regionBannerPack;

import BaseClass.base;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class sessionsTests extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Banner SKU List/Sessions Regional SKU List.xlsx";

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


          // Sessions Aurora( 15480 Bayview Avenue, Aurora, ON )
           utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/sessions-aurora", "Sessions Aurora( 15480 Bayview Avenue, Aurora, ON )");
           utility.makeEmptyColumn(xlsLocation);

           // Sessions Cambridge( 101 Holiday Inn Drive, Cambridge, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/sessions-cannabis-hespeler", "Sessions Cambridge( 101 Holiday Inn Drive, Cambridge, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions Hamilton ( 675 Rymal Road East, Hamilton, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/sessions-cannabis-rymal", "Hamilton ( 675 Rymal Road East, Hamilton, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions Keswick ( 443 The Queensway South, Georgina, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/sessions-keswick", "Keswick ( 443 The Queensway South, Georgina, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions Kitchener ( 525 Highland Road West, Kitchener, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/sessions-kitchener", "Kitchener ( 525 Highland Road West, Kitchener, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions Oshawa ( 1 Warren Avenue, Oshawa, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/sessions-cannabis-oshawa", "Oshawa ( 1 Warren Avenue, Oshawa, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions Ottawa ( 603 Somerset Street West, Ottawa, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/sessions-somerset-at-percy", "Ottawa ( 603 Somerset Street West, Ottawa, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions Timmins ( 425 Algonquin Boulevard East, Timmins, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/sessions-cannabis-timmins", "Timmins ( 425 Algonquin Boulevard East, Timmins, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions Toronto ( 39 Abraham Welsh Road, Toronto, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/sessions-humberlea", "Toronto ( 39 Abraham Welsh Road, Toronto, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions Waterloo ( 573 King Street North, Waterloo, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/sessions-king-at-northfield", "Waterloo ( 573 King Street North, Waterloo, ON )");
            utility.makeEmptyColumn(xlsLocation);






        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
