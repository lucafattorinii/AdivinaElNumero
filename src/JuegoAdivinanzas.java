import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;
        int intentos = 0;
        int adivinanza = 0;

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¿Puedes adivinar cuál es?");

        try (Scanner scanner = new Scanner(System.in)) {
            while (adivinanza != numeroAdivinar) {
                System.out.print("Introduce tu adivinanza: ");
                adivinanza = scanner.nextInt();
                intentos++;

                if (adivinanza < numeroAdivinar) {
                    System.out.println("Demasiado bajo. Inténtalo de nuevo.");
                } else if (adivinanza > numeroAdivinar) {
                    System.out.println("Demasiado alto. Inténtalo de nuevo.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                }
            }
        }
    }
}
