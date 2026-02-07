//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

        System.out.println("se sumarán dos numeros\n");
        System.out.print("ingrese el primer número: ");
        var n1 = leer.nextInt();
        System.out.print("ingrese el segundo número: ");
        var n2 = leer.nextInt();

        var r = n1+n2;

        System.out.println("el resultado de la suma de los dos númneros es: "+r);
    }
}