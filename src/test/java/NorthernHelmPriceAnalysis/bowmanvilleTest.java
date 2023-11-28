package NorthernHelmPriceAnalysis;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class bowmanvilleTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/BCOpriceAnalysis.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            //Bowmanville

            // Northern Helm ( Durham Regional Hwy 2 , Bowmanville )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-bowmanville", "NORTHERN HELM (Durham Regional Hwy 2 , Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            // Shiny Bud ( 191 Church Street, Bowmanville )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/shiny-bud-bowmanville-191", "SHINY BUD (191 Church Street, Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            // Speakeasy Bowmanville (21 King Street West, Bowmanville)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/speakeasy-bowmanville", "SPEAK EASY (21 King Street West, Bowmanville)");
            utility.makeEmptyColumn(xlsLocation);

            //https://dutchie.com/dispensary/central-plains-cannabis
            // Central Plains Cannabis ( 34 Beaver Street North, Newcastle )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/central-plains-cannabis-newcastle", "CENTRAL PLAINS (34 Beaver Street North, Newcastle)");
            utility.makeEmptyColumn(xlsLocation);

           // https://dutchie.com/dispensary/northern-helm-courtice
            // Northern Helm ( 1414 King St E , Courtice )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-courtice", "NORTHERN HELM (1414 King St E , Courtice)");
            utility.makeEmptyColumn(xlsLocation);

            // https://dutchie.com/dispensary/cannabis-xpress-clarington
            // CANNABIS XPRESS (Hampton) ( 1648 Taunton Rd , Hampton )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cannabis-xpress-hampton", "CANNABIS XPRESS (Hampton) ( 1648 Taunton Rd , Hampton )");
            utility.makeEmptyColumn(xlsLocation);

            // https://dutchie.com/dispensary/budgetbud-oshawa-650
            // BudgetBud ( 650 King Street East, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/budgetbud-oshawa-650", "BudgetBud ( 650 King Street East, Oshawa )");
            utility.makeEmptyColumn(xlsLocation);

            // https://dutchie.com/dispensary/fika-oshawa
            // Fika ( 1445 Harmony Road North, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/fika-oshawa-n", "Fika ( 1445 Harmony Road North, Oshawa )");
            utility.makeEmptyColumn(xlsLocation);

            // https://dutchie.com/dispensary/kryptonite-cannabis
            // Kryptonite Cannabis ( 555 Rossland Road East, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/kryptonite-cannabis-oshawa", "Kryptonite Cannabis ( 555 Rossland Road East, Oshawa )");
            utility.makeEmptyColumn(xlsLocation);

            // https://dutchie.com/dispensary/northern-helm-oshawa
            // Northern Helm ( 9 Wentworth Street West, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-oshawa", "Northern Helm ( 9 Wentworth Street West, Oshawa )");
            utility.makeEmptyColumn(xlsLocation);




        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
