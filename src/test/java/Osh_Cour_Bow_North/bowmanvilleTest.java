package Osh_Cour_Bow_North;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class bowmanvilleTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/OttawaPriceAuto.xlsx";

    ///Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/BCOpriceAnalysis.xlsx



    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

////            //Bowmanville
//
//          //   Northern Helm ( Durham Regional Hwy 2 , Bowmanville )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-bowmanville", "NORTHERN HELM (Durham Regional Hwy 2 , Bowmanville)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // Shiny Bud ( 191 Church Street, Bowmanville )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/shiny-bud-bowmanville-191", "SHINY BUD (191 Church Street, Bowmanville)");
//            utility.makeEmptyColumn(xlsLocation);
////
////            // Speakeasy Bowmanville (21 King Street West, Bowmanville)
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/speakeasy-bowmanville", "SPEAK EASY (21 King Street West, Bowmanville)");
//            utility.makeEmptyColumn(xlsLocation);
////
////            //https://dutchie.com/dispensary/central-plains-cannabis
////            // Central Plains Cannabis ( 34 Beaver Street North, Newcastle )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/central-plains-cannabis-newcastle", "CENTRAL PLAINS (34 Beaver Street North, Newcastle)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // https://dutchie.com/dispensary/cannabis-xpress-clarington
//            // CANNABIS XPRESS (Hampton) ( 1648 Taunton Rd , Hampton )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cannabis-xpress-hampton", "CANNABIS XPRESS (Hampton) ( 1648 Taunton Rd , Hampton )");
//            utility.makeEmptyColumn(xlsLocation);
////
////            // https://dutchie.com/dispensary/kryptonite-cannabis
////            // Rustic Cannabis ( 122 King Street East, Bowmanville )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/bowmanville-540149ee-a171-4463-a503-b96b1a4b8193", "Rustic Cannabis ( 122 King Street East, Bowmanville )");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // https://dutchie.com/dispensary/budgetbud-oshawa-650
//            // Spot 420 ( 237 King Street East, Bowmanville )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/bowmanville-c142d52f-079c-411e-bf7a-02ab2efa5e62", "Spot 420 ( 237 King Street East, Bowmanville )");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // https://dutchie.com/dispensary/northern-helm-oshawa
//            // Your Local Cannabis ( 45 King Avenue West, Newcastle )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/your-local-cannabis-newcastle", "Your Local Cannabis ( 45 King Avenue West, Newcastle )");
//            utility.makeEmptyColumn(xlsLocation);

            // Spiritleaf ( 250 Taunton Road East, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-oshawa", "Spiritleaf ( 250 Taunton Road East, Oshawa )");
            utility.makeEmptyColumn(xlsLocation);

//            //Courtice
//
            // Northern Helm ( 1414 King St E , Courtice )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-courtice", "NORTHERN HELM (1414 King St E , Courtice)");
//            utility.makeEmptyColumn(xlsLocation);
////
////             https://dutchie.com/dispensary/budgetbud-oshawa-650
////           //  BudgetBud (650 King St E , Oshawa)
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/budgetbud-oshawa-650", "BUDGET BUD (650 King St E , Oshawa)");
//            utility.makeEmptyColumn(xlsLocation);
////
////            https://dutchie.com/dispensary/old-west-cannabis-company
//            // Old West Cannabis Company (215 King St E , Oshawa)
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/old-west-cannabis-company", "OLD WEST CANNABIS COMPANY (215 King St E , Oshawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//          //   Kryptonite Cannabis (555 Rossland Rd E , Oshawa)
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/kryptonite-cannabis-oshawa", "KRYPTONITE CANNABIS (555 Rossland Rd E , Oshawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//           //  not working at the moment!!!!!!!!!
//         //   https://dutchie.com/dispensary/the-peace-pipe-oshawa
//         //    The Peace Pipe - Oshawa ( 31 Celina St, Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-peace-pipe-oshawa-704d9db3-7983-4e20-97d2-7ecb2f3e7ee1", "THE PEACE PIPE (31 Celina St, Oshawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // https://dutchie.com/dispensary/the-420-store-oshawa
////             The 420 Store ( 14 Ontario Street, Oshawa )
////            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-420-store-oshawa", "THE 420 STORE (14 Ontario Street, Oshawa)");
////            utility.makeEmptyColumn(xlsLocation);
//
//            //https://dutchie.com/dispensary/northern-tokes-oshawa
//            // Pop's Cannabis - Courtice ( 1635 Durham Regional Hwy 2 , Courtice )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/pop-s-cannabis-courtice", "Pop's Cannabis - Courtice ( 1635 Durham Regional Hwy 2 , Courtice )");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // Canna Buzz Inc. ( 142 Simcoe Street South, Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/canna-buzz-inc", "Canna Buzz Inc. ( 142 Simcoe Street South, Oshawa )");
//            utility.makeEmptyColumn(xlsLocation);
//
//           /// https://dutchie.com/dispensary/phoenix-cannabis
//           //  Fika ( 1445 Harmony Road North, Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/fika-oshawa-n", "Fika ( 1445 Harmony Road North, Oshawa )");
//            utility.makeEmptyColumn(xlsLocation);

            //Oshawa
//
//            // Northern Helm ( 9 Wentworth St W , Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-oshawa", "NORTHERN HELM (9 Wentworth St W , Oshawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//        //     Purple Moose Cannabis ( 575 Laval Drive, Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/oshawa", "PURPLE MOOSE (575 Laval Drive, Oshawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            // Tokyo Smoke - Oshawa - 400 King St W ( 400 King St W, Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/tokyo-smoke-oshawa-king-st", "TOKYO SMOKE(400 King St W, Oshawa)");
//            utility.makeEmptyColumn(xlsLocation);
////
//            // Nature's Canopy House ( 22 Stevenson Rd S , Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/nature-s-canopy-house-oshawa", "NATURES CANOPY (22 Stevenson Rd S, Oshawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//          //  https://dutchie.com/dispensary/northern-tokes-oshawa
//          //   Northern Tokes ( 474 Simcoe St S , Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-tokes-oshawa", "NORTHERN TOKES (474 Simcoe St S, Oshawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            https://dutchie.com/dispensary/phoenix-cannabis
//            // Phoenix Cannabis ( 12 Simcoe St S , Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/phoenix-cannabis", "PHOENIX CANNABIS (12 Simcoe St S , Oshawa)");
//            utility.makeEmptyColumn(xlsLocation);
//
//            https://bestbangforyourbud.com/store/cannabis-co
//           //  Cannabis & Co. ( 92 Wolfe St , Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cannabis-co", "Cannabis & Co. ( 92 Wolfe St , Oshawa )");
//            utility.makeEmptyColumn(xlsLocation);
//
//            //https://bestbangforyourbud.com/store/sessions-cannabis-oshawa
//            // Sessions Cannabis ( 1 Warren Avenue, Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/sessions-cannabis-oshawa", "Sessions Cannabis ( 1 Warren Avenue, Oshawa )");
//            utility.makeEmptyColumn(xlsLocation);
//
//            //https://bestbangforyourbud.com/store/ganjika-house-oshawa
//            // Ganjika House (Oshawa) ( 575 Thornton Road North, Oshawa )
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/ganjika-house-oshawa", "Ganjika House (Oshawa) ( 575 Thornton Road North, Oshawa )");
//            utility.makeEmptyColumn(xlsLocation);
//
//            //https://bestbangforyourbud.com/store/true-north-cannabis-oshawa
////            // True North Cannabis - Oshawa - (1076 Cedar St UNIT 3, Oshawa
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/true-north-cannabis-oshawa", "True North Cannabis - Oshawa - (1076 Cedar St UNIT 3, Oshawa");
//            utility.makeEmptyColumn(xlsLocation);
//



        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
