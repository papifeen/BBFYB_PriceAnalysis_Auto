package CannabisJacksPriceAnalysis;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class valCaronTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Cnb Jacks Price Comp Analysis/ValCaronPriceAnalysis.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

          //  Cannabis Jacks - Val Caron ( 3020 Old Highway 69, Greater Sudbury ) roughly around 0.2km
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cannabis-jacks-val-caron", "CANNABIS JACKS (3020 Old Highway 69, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

           //  Happy Life ( 3045 Old Highway 69, Greater Sudbury ) betweem 0.7 - 0.9 km
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/val-caron", "HAPPY LIFE (3045 Old Highway 69, Greater Sudbury)");
//            utility.makeEmptyColumn(xlsLocation);

           //  Miss Jones - Val Caron ( 3140 Old Highway 69, Greater Sudbury )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/miss-jones-val-caron", "MISS JONES (3140 Old Highway 69, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);
//
//          //   Pop's Cannabis (5118 Old Hwy 69 , Greater Sudbury)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/pop-s-cannabis-hanmer", "POPS CANNABIS (5118 Old Hwy 69 , Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

          //   Grassroots Co ( 1113 Lasalle Blvd , Greater Sudbury )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/grassroots-co", "GRASSROOTS (1113 Lasalle Blvd , Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

          //   Bananas Cannabis ( 1855 Lasalle Boulevard, Greater Sudbury )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/bananas-cannabis-sudbury", "BANANAS CANNABIS (1855 Lasalle Boulevard, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

           //  Happy Life ( 1021 Kingsway, Greater Sudbury )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/happy-life", "HAPPY LIFE (1021 Kingsway, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

          //   Highlife - Hanmer - (5085 Old Hwy 69 , Greater Sudbury)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/highlife-hanmer", "Highlife - Hanmer - (5085 Old Hwy 69 , Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions (Nickel City) - (900 Lasalle Boulevard, Greater Sudbury)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/sessions-nickel-city", "Sessions (Nickel City) - (900 Lasalle Boulevard, Greater Sudbury)");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}