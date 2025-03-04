import java.util.Random;

public class MayorNumero {
    public static void main(String[] args) {
        // Crear una instancia de la clase Random
        Random random = new Random();

        // Generar dos números aleatorios entre 0 y 100
        int numero1 = random.nextInt(101); // Genera un número entre 0 y 100
        int numero2 = random.nextInt(101); // Genera un número entre 0 y 100

        // Imprimir los números generados
        System.out.println("Número 1: " + numero1);
        System.out.println("Número 2: " + numero2);

        // Comparar los números y determinar el mayor
        if (numero1 > numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("Ambos números son iguales.");
        }
    }
}
