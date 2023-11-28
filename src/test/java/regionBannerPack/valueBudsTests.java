package regionBannerPack;

import BaseClass.base;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class valueBudsTests extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Banner SKU List/Value Buds Regional SKU List.xlsx";

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

          // Value Buds Niagara Falls ( 3714 Portage Road, Niagara Falls, ON )
           utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/value-buds-niagara-falls", "Niagara Falls ( 3714 Portage Road, Niagara Falls, ON )");
           utility.makeEmptyColumn(xlsLocation);

            // Value Buds Burlington ( 1235 Fairview Street, Burlington, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/value-buds-maple-mews", "Burlington ( 1235 Fairview Street, Burlington, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Value Buds Brampton ( 100 Peel Centre Drive, Brampton, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/value-buds-bramalea-city-centre", "Brampton ( 100 Peel Centre Drive, Brampton, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Value Buds Toronto ( 535 Queen Street West, Toronto, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/value-buds-queen-street-west", "Value Buds Toronto ( 535 Queen Street West, Toronto, ON )");
            utility.makeEmptyColumn(xlsLocation);



        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
