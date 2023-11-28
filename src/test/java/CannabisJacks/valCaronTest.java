package CannabisJacks;

import BaseClass.base;
import Utility.util;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class valCaronTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Cannabis Jacks/ValCaronPriceAuto.xlsx";

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

            // Cannabis Jacks - Val Caron ( 3020 Old Highway 69, Greater Sudbury ) roughly around 0.2km
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cannabis-jacks-val-caron", "CANNABIS JACKS (3020 Old Highway 69, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

            // Happy Life ( 3045 Old Highway 69, Greater Sudbury ) betweem 0.7 - 0.9 km
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/val-caron", "HAPPY LIFE (3045 Old Highway 69, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

            // Miss Jones - Val Caron ( 3140 Old Highway 69, Greater Sudbury )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/miss-jones-val-caron", "MISS JONES (3140 Old Highway 69, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

            // Pop's Cannabis (5118 Old Hwy 69 , Greater Sudbury)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/pop-s-cannabis-hanmer", "POPS CANNABIS (5118 Old Hwy 69 , Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

            // Grassroots Co ( 1113 Lasalle Blvd , Greater Sudbury )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/grassroots-co", "GRASSROOTS (1113 Lasalle Blvd , Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

            // Bananas Cannabis ( 1855 Lasalle Boulevard, Greater Sudbury )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/bananas-cannabis-sudbury", "BANANAS CANNABIS (1855 Lasalle Boulevard, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

            // Clover Cannabis ( 450 Notre Dame Avenue, Greater Sudbury )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/sudbury", "CLOVER CANNABIS (450 Notre Dame Avenue, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

           // Happy Life ( 1021 Kingsway, Greater Sudbury )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/happy-life", "HAPPY LIFE (1021 Kingsway, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

            // Highlife (1299 Marcus Drive, Greater Sudbury)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/highlife", "HIGH LIFE (1299 Marcus Drive, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

            // Lost Lake (42 Lorne Street, Greater Sudbury)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/lost-lake-0d32a843-19a1-406e-bd83-fb89d2407186", "LOST LAKE (42 Lorne Street, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}