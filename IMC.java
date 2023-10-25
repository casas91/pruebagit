import java.util.Locale;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        //Declarar variables
        double peso, altura, imc;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Declarar el scanner
        //Solicitar al usuario que ingrese el peso
        System.out.println("Por favor ingrese su peso: ");
        peso = scanner.nextDouble();
        //Solicitar al usuario que ingrese la altura
        System.out.println("Por favor ingrese su altura (en metros): ");
        altura = scanner.nextDouble();

        //Calculo del IMC
        imc = peso / (altura * altura);
        //Mostrar el IMC calculado
        System.out.println("El IMC calculado es: " + imc);
    }
}


