package NorthernHelm;

import BaseClass.base;
import Utility.util;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class bowmanvilleTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Northern Helm/BowmanvillePriceAuto.xlsx";

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

            // Northern Helm ( Durham Regional Hwy 2 , Bowmanville )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-bowmanville", "NORTHERN HELM (Durham Regional Hwy 2 , Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            // Shiny Bud ( 191 Church Street, Bowmanville )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/shiny-bud-bowmanville-191", "SHINY BUD (191 Church Street, Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            // Speakeasy Bowmanville (21 King Street West, Bowmanville)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/speakeasy-bowmanville", "SPEAK EASY (21 King Street West, Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            // Central Plains Cannabis ( 34 Beaver Street North, Newcastle )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/central-plains-cannabis-newcastle", "CENTRAL PLAINS (34 Beaver Street North, Newcastle)");
            utility.makeEmptyColumn(xlsLocation);

            // Rustic Cannabis ( 122 King Street East, Bowmanville )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/bowmanville-540149ee-a171-4463-a503-b96b1a4b8193", "RUSTIC CANNABIS (122 King Street East, Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            // Spot 420 ( 237 King Street East, Bowmanville )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/bowmanville-c142d52f-079c-411e-bf7a-02ab2efa5e62", "SPOT 420 (237 King Street East, Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            // Northern Helm ( 1414 King St E , Courtice )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-courtice", "NORTHERN HELM (1414 King St E , Courtice)");
            utility.makeEmptyColumn(xlsLocation);

            // Your Local Cannabis ( 45 King Avenue West, Newcastle )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/your-local-cannabis-newcastle", "YOUR LOCAL CANNABIS (45 King Avenue West, Newcastle)");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
