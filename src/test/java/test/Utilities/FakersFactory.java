package test.Utilities;

import com.github.javafaker.Faker;

public class FakersFactory {

    private static Faker FAKER = new Faker();

    public static String getFirstName(){
        return FAKER.name().firstName();
    }
    public static String getLastName(){
        return FAKER.name().lastName();
    }
    public static String getEmail(){
        return FAKER.internet().emailAddress();
    }
    public static String getTitle(){
        return FAKER.job().title();
    }
}
