import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngretiantTest {
    private Ingretiant ing;
    @BeforeEach
    void setUp(){
        ing = new Ingretiant("Augen des Einhorns");
    }

    @Test
    void power() {
        assertEquals(18,ing.power());
        ing.setName("Uran");
        assertEquals(4,ing.power());
    }

    @Test
    void setName() {
        ing.setName("Uran");
        assertEquals("Uran",ing.getName());
    }
}