public class Calcular {

    private double velocidadInicial;
    private double angulo;

    public Calcular(double velocidadInicial, double angulo) {
        this.velocidadInicial = velocidadInicial;
        this.angulo = angulo;
    }

    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double calcularAltura(double tiempo) {

        // Convercion a radianes
        double radianes = Math.toRadians(angulo);

        // Calcular la componente vertical de la velocidad inicial
        double Y = velocidadInicial * Math.sin(radianes);

        // Usar la fórmula de altura
        double altura = (Y * tiempo) + (0.5 * (-9.8) * Math.pow(tiempo, 2));
        return altura;
    }
}
