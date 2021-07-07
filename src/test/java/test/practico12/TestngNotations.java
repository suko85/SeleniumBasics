package test.practico12;

import org.testng.annotations.*;

public class TestngNotations {

    @BeforeClass
    public void beforeClassTest(){
        System.out.println("@Before Class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("@Before Test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("@Before Method");
    }

    @Test (priority = 2)
    public void test1(){
        System.out.println("@Test1");
    }

    @Test (priority = 0)
    public void test2(){
        System.out.println("@Test2");
    }

    @Test (priority = 1)
    public void test3(){
        System.out.println("@Test3");
    }

    @AfterMethod
    public void afterMethodTest(){
        System.out.println("@After Method");
    }

    @AfterTest
    public void afterTest1(){
        System.out.println("@After Test1");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("@After Class");
    }



}
