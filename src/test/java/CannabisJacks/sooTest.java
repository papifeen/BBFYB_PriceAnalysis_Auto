package CannabisJacks;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class sooTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Cannabis Jacks/SooPriceAuto.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            // Cannabis Jacks - Sault Ste. Marie ( 518 Great Northern Road, Sault Ste. Marie )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cannabis-jacks-sault-ste-marie", "CANNABIS JACKS (518 Great Northern Road, Sault Ste. Marie)");
            utility.makeEmptyColumn(xlsLocation);

            // Hello Cannabis ( 317 Northern Ave E , Sault Ste. Marie )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/hello-cannabis", "HELLO CANNABIS (317 Northern Ave E , Sault Ste. Marie)");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions Cannabis ( 216 Second Line W , Sault Ste. Marie )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/sessions-cannabis-the-soo", "SESSIONS (216 Second Line W , Sault Ste. Marie)");
            utility.makeEmptyColumn(xlsLocation);

            // Due North Cannabis Co. Churchill Secret Menu ( 150 Churchill Blvd , Sault Ste. Marie )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/due-north-cannabis-co", "DUE NORTH (150 Churchill Blvd , Sault Ste. Marie)");
            utility.makeEmptyColumn(xlsLocation);

            // Highlife ( 625 Trunk Rd , Sault Ste. Marie )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/highlife-sault-ste-marie", "HIGH LIFE (625 Trunk Rd , Sault Ste. Marie)");
            utility.makeEmptyColumn(xlsLocation);

            // Due North Cannabis Co. ( 695 Pine St , Sault Ste. Marie )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/due-north-cannabis-co-pine-st", "DUE NORTH CANNABIS (695 Pine St , Sault Ste. Marie)");
            utility.makeEmptyColumn(xlsLocation);

            // Matchbox Cannabis - Queen St ( 146 Queen St E , Sault Ste. Marie )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/matchbox-cannabis-queen-st", "MATCHBOX CANNABIS (146 Queen St E , Sault Ste. Marie)");
            utility.makeEmptyColumn(xlsLocation);

            // Matchbox Cannabs ( 275 Second Line W , Sault Ste. Marie )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/matchbox-cannabis-sault-st-marie", "MATCHBOX CANNABIS (275 Second Line W , Sault Ste. Marie)");
            utility.makeEmptyColumn(xlsLocation);

            // True North Cannabis - Sault St. Marie ( 898 Queen St E , Sault Ste. Marie )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/true-north-cannabis-sault-st-marie", "TRUE NORTH CANNABIS (898 Queen St E , Sault Ste. Marie)");
            utility.makeEmptyColumn(xlsLocation);



        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
