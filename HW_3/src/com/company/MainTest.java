package com.company;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class MainTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Main.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    int one = 4;
    int two = 7;

    @Test
    public void range() {
        assertFalse(two <= 5.0 && two >= -5.0);
    }

    @Test
    public void maxValue() {
        assertEquals(two, Main.maxValue(one, two));
    }

    @Test
    public void minValue() {
        assertEquals(one, Main.minValue(one, two));
    }
}
