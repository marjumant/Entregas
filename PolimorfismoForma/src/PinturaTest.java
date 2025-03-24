import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PinturaTest {
    @Test
    void pintura() {
        Esfera esfera = new Esfera("esfera", 15);
        Rectangulo rectangulo = new Rectangulo("rectangulo", 12, 6);
        Cilindro cilindro = new Cilindro("cilindro", 4, 7);
        Pintura pintura = new Pintura(80);

        assertEquals(35.341, pintura.pinturaNecesaria(esfera), 3);
        assertEquals(4.3982, pintura.pinturaNecesaria(cilindro),3);
        assertEquals(0.9, pintura.pinturaNecesaria(rectangulo),3);
    }
}