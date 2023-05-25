package as;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSuma() {
        double num1 = 5.0;
        double num2 = 3.0;
        double resultadoEsperado = 8.0;

        double resultado = Calculadora.sumar(num1, num2);

        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}


