package regionBannerPack;

import BaseClass.base;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tokyoSmokeTests extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Banner SKU List/Tokyo Smoke Regional SKU List.xlsx";

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

          // Tokyo Smoke Thunder Bay ( 1082 Memorial Avenue, Thunder Bay, ON )
           utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/tokyo-smoke-thunder-bay", "Thunder Bay ( 1082 Memorial Avenue, Thunder Bay, ON )");
           utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke Toronto ( 333 Yonge Street, Toronto, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/tokyo-smoke-yonge-dundas-square-333-yonge", "Toronto ( 333 Yonge Street, Toronto, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke Sarnia ( 1380 London Road, Sarnia, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/tokyo-smoke-sarnia-lambton-mall", "Sarnia ( 1380 London Road, Sarnia, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke Hamilton ( 2257 Rymal Road East, Hamilton, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/tokyo-smoke-stoney-creek", "Hamilton ( 2257 Rymal Road East, Hamilton, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke Wasaga Beach ( 1890 Mosley Street, Wasaga Beach, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/tokyo-smoke-wasaga-beach-mosley", "Wasaga Beach ( 1890 Mosley Street, Wasaga Beach, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke Oshawa ( 400 King Street West, Oshawa, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/tokyo-smoke-oshawa-king-st", "Oshawa ( 400 King Street West, Oshawa, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke Kingston ( 2790 Princess Street, Kingston, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/tokyo-smoke-kingston-2790-princess", "Kingston ( 2790 Princess Street, Kingston, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke Ottawa ( 1000 Wellington Street West, Ottawa, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/tokyo-smoke-ottawa-wellington", "Ottawa ( 1000 Wellington Street West, Ottawa, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke North Bay ( 390 Lakeshore Drive, North Bay, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/tokyo-smoke-north-bay", "North Bay ( 390 Lakeshore Drive, North Bay, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke Hanover ( 895 Tenth Street, Hanover, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/tokyo-smoke-hanover-10th", "Hanover ( 895 Tenth Street, Hanover, ON )");
            utility.makeEmptyColumn(xlsLocation);






        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
