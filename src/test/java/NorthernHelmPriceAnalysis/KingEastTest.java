package NorthernHelmPriceAnalysis;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class KingEastTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/OttawaPriceAuto.xlsx";

   // kingston change next analysis /Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/KingstonPriceAnalysis.xlsx
    ///Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/OttawaPriceAuto.xlsx

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            // Northern Helm - King St E - (514 King St E , Toronto)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-king-st-e", "Northern Helm - King St E - (514 King St E , Toronto)");
            utility.makeEmptyColumn(xlsLocation);
//
//            //Canna Cabana - 698 Queen Street East - (698 Queen Street East, Toronto)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/canna-cabana-698-queen-street-east", "Canna Cabana - 698 Queen Street East - (698 Queen Street East, Toronto)\n");
            utility.makeEmptyColumn(xlsLocation);
//
//         //   https://dutchie.com/dispensary/710-kingston
//         //   Value Buds Queen St. East - (728 Queen Street East, Toronto)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/value-buds-queen-st-east", "Value Buds Queen St. East - (728 Queen Street East, Toronto)");
            utility.makeEmptyColumn(xlsLocation);
//
//             https://dutchie.com/stores/tokyo-smoke-kingston-2790-princess
//           //  Fika - Canary - (430 Front Street East, Toronto)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/fika-canary", "Fika - Canary - (430 Front Street East, Toronto)");
            utility.makeEmptyColumn(xlsLocation);
////
//              https://dutchie.com/dispensary/the-herbary-kingston
        //    Bonnefire - Munro - (129 Munro St , Toronto)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/bonnefire-munro", "Bonnefire - Munro - (129 Munro St , Toronto)");
            utility.makeEmptyColumn(xlsLocation);
//
//            //  https://dutchie.com/dispensary/star-buds-amherstview
            //The Green Closet - (439 Parliament Street, Toronto)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-green-closet", "The Green Closet - (439 Parliament Street, Toronto)");
            utility.makeEmptyColumn(xlsLocation);

           // https://dutchie.com/dispensary/710-kingston-west1
            //Spiritleaf - (238 Carlton Street, Toronto)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-cabbagetown", "Spiritleaf - (238 Carlton Street, Toronto)");
            utility.makeEmptyColumn(xlsLocation);

            //Growers Retail - (492 Parliament Street, Toronto)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/growers-retail-parliament", "Growers Retail - (492 Parliament Street, Toronto)");
            utility.makeEmptyColumn(xlsLocation);

            //Sticky Nuggz - (171 Fort York Boulevard, Toronto)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/sticky-nuggz", "Sticky Nuggz - (171 Fort York Boulevard, Toronto)");
            utility.makeEmptyColumn(xlsLocation);





        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
