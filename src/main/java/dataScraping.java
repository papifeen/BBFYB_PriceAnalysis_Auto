import excelReader.Xls_Reader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class dataScraping {

    static WebDriver driver;

   static ArrayList<String> addList = new ArrayList<>();

   static ArrayList<String> compList = new ArrayList<>();

   static ArrayList<String> phoneList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

//         adsAndMediaRetreiveData();
//        agricultureRetreiveData();
//        artRetreiveData();
//         automotiveRetreiveData();
//         businessRetreiveData();
//         compRetreiveData();
//         econRetreiveData();
//         familyRetreiveData();
//         financeRetreiveData();
//         govtRetreiveData();
//         healthRetreiveData();
//        homeRetreiveData();
//         legalRetreiveData();
//        lodgeRetreiveData();
//         manuRetreiveData();
//        personalRetreiveData();
//        petsRetreiveData();
//        propertyRetreiveData();
//         utilRetreiveData();
//         realEstateRetreiveData();
//        restaurantRetreiveData();
//         shoppingRetreiveData();
        sportsRetreiveData();
        transportationRetreiveData();


        driver.quit();
    }

    public static int lodgeRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/lodging-travel-14");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("Lodge", "Category", +2, categoryName);
            reader.setCellData("Lodge", "Company Name", i+2, compList.get(i));
            reader.setCellData("Lodge", "Address", i+2, addList.get(i));
            reader.setCellData("Lodge", "Phone", i+2, phoneList.get(i));
    }

        return phoneList.size();

    }

    public static int automotiveRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/automotive-marine-4");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("Automotive", "Category", +2, categoryName);
            reader.setCellData("Automotive", "Company Name", i+2, compList.get(i));
            reader.setCellData("Automotive", "Address", i+2, addList.get(i));
            reader.setCellData("Automotive", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int shoppingRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/shopping-specialty-retail-22");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("Shopping", "Category", +2, categoryName);
            reader.setCellData("Shopping", "Company Name", i+2, compList.get(i));
            reader.setCellData("Shopping", "Address", i+2, addList.get(i));
            reader.setCellData("Shopping", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int realEstateRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/real-estate-moving-storage-19");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("real Estate", "Category", +2, categoryName);
            reader.setCellData("real Estate", "Company Name", i+2, compList.get(i));
            reader.setCellData("real Estate", "Address", i+2, addList.get(i));
            reader.setCellData("real Estate", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int govtRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/government-education-individuals-10");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("govt", "Category", +2, categoryName);
            reader.setCellData("govt", "Company Name", i+2, compList.get(i));
            reader.setCellData("govt", "Address", i+2, addList.get(i));
            reader.setCellData("govt", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int healthRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/health-care-11");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("Health", "Category", +2, categoryName);
            reader.setCellData("Health", "Company Name", i+2, compList.get(i));
            reader.setCellData("Health", "Address", i+2, addList.get(i));
            reader.setCellData("Health", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int businessRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/business-professional-services-5");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("business", "Category", +2, categoryName);
            reader.setCellData("business", "Company Name", i+2, compList.get(i));
            reader.setCellData("business", "Address", i+2, addList.get(i));
            reader.setCellData("business", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int adsAndMediaRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/advertising-media-1");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("ads", "Category", +2, categoryName);
            reader.setCellData("ads", "Company Name", i+2, compList.get(i));
            reader.setCellData("ads", "Address", i+2, addList.get(i));
            reader.setCellData("ads", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int compRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/computers-telecommunications-6");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("comp", "Category", +2, categoryName);
            reader.setCellData("comp", "Company Name", i+2, compList.get(i));
            reader.setCellData("comp", "Address", i+2, addList.get(i));
            reader.setCellData("comp", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int econRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/economic-development-27");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("econ", "Category", +2, categoryName);
            reader.setCellData("econ", "Company Name", i+2, compList.get(i));
            reader.setCellData("econ", "Address", i+2, addList.get(i));
            reader.setCellData("econ", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }
    public static int familyRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/family-community-civic-organizations-8");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("family", "Category", +2, categoryName);
            reader.setCellData("family", "Company Name", i+2, compList.get(i));
            reader.setCellData("family", "Address", i+2, addList.get(i));
            reader.setCellData("family", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int financeRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/finance-insurance-9");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("finance", "Category", +2, categoryName);
            reader.setCellData("finance", "Company Name", i+2, compList.get(i));
            reader.setCellData("finance", "Address", i+2, addList.get(i));
            reader.setCellData("finance", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int legalRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/legal-13");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("legal", "Category", +2, categoryName);
            reader.setCellData("legal", "Company Name", i+2, compList.get(i));
            reader.setCellData("legal", "Address", i+2, addList.get(i));
            reader.setCellData("legal", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int manuRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/manufacturing-production-wholesale-15");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("manu", "Category", +2, categoryName);
            reader.setCellData("manu", "Company Name", i+2, compList.get(i));
            reader.setCellData("manu", "Address", i+2, addList.get(i));
            reader.setCellData("manu", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }
    public static void agricultureRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/agriculture-fishing-forestry-2");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("agriculture", "Category", +2, categoryName);
            reader.setCellData("agriculture", "Company Name", i+2, compList.get(i));
            reader.setCellData("agriculture", "Address", i+2, addList.get(i));
            reader.setCellData("agriculture", "Phone", i+2, phoneList.get(i));
        }

    }

    public static int utilRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/public-utilities-environment-18");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("util", "Category", +2, categoryName);
            reader.setCellData("util", "Company Name", i+2, compList.get(i));
            reader.setCellData("util", "Address", i+2, addList.get(i));
            reader.setCellData("util", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int artRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/arts-culture-entertainment-3");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);

        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);

        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);

        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("art", "Category", +2, categoryName);
            reader.setCellData("art", "Company Name", i+2, compList.get(i));
            reader.setCellData("art", "Address", i+2, addList.get(i));
            reader.setCellData("art", "Phone", i+2, phoneList.get(i));

        }

        return phoneList.size();

    }

    public static int homeRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/home-garden-12");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);

        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);

        }
        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);

        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("home", "Category", +2, categoryName);
            reader.setCellData("home", "Company Name", i+2, compList.get(i));
            reader.setCellData("home", "Address", i+2, addList.get(i));
            reader.setCellData("home", "Phone", i+2, phoneList.get(i));

        }

        return phoneList.size();

    }

    public static int personalRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/personal-services-care-16");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);
            addList.add(addText);
        }
        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }

        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("personal", "Category", +2, categoryName);
            reader.setCellData("personal", "Company Name", i+2, compList.get(i));
            reader.setCellData("personal", "Address", i+2, addList.get(i));
            reader.setCellData("personal", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int petsRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/pets-veterinary-17");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }

        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }

        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("pets", "Category", +2, categoryName);
            reader.setCellData("pets", "Company Name", i+2, compList.get(i));
            reader.setCellData("pets", "Address", i+2, addList.get(i));
            reader.setCellData("pets", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int propertyRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/property-leasing-and-management-26");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }

        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }

        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("property", "Category", +2, categoryName);
            reader.setCellData("property", "Company Name", i+2, compList.get(i));
            reader.setCellData("property", "Address", i+2, addList.get(i));
            reader.setCellData("property", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int restaurantRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/restaurants-food-beverages-21");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }

        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }

        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("restaurant", "Category", +2, categoryName);
            reader.setCellData("restaurant", "Company Name", i+2, compList.get(i));
            reader.setCellData("restaurant", "Address", i+2, addList.get(i));
            reader.setCellData("restaurant", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int sportsRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/sports-recreation-23");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }

        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }

        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("Sports", "Category", +2, categoryName);
            reader.setCellData("Sports", "Company Name", i+2, compList.get(i));
            reader.setCellData("Sports", "Address", i+2, addList.get(i));
            reader.setCellData("Sports", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }

    public static int transportationRetreiveData() {

        addList.clear();
        phoneList.clear();
        compList.clear();

        driver.get("http://summersidechamber.chambermaster.com/list/ql/transportation-24");

        List<WebElement> address = driver.findElements(By.xpath("//div[@itemscope='itemscope' and @class='mn-address']"));
        //System.out.println(address.size());

        List<WebElement> companyName = driver.findElements(By.xpath("//div[@class='mn-title']"));

        List<WebElement> phone = driver.findElements(By.xpath("//li[@class='mn-phone']"));

        String categoryName = driver.findElement(By.xpath("//div[@id='mn-pagetitle']")).getText();

        for (WebElement addEle : address) {
            String addText = addEle.getText();
//            System.out.println(addText);

            addList.add(addText);
        }

        for (WebElement compEle : companyName) {
            String compText = compEle.getText();
//            System.out.println(compText);

            compList.add(compText);
        }

        for (WebElement phoneEle : phone) {
            String phoneText = phoneEle.getText();
//            System.out.println(phoneText);

            phoneList.add(phoneText);
        }

        Xls_Reader reader = new Xls_Reader("/Users/selenium/OneDrive/Documents/lodgingData.xlsx");

        for (int i = 0; i <= phone.size() - 1; i++){
            reader.setCellData("Transportation", "Category", +2, categoryName);
            reader.setCellData("Transportation", "Company Name", i+2, compList.get(i));
            reader.setCellData("Transportation", "Address", i+2, addList.get(i));
            reader.setCellData("Transportation", "Phone", i+2, phoneList.get(i));
        }

        return phoneList.size();

    }





//div[@itemscope='itemscope' and @class='mn-address'] (ADDRESS)

    //div[@class='mn-title'] (title)

//li[@class='mn-phone'] (phone)

//div[@id='mn-pagetitle'] (category title)


}
