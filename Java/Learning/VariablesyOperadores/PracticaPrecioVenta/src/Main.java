import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor de la venta: ");
        double valor_venta = leer.nextDouble();
//impuesto
        double impuesto = valor_venta*0.19;
        double totalventa = valor_venta+impuesto;

        System.out.println("precio de venta: "+valor_venta);
        System.out.println("impuesto: "+impuesto);
        System.out.println("total de venta: "+totalventa);


    }
}