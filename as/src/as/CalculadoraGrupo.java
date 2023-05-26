package as;
import java.util.Scanner;

class Calculadora {
    public static double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
    }

	public static double potencia(double numero1, double numero2) {
		double resultado = Math.pow(numero1, numero2);
		return resultado;
	}
}

public class CalculadoraGrupo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Bienvenido a la calculadora");

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");

        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = calculadora.sumar(numero1, numero2);
                break;
            case 2:
                resultado = calculadora.restar(numero1, numero2);
                break;
            case 3:
                resultado = calculadora.multiplicar(numero1, numero2);
                break;
            case 4:
                try {
                    resultado = calculadora.dividir(numero1, numero2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            case 5:
            	resultado = calculadora.potencia(numero1, numero2);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
