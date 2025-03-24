import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class FormaTest {
    @Test
    void testForma () {
        Esfera esfera = new Esfera("esfera", 15);
        Rectangulo rectangulo = new Rectangulo("rectangulo", 12, 6);
        Cilindro cilindro = new Cilindro("cilindro", 4, 7);

        assertEquals("Cilindro:radio=4.0, altura=7.0, nombre='cilindro", cilindro.toString());
        assertEquals("Esfera:radio=15.0, nombre='esfera", esfera.toString());
        assertEquals("Rectangulo:longitud=12.0, ancho=6.0, nombre='rectangulo", rectangulo.toString());

        assertEquals(72, rectangulo.area(),3);
        assertEquals(2827.433, esfera.area(),3);
        assertEquals(351.858377, cilindro.area(),3);
    }
}
