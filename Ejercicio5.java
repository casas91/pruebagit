import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int notaIngresada;
        int cantnotas = 0;
        int totalnotas = 0;
        double promedio;

        Scanner scanner = new Scanner(System.in);
        //Solicitar primer ingreso
        System.out.println("Ingrese la primera nota");
        notaIngresada = scanner.nextInt();

        //Utilizo un while para solicitar y obtener N notas
        while(notaIngresada > 0){
            //Acumular las notas ingresadas
            totalnotas += notaIngresada;

            //Contar la cantida de notas ingresadas
            cantnotas++;
            //Solicita otra nota

            System.out.println("Ingrese otra nota o 0 para finalizar");
            notaIngresada = scanner.nextInt();
        }
        //Calcula el promedio
        promedio = (double) totalnotas/cantnotas;
        System.out.println("Finaliza el ingreso de notas");
        System.out.println("El promedio de las notas es: "+promedio);
    }
}
