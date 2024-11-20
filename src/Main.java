import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         TO DO! Implementar bucle while() para
         asegurar que la ejecución no termine hasta
         que los datos ingresados sean válidos.

         >>> Implementar código <<<
        */

        try {
            // Solicitar datos
            System.out.println("Ingrese la velocidad inicial en m/s: ");
            double velocidadInicial = scanner.nextDouble();

            System.out.println("Ingrese el ángulo de lanzamiento en grados: ");
            double angulo = scanner.nextDouble();

            System.out.println("Ingrese el tiempo en segundos: ");
            double tiempo = scanner.nextDouble();

            // Validamos que los valores no sean negativos
            if (velocidadInicial < 0 || angulo < 0 || tiempo < 0) {
                throw new IllegalArgumentException("Los valores no pueden ser negativos.");
            }

            Calcular calcular = new Calcular(velocidadInicial, angulo);
            double altura = calcular.calcularAltura(tiempo);

            System.out.println("La altura a los " + tiempo + " segundos es: " + altura + " m");

        } catch (InputMismatchException exception) {
            // Detectamos si el usuario ingresa algo no numérico.
            System.out.println("Error: Por favor, ingrese un número válido.");
        } catch (IllegalArgumentException exception) {
            // Manejamos argumentos no válidos (como valores negativos).
            System.out.println("Error: " + exception.getMessage());
        } catch (Exception exception) {
            // Capturarmos cualquier otro error no previsto.
            System.out.println("Ocurrió un error inesperado: " + exception.getMessage());
        }
    }
}
