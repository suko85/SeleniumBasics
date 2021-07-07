package AutomationInterviewQuestions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class ExampleFromAppAutomationInterviewQuestions {

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver/chromedriver.exe");
        WebDriver driver;
        Set<String> st = null;
        driver = new ChromeDriver();
        //driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://naukri.com");
        st=driver.getWindowHandles();
        for(String str: st){
            System.out.println(str);
            driver.switchTo().window(str);
            String sTitle = driver.getTitle();
            System.out.println(sTitle);
        }
        driver.switchTo().defaultContent();
       // WebElement element = driver.findElement(By.name("keyword"));
        Actions act = new Actions(driver);
        act.contextClick().perform();
        JavascriptExecutor Js = (JavascriptExecutor)driver;
        Js.executeScript("history.go(0)");
    }

}
