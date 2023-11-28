package Osh_Cour_Bow_North;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class courticeTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/NHelm price comp analysis/BCOpriceAnalysis.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            // Northern Helm ( 1414 King St E , Courtice )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-helm-courtice", "NORTHERN HELM (1414 King St E , Courtice)");
            utility.makeEmptyColumn(xlsLocation);

            // Kryptonite Cannabis (555 Rossland Rd E , Oshawa)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/kryptonite-cannabis-oshawa", "KRYPTONITE CANNABIS (555 Rossland Rd E , Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            //https://dutchie.com/dispensary/budgetbud-oshawa-650
            // BudgetBud (650 King St E , Oshawa)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/budgetbud-oshawa-650", "BUDGET BUD (650 King St E , Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            //https://dutchie.com/dispensary/old-west-cannabis-company
            // Old West Cannabis Company (215 King St E , Oshawa)
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/old-west-cannabis-company", "OLD WEST CANNABIS COMPANY (215 King St E , Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            //https://dutchie.com/dispensary/the-peace-pipe-oshawa
            // The Peace Pipe - Oshawa ( 31 Celina St, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-peace-pipe-oshawa-704d9db3-7983-4e20-97d2-7ecb2f3e7ee1", "THE PEACE PIPE (31 Celina St, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

           // https://dutchie.com/dispensary/the-420-store-oshawa
            // The 420 Store ( 14 Ontario Street, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/the-420-store-oshawa", "THE 420 STORE (14 Ontario Street, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            //https://dutchie.com/dispensary/phoenix-cannabis
            // Phoenix Cannabis ( 12 Simcoe Street South, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/phoenix-cannabis", "PHOENIX CANNABIS (12 Simcoe Street South, Oshawa)");
            utility.makeEmptyColumn(xlsLocation);

            //https://dutchie.com/dispensary/northern-tokes-oshawa
            // Northern Tokes ( 474 Simcoe Street South, Oshawa )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/northern-tokes-oshawa", "Northern Tokes ( 474 Simcoe Street South, Oshawa )");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
