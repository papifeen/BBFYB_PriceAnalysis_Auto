package DynastyPot;

import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class dynastyPotPrice extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Price Analysis Files/Dynasty Pot Shop Comp Analysis/DyanstyPotPriceAnalysis.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            // Cozy Cannabis ( 1428 Dundas Street West, Toronto )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cozy-cannabis-bcb61ed6-fe13-45de-b58e-590f08831aa8", "Cozy Cannabis (1428 Dundas Street West, Toronto) ");
            utility.makeEmptyColumn(xlsLocation);

            // Canna Savana 1149 QUEEN ST W, TORONTO
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/canna-savanna", "Canna Savana (1149 QUEEN ST W)");
            utility.makeEmptyColumn(xlsLocation);

            // Mani’s Toke 1164 QUEEN ST W, TORONTO
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/mani-s-toke", "Mani’s Toke (1164 QUEEN ST W, TORONTO)");
            utility.makeEmptyColumn(xlsLocation);

            // High Variety 1184 QUEEN ST W
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/high-variety", "High Variety (1184 QUEEN ST W)");
            utility.makeEmptyColumn(xlsLocation);

            // Vibe Cannabis 8 DOVERCOURT RD UNIT
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/vibe-cannabis", "Vibe Cannabis (8 DOVERCOURT RD UNIT 106)");
            utility.makeEmptyColumn(xlsLocation);

            // Bodega 198 OSSINGTON AVE
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/bodega", "Bodega (198 OSSINGTON AVE)");
            utility.makeEmptyColumn(xlsLocation);

            // Welcome Cannabis 1227 DUNDAS ST W, TORONTO
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/welcome-cannabis-dundas-west", "Welcome Cannabis (1227 DUNDAS ST W, TORONTO)");
            utility.makeEmptyColumn(xlsLocation);

            // 6 of Spade 1278 DUNDAS ST W
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/6-of-spade-toronto-best-prices-in-town", "6 of Spade (1278 DUNDAS ST W)");
            utility.makeEmptyColumn(xlsLocation);

            // Kindling Cannabis 1567 DUNDAS ST W
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/toronto-c77538b0-3d81-48a4-bcfa-248ba66efc62", "Kindling Cannabis (1567 DUNDAS ST W)");
            utility.makeEmptyColumn(xlsLocation);

            // Yerba Buenda 1111 COLLEGE ST
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/yerba-buena-college-st", "Yerba Buenda (1111 COLLEGE ST)");
            utility.makeEmptyColumn(xlsLocation);

            // College Street Cannabis 966 COLLEGE ST
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/college-street-cannabis", "College Street Cannabis (966 COLLEGE ST)");
            utility.makeEmptyColumn(xlsLocation);

            // Flower Pot - 1006 DUNDAS ST W, TORONTO
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/flower-pot", "Flower Pot (1006 DUNDAS ST W, TORONTO)");
            utility.makeEmptyColumn(xlsLocation);

            // Superette - 994 DUNDAS ST W, TORONTO
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/superette-bellwoods", "Superette (994 DUNDAS ST W, TORONTO)");
            utility.makeEmptyColumn(xlsLocation);

            // Cosmic Charlie's - 821 QUEEN ST W, TORONTO
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/cosmic-charlies", "Cosmic Charlie's (821 QUEEN ST W, TORONTO)");
            utility.makeEmptyColumn(xlsLocation);

            // FOREVER BUDS - 722 COLLEGE ST UNIT 1
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/forever-bud", "FOREVER BUDS (722 COLLEGE ST UNIT 1)");
//            utility.makeEmptyColumn(xlsLocation);

            // ERBN GREEN - 842 DUNDAS ST W
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/erbn-green-dundas", "ERBN Green (ERBN GREEN - 842 DUNDAS ST W)");
//            utility.makeEmptyColumn(xlsLocation);

            // BUD EXPRESS CO. - 662 QUEEN ST W, TORONTO
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/bud-express-co-queen-st-w", "BUD EXPRESS (662 QUEEN ST W, TORONTO)");
//            utility.makeEmptyColumn(xlsLocation);

            // Hemisphere Cannabis Co. - 700 KING ST W UNIT 4
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/on405r-700-king-street-king-bathurst", "Hemisphere Cannabis Co. - 700 KING ST W UNIT 4");
//            utility.makeEmptyColumn(xlsLocation);

            // Spiritleaf - 542 COLLEGE ST, TORONTO
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/spiritleaf-little-italy", "Spiritleaf (542 COLLEGE ST, TORONTO)");
//            utility.makeEmptyColumn(xlsLocation);

            // Civilian House of Cannabis - 734 QUEEN ST W, TORONTO
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/civilian-cannabis-queen-street-west", "Civilian House of Cannabis (734 QUEEN ST W, TORONTO)");
            utility.makeEmptyColumn(xlsLocation);

            // CANNA CABANA - 720 KING ST W UNIT 155
//            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/canna-cabana-king-st-w-toronto", "CANNA CABANA (720 KING ST W UNIT 155)");
//            utility.makeEmptyColumn(xlsLocation);

            // value buds
            //https://on.valuebuds.com/pages/search-results-page?collection=value-buds-queen-street-west

            // trinity flower
            //https://www.trinityflower.ca/shop#/menu

        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
