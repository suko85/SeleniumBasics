package test.practico12;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class ParametersTests {

    private WebDriver driver;

    @Test (groups = {"successTest", "failureTest"})

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com");
        driver.manage().window().setSize(new Dimension(600,400));
    }
    @Test (groups = {"successTest"})
    public void successTest2(){
        System.out.println("This is a success Test");
    }

    @Test (groups = {"failureTest"})
    public void successTest1(){
        System.out.println("This is a failure Test 3");
    }

    @Test (groups = {"failureTest"})
    public void successTest3(){
        System.out.println("This is a failure Test");
    }

    @Test (groups = {"successTest"})
    @Parameters({"specificTag"})
    public void printTags(@Optional("a") String tag){
        List<WebElement> tagElements = driver.findElements(By.tagName(tag));
        System.out.println("Se imprimiran los elementos tipo " + tag);

        if (tagElements.isEmpty()){
            System.out.println("No se encontraron elementos del tipo: " + tag);
        }

        for (WebElement element : tagElements){
            System.out.println("-->" + element.getText());
        }
    }


}
