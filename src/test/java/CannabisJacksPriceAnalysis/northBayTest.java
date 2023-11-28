package CannabisJacksPriceAnalysis;


import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class northBayTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Cannabis Jacks/NorthBayPriceAuto.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            // Cannabis Jacks - North Bay ( 1881 Cassells St , North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cannabis-jacks-north-bay", "CANNABIS JACKS (1881 Cassells St , North Bay)");
            utility.makeEmptyColumn(xlsLocation);
////
//            // One Plant (1899 Algonquin Avenue, North Bay)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/one-plant-c23574fd-282d-4ab5-9735-abb8f3c72714", "ONE PLANT (1899 Algonquin Avenue, North Bay)");
            utility.makeEmptyColumn(xlsLocation);
//
//            // Miss Jones - McKeown Outpost ( 955 Mckeown Avenue, North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/miss-jones-mckeown-outpost", "MISS JONES (955 Mckeown Avenue, North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // Happy Life ( 42 Lakeshore Drive, North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/happy-life-north-bay-lakeshore", "HAPPY LIFE (42 Lakeshore Drive, North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke ( 390 Lakeshore Dr , North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/tokyo-smoke-north-bay", "TOKYO SMOKE (390 Lakeshore Dr , North Bay)");
            utility.makeEmptyColumn(xlsLocation);

//            // King of Queens - North Bay ( 176 Oak St W , North Bay )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/king-of-queens-north-bay", "KING OF QUEENS (176 Oak St W , North Bay)");
//            utility.makeEmptyColumn(xlsLocation);

            // True North Cannabis - Main St. East ( 496 Main St E , North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/true-north-cannabis-main-st-east", "TRUE NORTH CANNABIS (496 Main St E , North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // True North Cannabis ( 1720 Algonquin Avenue, North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/true-north-cannabis-algonquin-ave", "TRUE NORTH CANNABIS (1720 Algonquin Avenue, North Bay)");
            utility.makeEmptyColumn(xlsLocation);

            // Miss Jones - Lakeshore Outpost ( 300 Lakeshore Dr #727, North Bay )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/miss-jones-lakeshore-outpost", "MISS JONES (300 Lakeshore Dr #727, North Bay)");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
