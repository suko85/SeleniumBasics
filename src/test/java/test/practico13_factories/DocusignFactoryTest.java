package test.practico13_factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DocusignFactoryTest {
    private WebDriver driver;
    private int parametro = 0;

    public DocusignFactoryTest(int param){
        this.parametro = param;
    }

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://go.docusign.com/o/trial/");
    }

    @Test
    public void docusignTitleTest(){
        if (parametro == 3){
            System.out.println("El parametro es 3!!");
        } else if(parametro == 6){
            System.out.println("El parametro es 6!!");
        } else{
            System.out.println("El parametro es 9");
        }
        String currentTitle = driver.getTitle();
       Assert.assertNotEquals(currentTitle, "");
    }

/*    @Test
    public void docusignCurrentUrlTest(){
        String currentUrl = driver.getCurrentUrl();
        Assert.assertNotEquals(currentUrl, "");
    }*/

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
