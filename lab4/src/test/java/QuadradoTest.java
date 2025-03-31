import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.lab4.Quadrado;
import org.junit.jupiter.api.Test;

public class QuadradoTest {
    @Test
    void areaQuadradoTest() {
        Quadrado quadrado = new Quadrado(30.9);
        assertEquals("954,81", quadrado.area());

    }
    @Test
    void areaQuadradoNotTest() {
        Quadrado quadrado = new Quadrado(30.9);
        assertNotEquals("60,8", quadrado.area());

    }
    @Test
    void periQuadradoTest() {
        Quadrado quadrado = new Quadrado(30.9);
        assertEquals("123,6", quadrado.perimetro());

    }
    @Test
    void periQuadradoNotTest() {
        Quadrado quadrado = new Quadrado(30.9);
        assertNotEquals("61,8", quadrado.perimetro());

    }
    @Test
    void quadradoExceptionTest() throws Exception{
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Quadrado(0);
        });
        
        assertEquals("O lado do quadrado deve ser positivo.",exception.getMessage());
    }
}