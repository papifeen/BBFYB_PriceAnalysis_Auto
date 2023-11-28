package regionBannerPack;

import BaseClass.base;
import Utility.utilRe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class popsCannabisTests extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Banner SKU List/Pops Cnb Regional SKU List.xlsx";

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

          // Pops Cannabis Kirkland Lake ( 150 Government Road West, Kirkland Lake, ON )
           utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/pop-s-cannabis-kirkland-lake", "Kirkland Lake ( 150 Government Road West, Kirkland Lake, ON )");
           utility.makeEmptyColumn(xlsLocation);

            // Pops Cannabis Pickering ( 1822 Whites Road North, Pickering, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/pop-s-cannabis-pickering", "Pickering ( 1822 Whites Road North, Pickering, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Pops Cannabis Sudbury ( 5118 Old Highway 69, Greater Sudbury, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/pop-s-cannabis-hanmer", "Sudbury ( 5118 Old Highway 69, Greater Sudbury, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Pops Cannabis Mount Forest ( 286 Main Street South, Mount Forest, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/pop-s-cannabis-mount-forest", "Mount Forest ( 286 Main Street South, Mount Forest, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Pops Cannabis Sarnia ( 2600 Lakeshore Road, Sarnia, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/pop-s-cannabis-bright-s-grove", "Sarnia ( 2600 Lakeshore Road, Sarnia, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Pops Cannabis Smiths Falls ( 123 Lombard Street, Smiths Falls, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/pop-s-cannabis-smiths-falls", "Smiths Falls ( 123 Lombard Street, Smiths Falls, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Pops Cannabis Courtice ( 1635 Durham Regional Highway 2, Courtice, ON)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/pop-s-cannabis-courtice", "Courtice ( 1635 Durham Regional Highway 2, Courtice, ON)");
            utility.makeEmptyColumn(xlsLocation);

            // Pops Cannabis Tecumseth ( 133 Queen Street South, New Tecumseth, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/pop-s-cannabis-tottenham", "Tecumseth ( 133 Queen Street South, New Tecumseth, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Pops Cannabis Barrie ( 829 Big Bay Point Road, Barrie, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/pop-s-cannabis-big-bay-point", "Barrie ( 829 Big Bay Point Road, Barrie, ON )");
            utility.makeEmptyColumn(xlsLocation);

            // Pops Cannabis Hawkesbury ( 400 Spence Avenue, Hawkesbury, ON )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/en/store/pop-s-cannabis-hawkesbury", "Hawkesbury ( 400 Spence Avenue, Hawkesbury, ON )");
            utility.makeEmptyColumn(xlsLocation);



        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
