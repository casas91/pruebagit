import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numero 1");
        num1 = Scanner.nextInt();
        System.out.println("ingrese numero 2");
        num2 = Scanner.nextInt();
        if (num1 > num2) {
            System.out.println(num1"es mayor que"num2);
        } else if (num2 > num1){
        System.out.println(num2"es mayor que"num1);
    }else}
        System.out.println(num1 "es igual que" num2);