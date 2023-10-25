import java.util.Scanner;

public class CodigoDenominacion {
    public static void main(String[] args) {
        int codigo;
        String denominacion = "Indefinido";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese codigo");
        codigo = scanner.nextInt();
        switch (codigo){
            case 1:
                denominacion = "Facturas A";
                break;
            case 2:
                denominacion = "Notas de debito A";
                break;
            case 3:
                denominacion = "Notas de credito A";
                break;
            case 4:
                denominacion = "Recibos A";
                break;

            case 5:
                denominacion = "Notas de venta al contado A";
                break;
            case 6:
                denominacion = "Facturas B";
                break;
            case 7:
                denominacion = "Notas de debito B";
                break;
            case 8:
                denominacion = "Notas de credito B";
                break;
            case 9:
                denominacion = "Recibos B";
                break;
            case 10:
                denominacion = "Notas de venta al contado B";
                break;
            default:
                denominacion = "Indefinido";


        }
        System.out.println("Para el codigo: " +codigo + " La denominacion es: " +denominacion );


    }
}
