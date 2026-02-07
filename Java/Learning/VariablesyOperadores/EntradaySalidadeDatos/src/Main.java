//importar clase necesaria para utilizar el escaner de datos de entrada
import java.util.Scanner;

//entrada y salida de datos
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in); /*objeto de clase scanner para usar metodo
                                                   de ingreso de datos*/

        System.out.println("Por favor ingrese su nombre");
        String nombre = leer.nextLine(); //acceder a metodo para leer lo ingresado por teclado
                                            //nextLine (String)
        System.out.println("nombre: "+ nombre);
        System.out.print("ingrese su edad"); //impresion sin salto de linea
        int edad = leer.nextInt(); //nextInt para leer números
        System.out.println("Edad: "+edad);


        //salida de datos
        System.out.printf("Nombre: %s \n Edad: %d",nombre,edad ); //impresion con formato
                                                                //\n sirve para salto de linea

    }
}