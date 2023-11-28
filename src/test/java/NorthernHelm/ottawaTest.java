package NorthernHelm;

import BaseClass.base;
import Utility.util;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ottawaTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Northern Helm/OttawaPriceAuto.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

//            // 780 Baseline Rd Unit 5, Ottawa
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-baseline", "NORTHERN HELM (780 Baseline Rd Unit 5, Ottawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // 1642 Merivale Rd, Ottawa
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/dutch-love-ottawa-merivale", "DUTCH LOVE (1642 Merivale Rd, Ottawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // 888 Meadowlands Dr E , Ottawa
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-hog-s-back", "SPIRIT LEAF (888 Meadowlands Dr E, Ottawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // Stash & Co ( 1445 Merivale Rd , Ottawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/stash-co-merivale-road", "STASH N CO (1445 Merivale Rd, Ottawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // Good Nature Cannabis ( 1234 Merivale Rd , Ottawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/good-nature-cannabis", "GOOD NATURES CANNABIS (1234 Merivale Rd , Ottawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // Dutch Love ( 1395 Carling Ave , Ottawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/dutch-love-ottawa-hampton-park", "DUTCH LOVE (1395 Carling Ave , Ottawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // Farmer Jane Southdale ( 235 Vermillion Rd., Winnipeg )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/farmer-jane-southdale-63bb3cfb-44af-43e3-838e-5bece49ce7b0", "FARMER JANE SOUTHDALE (235 Vermillion Rd., Winnipeg)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // Plateau Cannabis ( 440 Preston St , Ottawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/plateau-cannabis-little-italy", "PLATEAU CANNABIS (440 Preston St , Ottawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // True North Cannabis ( 1262 Wellington St. W , Ottawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/true-north-cannabis-w-ottawa", "TRUE NORTH CANNABIS (1262 Wellington St. W , Ottawa)");
//            utility.makeEmptyColumn(xlsLocation);

            // Spiritleaf ( 1200 Wellington St. W , Ottawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-wellington-west", "SPIRIT LEAF (1200 Wellington St. W , Ottawa)");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
