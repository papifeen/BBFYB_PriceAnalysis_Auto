package NorthernHelmPriceAnalysis;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class kingstonTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/OttawaPriceAuto.xlsx";

   // kingston change next analysis /Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/KingstonPriceAnalysis.xlsx
    ///Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/OttawaPriceAuto.xlsx

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            // Northern Helm ( 225 Gore Rd , Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-gore-road", "NORTHERN HELM (225 Gore Rd , Kingston)");
            utility.makeEmptyColumn(xlsLocation);
//
//            //Spiritleaf ( 27 Princess St , Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-kingston", "SPIRIT LEAF (27 Princess St , Kingston)");
            utility.makeEmptyColumn(xlsLocation);
//
//         //   https://dutchie.com/dispensary/710-kingston
//         //   710 Kingston ( 471 Princess St , Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/710-kingston", "710 KINGSTON (471 Princess St , Kingston)");
            utility.makeEmptyColumn(xlsLocation);
//
//             https://dutchie.com/stores/tokyo-smoke-kingston-2790-princess
//           //  Tokyo Smoke ( 2790 Princess Street, Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/tokyo-smoke-kingston-2790-princess", "Tokyo Smoke ( 2790 Princess Street, Kingston )");
            utility.makeEmptyColumn(xlsLocation);
////
//              https://dutchie.com/dispensary/the-herbary-kingston
        //    Inspired Cannabis ( 246 Princess Street, Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/kingston", "Inspired Cannabis ( 246 Princess Street, Kingston )");
            utility.makeEmptyColumn(xlsLocation);
//
//            //  https://dutchie.com/dispensary/star-buds-amherstview
            //Mary J's Cannabis - Kingston ( 154 Division Street, Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/mary-j-s-cannabis-kingston-fef762d8-5ee1-4a61-8edf-58cef35a6066", "Mary J's Cannabis - Kingston ( 154 Division Street, Kingston )");
            utility.makeEmptyColumn(xlsLocation);

           // https://dutchie.com/dispensary/710-kingston-west1
            //One Plant ( , Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/one-plant-2bfd2988-cb1b-4519-9ba6-5703001000eb", "One Plant ( , Kingston )");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
