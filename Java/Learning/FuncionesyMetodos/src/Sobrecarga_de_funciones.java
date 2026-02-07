public class Sobrecarga_de_funciones {
    public static void main(String[] args) {
        // Llamamos a la función sumar con diferentes tipos de argumentos
        System.out.println(sumar(5, 10)); // Llama a la función que suma dos enteros
        System.out.println(sumar(3.5, 2.5)); // Llama a la función que suma dos números decimales
        System.out.println(sumar("Hola, ", "mundo!")); // Llama a la función que concatena dos cadenas
    }

    /*sobre carga de funciones es una característica de la programación orientada a objetos
        que permite definir múltiples funciones con el mismo nombre pero con diferentes tipos
        o números de parámetros. Esto facilita la legibilidad del código y permite realizar
        operaciones similares con diferentes tipos de datos sin necesidad
        de crear funciones con nombres diferentes.*/

    // Función que suma dos números enteros
    static int sumar(int a, int b) {
        return a + b;
    }

    // Función que suma dos números decimales
    static double sumar(double a, double b) {
        return a + b;
    }

    // Función que concatena dos cadenas de texto
    static String sumar(String a, String b) {
        return a + b;
    }
}
