import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("ingrese un número: ");
        int n = leer.nextInt();

        if (n != 0) {
            if (n > 0) {
                if (n % 2 == 0) {
                    System.out.println("el número es par");
                } else {
                    System.out.println("el número es impar");
                }
            } else {
                if (n % 2 == 0) {
                    System.out.println("el número es par negativo");
                } else {
                    System.out.println("el número es impar negativo");
                }
            }
        }else {
            System.out.println("el número ingresado es neutro");
        }
    }
}