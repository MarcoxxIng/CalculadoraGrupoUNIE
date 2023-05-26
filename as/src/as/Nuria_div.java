package as;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Nuria_div {

    @Test
    public void testDivision() {
        double num1 = 10.0;
        double num2 = 2.0;
        double resultadoEsperado = 5.0;

        double resultado = Calculadora.dividir(num1, num2);

        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testDivisionPorCero() {
        double num1 = 5.0;
        double num2 = 0.0;

        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculadora.dividir(num1, num2);
        });
    }
}