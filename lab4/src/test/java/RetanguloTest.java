import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


import com.lab4.Retangulo;

public class RetanguloTest {
    @Test
    void areaRetanguloTest(){
        Retangulo retangulo = new Retangulo(30, 20);
        assertEquals("600", retangulo.area());
    }
    @Test
    void areaRetanguloNotTest(){
        Retangulo retangulo = new Retangulo(30, 20);
        assertNotEquals("400.0" , retangulo.area());
    }
    @Test
    void periRetanguloTest(){
        Retangulo retangulo = new Retangulo(30, 20);
        assertEquals("100", retangulo.perimetro());
    }
    @Test
    void periRetanguloNotTest(){
        Retangulo retangulo = new Retangulo(30, 20);
        assertNotEquals("400" , retangulo.perimetro());
    }
    @Test
    void retanguloExceptionTest() throws Exception{
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(0, 20);
        });
        
        assertEquals("A altura e a largura do retângulo devem ser positivas.",exception.getMessage());
    }
}
