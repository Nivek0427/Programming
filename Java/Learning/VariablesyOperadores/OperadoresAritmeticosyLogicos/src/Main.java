//operaciones aritmeticas y relacionales
public class Main {
    public static void main(String[] args) {

        //operadores aritmeticos
        int a = 50;
        int b = 6;
        int c = 5;

        System.out.println(a % b); // % es modulo, obtiene el residuo de la división entre
                                    //los dos números
        System.out.println((a-b*c)/4); //operaciones aritmeticas básicas

        a = 10;
        a = a + 5; //incremento de una variable
        System.out.println(a);

        //operadores relacionales
        int n1 = 3;
        int n2 = 2;
        //comparacion entre valores
        System.out.println(a==b); //== igualdad entre dos variables
        System.out.println(a!=b); //diferencia entre dos variables
        System.out.println(a>b); //mayor que
        //...demás operadores de comparación

        //Operadores lógicos
        System.out.println(! false);//not
        System.out.println(true && true); //and
        System.out.println(true || false); //or

        //usando logicos y relaciones
        System.out.println(a==b && a>b);
    }
}