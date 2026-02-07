import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //tabla de multiplicar
        System.out.print("ingrese un número: ");
        int n = leer.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf(" %d x %d = %d \n",n,i,(n*i));
        }
    }
}