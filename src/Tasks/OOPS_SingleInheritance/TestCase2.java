package Tasks.OOPS_SingleInheritance;

public class TestCase2 extends CommonToAll{

    void runningTC2(){
        startBrowser();
        System.out.println("Running TestCase2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}
