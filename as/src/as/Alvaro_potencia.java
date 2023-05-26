package as;

import org.junit.Assert;
import org.junit.Test;

public class Alvaro_potencia {

    @Test
    public void testPotencia() {
        // Crear una instancia de la clase que contiene el método de potencia
        Calculadora calculadora = new Calculadora();
        
        // Probar la potencia de 2 elevado a la 0
        double resultado1 = calculadora.potencia(2, 0);
        Assert.assertEquals(1.0, resultado1, 0.0001);
        
        // Probar la potencia de 5 elevado a la 3
        double resultado2 = calculadora.potencia(5, 3);
        Assert.assertEquals(125.0, resultado2, 0.0001);
        
        // Probar la potencia de 10 elevado a la -2
        double resultado3 = calculadora.potencia(10, -2);
        Assert.assertEquals(0.01, resultado3, 0.0001);
        
        // Probar la potencia de 0 elevado a cualquier exponente
        double resultado4 = calculadora.potencia(0, 5);
        Assert.assertEquals(0.0, resultado4, 0.0001);
    }
}

