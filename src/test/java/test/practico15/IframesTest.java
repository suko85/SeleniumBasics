package test.practico15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IframesTest {

    private static String TELEFONICA_URL = "http://www.telefonica.es";
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(TELEFONICA_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void iframeTest() throws InterruptedException {
        System.out.println("Title " + driver.getTitle());
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();

        WebElement iframeCotizaciones = driver.findElement(By.id("euroland-ticker-es"));
        driver.switchTo().frame(iframeCotizaciones);

        List<WebElement> tabsList = driver.findElements(By.className("Tab"));
        Assert.assertEquals(tabsList.size(), 2);
        tabsList.get(1).click();
        for(WebElement tab: tabsList){
            System.out.println("--> " + tab.getText());
            if(tab.getText().equals("NYSE")){
                tab.click();
                System.out.println("Se hizo click en NYSE");
            }
        }

        List<WebElement> dataItemsList = driver.findElements(By.className("DataItem"));
        List<WebElement> dataValuesList = driver.findElements(By.className("DataValue"));

        WebElement tabActive = driver.findElement(By.className("Tab_Active"));
        System.out.println("Se imprimiran los valores de "  + tabActive.getText());
        for (int i = 0; i< dataItemsList.size(); i++){
            if (dataItemsList.get(i).getText().isEmpty() == false && dataValuesList.get(i).getText().isEmpty() == false )
            System.out.println(dataItemsList.get(i).getText() + "--> " + dataValuesList.get(i).getText());
        }


    }


}
