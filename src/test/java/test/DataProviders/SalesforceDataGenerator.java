package test.DataProviders;

import org.testng.annotations.DataProvider;

public class SalesforceDataGenerator {

    @DataProvider (name = "capitales" )
    public static Object[][] capitalesDelSur(){
        return new Object[][]{
                {"Buenos Aires", "Argentina"},
                {"Montevideo", "Uruguay"},
                {"Santiago", "Chile"}
        };
    }

    @DataProvider (name = "salesforceRegistration" )
    public static Object[][] salesforceRegistrationData(){
        return new Object[][]{
                {"Ana", "Marin", "Developer", "ana@ana.com", "success", "chrome"},
                {"Ana", "Marin", "Developer", "ana@ana.com", "success", "firefox"},
                {"Maria", "Lopez", "QA Manager", "maria@qa.com", "success", "mozilla"},
                {"Andres", "Gomez", "QA", "agomez@gomez.com", "success", "mozilla"},
                {"Juan", "Perez", "Developer", "Perez", "failure", "IE"},
        };
    }
}
