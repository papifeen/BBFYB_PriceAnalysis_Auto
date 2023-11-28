package NorthernHelmPriceAnalysis;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class danforthTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Northern Helm/DanforthPriceAuto.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

//            // Northern Helm Northern Helm ( 1338 Danforth Ave , Toronto )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-danforth", "NORTHERN HELM Northern Helm (1338 Danforth Ave , Toronto)");
            utility.makeEmptyColumn(xlsLocation);

            // Canvas ( 730 Danforth Avenue, Toronto )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/canvas-danforth", "CANVAS (730 Danforth Avenue, Toronto)");
            utility.makeEmptyColumn(xlsLocation);

            //Tokyo Smoke - 715 Danforth ( 715 Danforth Ave, Toronto )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/tokyo-smoke-715-danforth-at-pape", "TOKYO SMOKE (715 Danforth Ave, Toronto)");
            utility.makeEmptyColumn(xlsLocation);

            //Growers Retail ( 1021 Pape Avenue, Toronto )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/growers-retail-pape-village-7f18087c-4af9-46f0-a721-5c70772633fc", "GROWERS RETAIL (1021 Pape Avenue, Toronto)");
            utility.makeEmptyColumn(xlsLocation);

            //Budside ( 2430 Danforth Avenue, Toronto )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/budside", "Budside ( 2430 Danforth Avenue, Toronto )");
            utility.makeEmptyColumn(xlsLocation);

          //  The Neighbourhood Joint ( 1064 Coxwell Ave , Toronto )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-neighbourhood-joint-east-york", "NEIGHBOURHOOD JOINT (1064 Coxwell Ave , Toronto)");
//            utility.makeEmptyColumn(xlsLocation);

            //Two Cats Cannabis ( 1014 Gerrard St E , Toronto )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/two-cats-cannabis", "TWO CATS CANNABIS (1014 Gerrard St E , Toronto)");
//            utility.makeEmptyColumn(xlsLocation);

            //Wonderland Cannabis ( 1578 Queen Street East, Toronto )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/wonderland-cannabis", "WONDERLAND CANNABIS (1578 Queen Street East, Toronto)");
            utility.makeEmptyColumn(xlsLocation);

            //Tokyo Smoke - East York - Pape Ave ( 1031 Pape Ave, Toronto )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/tokyo-smoke-east-york-pape-ave", "TOKYO SMOKE (1031 Pape Ave, Toronto)");
//            utility.makeEmptyColumn(xlsLocation);

           // AlphaBud Cannabis Company ( 1186 Woodbine Avenue, Toronto )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/east-york", "AlphaBud Cannabis Company ( 1186 Woodbine Avenue, Toronto )");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
