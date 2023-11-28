package NorthernHelmPriceAnalysis;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class ottawaTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/OttawaPriceAuto.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            // 780 Baseline Rd Unit 5, Ottawa
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-baseline", "NORTHERN HELM (780 Baseline Rd Unit 5, Ottawa)");
            utility.makeEmptyColumn(xlsLocation);

          //   The Herbary - Nepean ( 1121 Meadowlands Dr E , Ottawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-herbary-nepean", "The Herbary - Nepean ( 1121 Meadowlands Dr E , Ottawa )");
            utility.makeEmptyColumn(xlsLocation);

            // Stash & Co ( 1445 Merivale Rd , Ottawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/stash-co-merivale-road", "STASH N CO (1445 Merivale Rd, Ottawa)");
            utility.makeEmptyColumn(xlsLocation);

           // https://dutchie.com/dispensary/dutch-love-ottawa-hampton-park
            // Dutch Love ( 1395 Carling Ave , Ottawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/dutch-love-ottawa-hampton-park", "DUTCH LOVE (1395 Carling Ave , Ottawa)");
            utility.makeEmptyColumn(xlsLocation);

           // https://dutchie.com/dispensary/spiritleaf-wellington-west
            // Spiritleaf ( 1200 Wellington St. W , Ottawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-wellington-west", "SPIRIT LEAF (1200 Wellington St. W , Ottawa)");
            utility.makeEmptyColumn(xlsLocation);

         //    888 Meadowlands Dr E , Ottawa
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-hog-s-back", "SPIRIT LEAF (888 Meadowlands Dr E, Ottawa)");
            utility.makeEmptyColumn(xlsLocation);

           // https://dutchie.com/dispensary/good-nature-cannabis
           //  Good Nature Cannabis ( 1234 Merivale Rd , Ottawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/good-nature-cannabis", "GOOD NATURES CANNABIS (1234 Merivale Rd , Ottawa)");
            utility.makeEmptyColumn(xlsLocation);

           // https://dutchie.com/dispensary/true-north-cannabis-w-ottawa
            // True North Cannabis ( 1262 Wellington St. W , Ottawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/true-north-cannabis-w-ottawa", "TRUE NORTH CANNABIS (1262 Wellington St. W , Ottawa)");
            utility.makeEmptyColumn(xlsLocation);

            https://dutchie.com/dispensary/plateau-cannabis-little-italy
           //  Plateau Cannabis ( 440 Preston St , Ottawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/plateau-cannabis-little-italy", "PLATEAU CANNABIS (440 Preston St , Ottawa)");
            utility.makeEmptyColumn(xlsLocation);

            https://dutchie.com/dispensary/farmer-jane-southdale
            // Superette ( 1306 Wellington Street West, Ottawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/superette-ottawa", "Superette ( 1306 Wellington Street West, Ottawa )");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
