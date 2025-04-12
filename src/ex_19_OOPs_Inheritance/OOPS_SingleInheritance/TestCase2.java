package ex_19_OOPs_Inheritance.OOPS_SingleInheritance;

public class TestCase2 extends CommonToAll{

    void runningTC2(){
        startBrowser();
        System.out.println("Running TestCase2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}
