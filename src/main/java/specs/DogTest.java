package specs;

import models.Breeder;
import models.Dog;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Finn on 16/01/2018.
 */
public class DogTest {

    Dog dog1;
    Breeder breeder;

    @Before
    public void before() {
        breeder = new Breeder("Finn", "Porter", "UK");
        dog1 = new Dog("Nomi", "akcNomi", "DN123456789", "kcNomi", "987654321", 20170314, 'f', "blue merle", 47, 18.5, "long", "4:3", "elbows", "eyes", "cea", "gpra", "hsf", "cmr", "mdr", "igs", "dm", "Andie", breeder);
    }

    @Test
    public void canHaveNickName() {
        assertEquals("Nomi", dog1.getNickName());
    }

    @Test
    public void canHaveAkcName() {
        assertEquals("akcNomi", dog1.getAkcName());
    }

    @Test
    public void canHaveAkcRegNum() {
        assertEquals("DN123456789", dog1.getAkcRegNum());
    }

    @Test
    public void canHaveKcName() {
        assertEquals("kcNomi", dog1.getKcName());
    }

    @Test
    public void canHaveKcRegNum() {
        assertEquals("987654321", dog1.getKcRegNum());
    }

    @Test
    public void canHaveDateOfBirth() {
        assertEquals(20170314, dog1.getDob());
    }

    @Test
    public void canHaveSex() {
        assertEquals('f', dog1.getSex());
    }

    @Test
    public void canHaveColour() {
        assertEquals("blue merle", dog1.getColour());
    }

    @Test
    public void canHaveHeight() {
        assertEquals(47.0, dog1.getHeight());
    }

    @Test
    public void canHaveWeight() {
        assertEquals(18.5, dog1.getWeight());
    }

    @Test
    public void canHaveTail() {
        assertEquals("long", dog1.getTail());
    }

    @Test
    public void canhaveBvaHips() {
        assertEquals("4:3", dog1.getBvaHips());
    }

    @Test
    public void canHaveBvaElbows() {
        assertEquals("elbows", dog1.getBvaElbows());
    }

    @Test
    public void canHaveBvaEyes() {
        assertEquals("eyes", dog1.getBvaEyes());
    }

    @Test
    public void canHaveCeaCh() {
        assertEquals("cea", dog1.getCeaCh());
    }

    @Test
    public void canHaveGpra() {
        assertEquals("gpra", dog1.getGpra());
    }

    @Test
    public void canhaveHsf4() {
        assertEquals("hsf", dog1.getHsf4());
    }

    @Test
    public void canHaveCmr1() {
        assertEquals("cmr", dog1.getCmr1());
    }

    @Test
    public void canHaveMdr1() {
        assertEquals("mdr", dog1.getMdr1());
    }

    @Test
    public void canHaveIgs() {
        assertEquals("igs", dog1.getIgs());
    }

    @Test
    public void canHaveDm() {
        assertEquals("dm", dog1.getDm());
    }

    @Test
    public void canHaveOwner() {
        assertEquals("Andie", dog1.getOwner());
    }

    @Test
    public void canHaveBreeder() {
        assertEquals("Finn Porter", dog1.getBreeder().getFirstName() + " " + dog1.getBreeder().getLastName());
    }
}