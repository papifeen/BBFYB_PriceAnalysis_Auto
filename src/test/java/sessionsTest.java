import BaseClass.base;
import Utility.util;
import org.testng.annotations.Test;

public class sessionsTest extends base {

    static String xlsLocation = "/Users/selenium/OneDrive/Documents/SessionsPriceTest.xlsx";

    @Test
    public void getProductPrices(){

        util utility = new util(driver, xlsLocation);

        if(utility.createSheet(xlsLocation) == true){

            // Sessions Cannabis ( 216 Second Line W , Sault Ste. Marie )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/sessions-cannabis-the-soo", "SESSIONS (216 Second Line W , Sault Ste. Marie) SOO");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions Cannabis ( 425 Algonquin Blvd E , Timmins )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/sessions-cannabis-timmins", "SESSIONS (425 Algonquin Blvd E , Timmins) TIMMINS");
            utility.makeEmptyColumn(xlsLocation);

            // Sessions (Nickel City) ( 900 Lasalle Boulevard, Greater Sudbury )
            utility.getProductAndPrice(xlsLocation,"https://bestbangforyourbud.com/store/sessions-nickel-city", "Sessions (Nickel City) ( 900 Lasalle Boulevard, Greater Sudbury )");
            utility.makeEmptyColumn(xlsLocation);


        } else {
            System.out.println("Sheet with the same name/date likely already exists");
        }

    }
}
