package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import test.Utilities.GetProperties;

import java.util.List;

public class EjercicioPractico9 {
    WebDriver driver;

    private void inicializarDriver(String URL){
        GetProperties properties = new GetProperties();
        String chromeDriverUrl = properties.getString("CHROMEDRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", chromeDriverUrl);

        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }

    @Test
    public void primerTest(){
        inicializarDriver("http://www.salesforce.com");
        driver.get("http://www.salesforce.com");

        System.out.println("Maximizando...... ");
        driver.manage().window().fullscreen();
        int altura = driver.manage().window().getSize().getHeight();
        int ancho = driver.manage().window().getSize().getWidth();

        System.out.println("El alto es " + altura);
        System.out.println("El ancho es " + ancho);


        // *** EJEMPLOS DE METODOS DEL DRIVER ***
        System.out.println("Titulo de la pagina : " + driver.getTitle());
        if (driver.getTitle().equals("Google")){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed!");
        }


        //driver.close();
        System.out.println("Url actual: " + driver.getCurrentUrl());

        List<WebElement> listaH1s = driver.findElements(By.tagName("h1"));
        System.out.println("*** Se mostrarán los h1 ***");
        for (WebElement h1 : listaH1s){
            System.out.println(h1.getText());
        }
        System.out.println("*** Fin de los h1 ***");

        List<WebElement> listaH2s = driver.findElements(By.tagName("h2"));
        System.out.println("*** Se mostrarán los h2 ***");
        for (WebElement h2 : listaH1s){
            if (h2.getText().isEmpty() == false){
                System.out.println(h2.getText());
            }
        }
        System.out.println("*** Fin de los h2 ***");

        List<WebElement> hipervinculos = driver.findElements(By.tagName("a"));
        for (WebElement link : hipervinculos){
            System.out.println("Links " + link.getText());
        }

        List<WebElement> listas = driver.findElements(By.tagName("li"));
        for (WebElement e : listas ){
            System.out.println("Lista" + e.getText());
        }
    }

    @Test
    public void facebookTest(){
        inicializarDriver("http://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("pass")).sendKeys("selenium");
        driver.findElement(By.name("login")).click();

    }
}
