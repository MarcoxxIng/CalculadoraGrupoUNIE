package as;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MultiplicaciónPrueba {

    @Test
    public void testMultiplicacion() {
        double num1 = 5.0;
        double num2 = 3.0;
        double resultadoEsperado = 15.0;

        double resultado = Calculadora.multiplicar(num1, num2);

        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}