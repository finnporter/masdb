package specs;

import db.DBBreeder;
import models.Breeder;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BreederTest {

    Breeder breeder;
    DBBreeder dbBreeder;

    @Before
    public void before() {
        breeder = new Breeder("Fin", "Port", "UK");
        dbBreeder = new DBBreeder();
    }

    @Test
    public void canHaveFirstName() {
        assertEquals("Fin", breeder.getFirstName());
    }

    @Test
    public void canSetFirstName() {
        breeder.setFirstName("Finn");
        assertEquals("Finn", breeder.getFirstName());
    }

    @Test
    public void canHaveLastName() {
        assertEquals("Port", breeder.getLastName());
    }

    @Test
    public void canSetLastName() {
        breeder.setLastName("Porter");
        assertEquals("Porter", breeder.getLastName());
    }

    @Test
    public void canHaveCountry() {
        assertEquals("UK", breeder.getCountry());
    }

    @Test
    public void canSetCountry() {
        breeder.setCountry("United Kingdom");
        assertEquals("United Kingdom", breeder.getCountry());
    }

    @Test
    public void canSaveBreeder() {
        dbBreeder.saveBreeder(breeder);
        List<Breeder> allBreeders = dbBreeder.getAllBreeders();
        assertEquals(1, allBreeders.size());
    }
}
