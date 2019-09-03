package com.company;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class DogTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Dog.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    Dog dog1 = new Dog("Bob", Dog.Breed.Collie.toString(), 10);
    Dog dog2 = new Dog("Bob", Dog.Breed.Boxer.toString(), 8);

    @org.junit.Test
    public void oldestDog() {
        assertTrue(dog1.getName().equals(dog2.getName()));
    }

    @org.junit.Test
    public void checkSameName() {
        assertEquals(dog1, Dog.oldestDog(dog1, dog2));
    }
}
