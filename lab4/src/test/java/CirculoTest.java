import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.lab4.Circulo;
import org.junit.jupiter.api.Test;
public class CirculoTest {
    @Test
    void areaCirculoTest(){
        Circulo circulo =new Circulo(10.4);
        assertEquals("65,312" , circulo.area());
    }
    @Test
    void areaCirculoNotTest(){
        Circulo circulo =new Circulo(10.4);
        assertNotEquals("65,12" , circulo.area());
    }
    @Test
    void periCirculoTest(){
        Circulo circulo =new Circulo(10.4);
        assertEquals("32,656" , circulo.perimetro());
    }
    @Test
    void periCirculoNotTest(){
        Circulo circulo =new Circulo(10.4);
        assertNotEquals("65,312" , circulo.perimetro());
    }
    @Test
    void circuloExceptionTest() throws Exception{
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Circulo(0);
        });
        
        assertEquals("O raio do círculo deve ser positivo.",exception.getMessage());
    }
}
