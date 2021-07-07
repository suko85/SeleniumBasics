package test.practico14_fakers;

import org.testng.annotations.Factory;
import test.practico13_factories.DocusignFactoryTest;

public class SalesforceFactory {

    @Factory
    public Object[] factoryMethod() {
        return new Object[]{
                new SalesforceTest(),
                new SalesforceTest(),
                new SalesforceTest(),
                new SalesforceTest(),
        };
    }
}
