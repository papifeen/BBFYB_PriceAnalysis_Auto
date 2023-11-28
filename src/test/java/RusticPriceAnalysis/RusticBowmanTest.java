package RusticPriceAnalysis;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class RusticBowmanTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Rustic Price Comp Analysis/RusticPriceAuto.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            // Rustic Cannabis ( 122 King Street East, Bowmanville )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/bowmanville-540149ee-a171-4463-a503-b96b1a4b8193", "RUSTIC CANNABIS (122 King Street East, Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            // Speakeasy Bowmanville ( 21 King Street West, Bowmanville )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/speakeasy-bowmanville", "SPEAKEASY (21 King Street West, Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            //Shiny Bud (191 Church Street, Bowmanville)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/shiny-bud-bowmanville-191", "SHINY BUD (191 Church Street, Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            //Northern Helm (Highway 2, Bowmanville)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-bowmanville", "NORTHERN HELM (Highway 2, Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            // Your Local Cannabis ( 45 King Avenue West, Newcastle )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/your-local-cannabis-newcastle", "YOUR LOCAL CANNABIS (45 King Avenue West, Newcastle)");
            utility.makeEmptyColumn(xlsLocation);

            //Central Plains Cannabis ( 34 Beaver Street North, Newcastle )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/central-plains-cannabis-newcastle", "CENTRAL PLAINS CANNABIS ( 34 Beaver Street North, Newcastle )");
            utility.makeEmptyColumn(xlsLocation);

            //Northern Helm (1414 King Street East, Courtice)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-courtice", "NORTHERN HELM (1414 King Street East, Courtice)");
            utility.makeEmptyColumn(xlsLocation);

            //CANNABIS XPRESS (Hampton) ( 1648 Taunton Rd , Hampton )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cannabis-xpress-hampton", "CANNABIS XPRESS (1648 Taunton Rd , Hampton)");
            utility.makeEmptyColumn(xlsLocation);

            //BudgetBud (650 King Street East, Oshawa)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/budgetbud-oshawa-650", "Budget Bud (650 King Street East, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
