import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionesMatematicasTest {

    public FuncionesMatematicas funciones = new FuncionesMatematicas();



    @Test
    public void suma() {

        double resultado = 18;

        assertEquals(18,funciones.suma(10,8));
    }

    @Test
    public void resta() {

        double resultado = 2;

        assertEquals(2,funciones.resta(10,8));
    }

    @Test
    public void multiplicacion() {

        double resultado = 80;

        assertEquals(80,funciones.multiplicacion(10,8));
    }

    @Test
    public void division() {
        double resultado = 10;

        assertEquals(10,funciones.division(80,8));
    }

    @Test
    public void esCapicua() {

        boolean resultado = true;

        assertEquals(true,funciones.esCapicua(34543));
    }

    @Test
    public void digitos() {

        int resultado = 5;

        assertEquals(5,funciones.digitos(34543));
    }

    @Test
    public void esPrimo() {

        boolean resultado = true;

        assertEquals(true,funciones.esPrimo(13));
    }

    @Test
    public void siguientePrimo() {

        int resultado = 17;

        assertEquals(17,funciones.siguientePrimo(13));
    }

    @Test
    public void potencia() {

        double resultado = 4;

        assertEquals(4,funciones.potencia(2,2));
    }

    @Test
    public void voltea() {

        int resultado = 123;

        assertEquals(123,funciones.voltea(321));
    }

    @Test
    public void digitoN() {

        int resultado = 5;

        assertEquals(5,funciones.digitoN(34543,2));
    }

    @Test
    public void posicionDeDigito() {

        int resultado = 2;

        assertEquals(2,funciones.posicionDeDigito(34543,5));
    }

    @Test
    public void quitaPorDetras() {

        int resultado = 345;

        assertEquals(345,funciones.quitaPorDetras(34543,2));
    }

    @Test
    public void quitaPorDelante() {

        int resultado = 43;

        assertEquals(43,funciones.quitaPorDelante(34543,3));
    }

    @Test
    public void pegaPorDetras() {

        int resultado = 34543;

        assertEquals(34543,funciones.pegaPorDetras(3454,3));
    }

    @Test
    public void pegaPorDelante() {

        int resultado = 34543;

        assertEquals(34543,funciones.pegaPorDelante(4543,3));
    }

    @Test
    public void trozoDeNumero() {

        int resultado = 454;

        assertEquals(454,funciones.trozoDeNumero(34543,1,3));
    }

    @Test
    public void juntaNumeros() {

        int resultado = 34543;

        assertEquals(34543,funciones.juntaNumeros(34,543));
    }

}