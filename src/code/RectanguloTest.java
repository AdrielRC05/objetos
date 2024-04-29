package code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectanguloTest {

    @Test
    void area() {
        Rectangulo r = new Rectangulo(3, 4);
        assertEquals(12,r.area());
    }
}