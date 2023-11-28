package WeeklyRuns.NorthernHelm;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class kingstonTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Northern Helm/KingstonPriceAuto.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            // Northern Helm ( 225 Gore Rd , Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-gore-road", "NORTHERN HELM (225 Gore Rd , Kingston)");
            utility.makeEmptyColumn(xlsLocation);

            //for some reason this store does not show up on BBYFB site. Do manually if needed.

//            //Calyx + Trichomes Cannabis ( 1206 Highway 15, Kingston )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/calyx-trichomes-east", "CALYX AND TRICHOMES (1206 Highway 15, Kingston)");
//            utility.makeEmptyColumn(xlsLocation);

            //Spiritleaf ( 27 Princess St , Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-kingston", "SPIRIT LEAF (27 Princess St , Kingston)");
            utility.makeEmptyColumn(xlsLocation);

            //Inspired Cannabis ( 246 Princess Street, Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/kingston", "INSPIRED CANNABIS (246 Princess Street, Kingston)");
            utility.makeEmptyColumn(xlsLocation);

            //710 Kingston ( 471 Princess St , Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/710-kingston", "710 KINGSTON (471 Princess St , Kingston)");
            utility.makeEmptyColumn(xlsLocation);

            //Cannabis Bazaar - Kingston ( 1126 Sydenham Rd, Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cannabis-bazaar-kingston", "CANNABIS BAZAAR (1126 Sydenham Rd, Kingston)");
            utility.makeEmptyColumn(xlsLocation);

            //One Plant ( a005 770, Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/one-plant-2bfd2988-cb1b-4519-9ba6-5703001000eb", "ONE PLANT (a005 770, Kingston)");
            utility.makeEmptyColumn(xlsLocation);

            //The Herbary ( 1650 Bath Rd , Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-herbary-kingston", "THE HERBARY (1650 Bath Rd , Kingston)");
            utility.makeEmptyColumn(xlsLocation);

            //710 Kingston - West ( 1057 Midland Ave , Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/710-kingston-west", "710 KINGSTON (1057 Midland Ave , Kingston)");
            utility.makeEmptyColumn(xlsLocation);

//            //Calyx + Trichomes Cannabis ( 1105 Midland Ave., Kingston )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/calyx-trichomes-west", "CALYX AND TRICHOMES (1105 Midland Ave., Kingston)");
//            utility.makeEmptyColumn(xlsLocation);

            //BMT Cannabis - Kingston ( 1724 Bath Road, Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/bmt-cannabis-kingston", "BMT CANNABIS (1724 Bath Road, Kingston)");
            utility.makeEmptyColumn(xlsLocation);

            //Tokyo Smoke ( 2790 Princess Street, Kingston )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/tokyo-smoke-kingston-2790-princess", "TOKYO SMOKE (2790 Princess Street, Kingston)");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
