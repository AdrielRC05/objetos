package code;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(4,Calculadora.add(2,2));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        assertAll(
                () -> assertEquals(4,Calculadora.multiply(2,2)),
                () -> assertEquals(-4,Calculadora.multiply(2,-2)),
                () -> assertEquals(4,Calculadora.multiply(-2,-2)),
                () -> assertEquals(0,Calculadora.multiply(1,0))
        );
    }

    @org.junit.jupiter.api.Test
    void rest() {
        assertAll(
                () -> assertEquals(5,Calculadora.rest(10,5))
        );
    }

    @org.junit.jupiter.api.Test
    void divide() {
        assertEquals(2,Calculadora.divide(6,3));
    }
}