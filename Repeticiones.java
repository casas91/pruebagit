import java.util.Scanner;

public class Repeticiones {
    public static void main(String[] args) {
        int contador = 0;
        int nroIngresado;
        int Total = 0;
        Scanner scanner = new Scanner(System.in);
        while(contador < 8) {
            System.out.println("Ingrese un numero entero");
            nroIngresado = scanner.nextInt();

            //Acumulo los valores ingresados
            Total = Total + nroIngresado;
            //Total += nroIngresado
            //Incremento del contador
            contador++;
        }
            System.out.println("La suma de los numeros ingresados es: " +Total);
        }
    }

