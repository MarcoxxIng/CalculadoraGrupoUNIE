//Sergio Menéndez

package as;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestaPrueba {

    @Test
    public void testResta() {
        double num1 = 5.0;
        double num2 = 3.0;
        double resultadoEsperado = 2.0;

        double resultado = 	Calculadora.restar(num1, num2);

        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}