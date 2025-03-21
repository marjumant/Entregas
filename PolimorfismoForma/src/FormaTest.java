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

        assertEquals(72, rectangulo.area());
        assertEquals(2827.4333882308138, esfera.area());
        assertEquals(351.85837720205683, cilindro.area());
    }

    @Test
    void pintura() {
        Esfera esfera = new Esfera("esfera", 15);
        Rectangulo rectangulo = new Rectangulo("rectangulo", 12, 6);
        Cilindro cilindro = new Cilindro("cilindro", 4, 7);
        Pintura pintura = new Pintura(80);

        assertEquals(35.34291735288517, pintura.pinturaNecesaria(esfera));
        assertEquals(4.39822971502571, pintura.pinturaNecesaria(cilindro));
        assertEquals(0.9, pintura.pinturaNecesaria(rectangulo));
    }
}