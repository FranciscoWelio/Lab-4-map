import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
        assertEquals("65,312" , circulo.perimetro());
    }
    @Test
    void periCirculoNotTest(){
        Circulo circulo =new Circulo(10.4);
        assertNotEquals("65,312" , circulo.perimetro());
    }
}
