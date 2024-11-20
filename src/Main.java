import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos
        System.out.println("Ingrese la velocidad inicial en m/s: ");
        double velocidadInicial = scanner.nextDouble();

        System.out.println("Ingrese el ángulo de lanzamiento en grados: ");
        double angulo = scanner.nextDouble();

        System.out.println("Ingrese el tiempo en segundos: ");
        double tiempo = scanner.nextDouble();

        Calcular calcular = new Calcular(velocidadInicial, angulo);
        double altura = calcular.calcularAltura(tiempo);

        System.out.println("La altura a los " + tiempo + " segundos es: " + altura + "m");
    }
}
