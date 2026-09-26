package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        double fahrenheit = 80;

        final int ajuste = 32;
        final double multiplicador = 5/9.0;

        double celsius = (fahrenheit - ajuste) * multiplicador;

        System.out.println("Resultado, temperatura em Celsius: " + celsius);
        System.out.println("Temperatura em fahrenheit: " + fahrenheit);

    }

}
