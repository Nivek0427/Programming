//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Variables
        String nombre; //caracteres,texto
        int edad; //numeros enteros
        int a,b,d; //creación de multiples variables en misma linea

        //asignacion de valores a variables
        nombre = "Kevin Vergara";
        edad = 25;
        a = 1; b = 2; d = 3; // asignación en una misma línea de codigo

        //imprimir variables por consola
        System.out.println(nombre);
        System.out.println(edad);

        //imprimir una operación
        System.out.println(a+b+d);

        //modificar valor a una variable
        edad = 26;
        System.out.println(edad);

        //otra forma de definir las variables
        var x = "Alexis"; //se debe asignar de forma inmediata el valor a la variable
        var y =  " developer";
        //el tipo de valor asígnado será el tipo de variable que será.
        //x = 2 (NO) x="texto" (SI)

        //concatenar cadena de texto
        var info = x+y;
        System.out.println(info);


        //tipos de datos
        byte age = 25; //almacena numeros entre -128 a 127
        short ns = 12369; //numeros un poco más grandes
        long nl = 4569879224555L; //números más grandes
        float nf = 3.58f; // almacena numeros decimales medianos con numero decima de 6 0 7 digitos(se requiere la f al final)
        double nd = 3.1416; //decimales grandes sin necesidad de poner letra al final
        char c = 'a';//almacena sólo un caracter (por caracter)
        char code = 65;//por código ascii del caracter
        System.out.println("imprimiendo caracter de codigo ascii 65... "+ code);

        boolean opcion = true; //tipo de dato primitivo que sólo recibe true o false.
        opcion = false;
        System.out.println(opcion);
    }
}