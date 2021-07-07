package test.practico13;

import org.testng.annotations.Test;

public class DependentClasses {

    @Test (dependsOnMethods = {"testTwo", "testThree"})
    public void testOne(){
        System.out.println("Test 1");
    }

    @Test
    public void testTwo() throws InterruptedException {
        System.out.println("Test 2");
        Thread.sleep(2000);
    }

    @Test
    public void testThree() throws InterruptedException {
        System.out.println("Test 3");
        Thread.sleep(4000);
    }
}
