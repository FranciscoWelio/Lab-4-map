import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
}
