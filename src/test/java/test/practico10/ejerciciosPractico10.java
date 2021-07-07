package test.practico10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.Utilities.GetProperties;

public class ejerciciosPractico10 {

    private WebDriver getDriver(String url){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }

    @Test
    public void forgotAccountTest(){
        WebDriver driver = getDriver("https://www.facebook.com");
        driver.findElement(By.linkText("¿Olvidaste tu contraseña?")).click();

        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "¿Olvidaste tu contraseña? | No puedo iniciar sesión | Facebook");
        Assert.assertNotEquals(driver.getCurrentUrl(), "https://www.facebook.com", "Se deberia estar en otra url");
        driver.close();
    }

    @Test
    public void forgotPartialLinkTest(){
        WebDriver driver = getDriver("https://www.facebook.com");
        driver.findElement(By.partialLinkText("¿Olvidaste")).click();

        Assert.assertEquals(driver.getTitle(), "¿Olvidaste tu contraseña? | No puedo iniciar sesión | Facebook");
        Assert.assertNotEquals(driver.getCurrentUrl(), "https://www.facebook.com", "Se deberia estar en otra url");
        driver.close();
    }

    @Test
    public void customSalesforceLinkTest(){
        WebDriver driver = getDriver("https://login.salesforce.com");
        //driver.findElement(By.id("mydomainLink")).click();
        driver.findElement(By.linkText("Use Custom Domain")).click();
        driver.findElement(By.name("mydomain")).sendKeys("as");
        driver.findElement(By.id("mydomainContinue")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("okta-signin-username")).sendKeys("test@test.com");
    }

    @Test
    public void checkBoxAndComboBoxTest() throws InterruptedException {
        WebDriver driver = getDriver("https://www.facebook.com");
        driver.findElement(By.xpath("//a[contains(text(), 'Crear cuenta nueva')]")).click();
        Thread.sleep(3000);


        driver.findElement(By.name("firstname")).sendKeys("Alan");
        driver.findElement(By.name("lastname")).sendKeys("Smith");

        WebElement dias = driver.findElement(By.id("day"));
        Select comboBoxDias = new Select(dias);
        comboBoxDias.selectByValue("4");

        WebElement mes = driver.findElement(By.id("month"));
        Select comboBoxMeses = new Select(mes);
        comboBoxMeses.selectByVisibleText("abr");

        WebElement año = driver.findElement(By.id("year"));
        Select comboBoxAño = new Select(año);
        comboBoxAño.selectByIndex(9);

    }


}
