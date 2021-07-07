package test.practico14;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.DataProviders.SalesforceDataGenerator;

public class DataProviderTest {

    @DataProvider(name= "personas")
    public Object[][] crearPersonas(){
        return new Object[][]{
                {"Juan", 36},
                {"Maria", 37},
                {"Pedro", 19},
                {"Ana", 24}
        };
    }

    @Test(dataProvider = "personas")
    public void nombresPrueba(String nombre, Integer edad){
        System.out.println("El nombre es " + nombre + " de edad " + edad);
    }

    @Test(dataProvider = "capitales", dataProviderClass = SalesforceDataGenerator.class)
    public void imprimirCapitales(String capital, String pais){
        System.out.println("La capital es " + pais + " es "+ capital);
    }
}
