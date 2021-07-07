package test.practico12;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class Notaciones {
    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void Test1(){
        System.out.println("***This is a Test1!!!***");
    }

    @Test
    public void Test2(){
        System.out.println("***This is a Test2!!!***");
    }

    @Test
    public void Test3(){
        System.out.println("***This is a Test3!!!***");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }
}
