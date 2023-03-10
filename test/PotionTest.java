import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PotionTest {
    Potion potion;
    Ingretiant ing1;
    Ingretiant ing2;
    Ingretiant ing3;

    @BeforeEach
    void setUp(){
        ing1 = new Ingretiant("Augen des Einhorns");
        ing2 = new Ingretiant("Drachenblut");
        ing3 =new Ingretiant("Frosch");
        potion = new Potion(ing1,ing2,ing3);
    }


    @org.junit.jupiter.api.Test
    void stir() {
        potion.stir();
        potion.stir();
        assertEquals(2,potion.getStirs());
    }

    @org.junit.jupiter.api.Test
    void getPowerSum() {
        assertEquals(35,potion.getPowerSum());
        ing1.setName("bob");
        potion = new Potion(ing1,ing2,ing3);
        assertEquals(20,potion.getPowerSum());
    }

    @org.junit.jupiter.api.Test
    void isReady() {
        potion.stir();
        potion.stir();
        potion.stir();
        assertFalse(potion.isReady());
        potion.stir();
        potion.stir();
        assertTrue(potion.isReady());
    }
}