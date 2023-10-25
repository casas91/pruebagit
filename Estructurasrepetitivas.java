
import java.util.Scanner;

public class Estructurasrepetitivas {
    public static void main(String[] args) {
        int notas = 1;
        int contador = 0;
        int Promedio = 0;

        Scanner scanner = new Scanner(System.in);

        while (notas != -1) {
            System.out.println("Ingrese nota alumno:");
            notas = scanner.nextInt();

            contador++;
            Promedio += notas / contador;
        }
        System.out.println(contador);
        System.out.println("El promedio de las notas es: " + Promedio);
    }
}
