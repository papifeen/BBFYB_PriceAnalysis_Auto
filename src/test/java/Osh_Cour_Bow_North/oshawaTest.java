package Osh_Cour_Bow_North;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class oshawaTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/BCOpriceAnalysis.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            // Northern Helm ( 9 Wentworth St W , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-oshawa", "NORTHERN HELM (9 Wentworth St W , Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // Purple Moose Cannabis ( 575 Laval Drive, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/oshawa", "PURPLE MOOSE (575 Laval Drive, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // Tokyo Smoke - Oshawa - 400 King St W ( 400 King St W, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/tokyo-smoke-oshawa-king-st", "TOKYO SMOKE(400 King St W, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            // Nature's Canopy House ( 22 Stevenson Rd S , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/nature-s-canopy-house-oshawa", "NATURES CANOPY (22 Stevenson Rd S, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            //https://dutchie.com/dispensary/northern-tokes-oshawa
            // Northern Tokes ( 474 Simcoe St S , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-tokes-oshawa", "NORTHERN TOKES (474 Simcoe St S, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            //https://dutchie.com/dispensary/the-peace-pipe-oshawa
            // The Peace Pipe ( 31 Celina St , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-peace-pipe-oshawa", "THE PEACE PIPE (31 Celina St, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            ////https://dutchie.com/dispensary/old-west-cannabis-company
            // Old West Cannabis Company ( 215 King St E , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/old-west-cannabis-company", "OLD WEST CANNABIS COMPANY (215 King St E, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            //https://dutchie.com/dispensary/phoenix-cannabis
            // Phoenix Cannabis ( 12 Simcoe St S , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/phoenix-cannabis", "PHOENIX CANNABIS (12 Simcoe St S , Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            //// https://dutchie.com/dispensary/the-420-store-oshawa
            // The 420 Store ( 14 Ontario St , Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-420-store-oshawa", "THE 420 STORE (14 Ontario St , Oshawa)");
            utility.makeEmptyColumn(xlsLocation);



        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
