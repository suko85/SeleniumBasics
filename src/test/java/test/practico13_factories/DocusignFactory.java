package test.practico13_factories;

import org.testng.annotations.Factory;

public class DocusignFactory {

    //sirve para parametrizar las clases de test
    @Factory
    public Object [] factoryMethod(){
        return new Object[] {
                new DocusignFactoryTest(3),
                new DocusignFactoryTest(6),
                new DocusignFactoryTest(9),
        };
    }
}