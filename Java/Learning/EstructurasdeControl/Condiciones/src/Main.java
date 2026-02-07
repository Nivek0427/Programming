import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        if(true){
            System.out.println("se cumple la condicion");
        }else{
            System.out.println("no se cumple la condicion");
        }*/

        //ejemplo
        Scanner leer = new Scanner (System.in);

        System.out.println("ingrese un número");
        int n = leer.nextInt();

        if (n%2==0){
            System.out.println("el número es par");
        }else{
            System.out.println("el número es impar");
        }


    }
}