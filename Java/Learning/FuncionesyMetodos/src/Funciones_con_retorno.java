public class Funciones_con_retorno {
    public static void main(String[] args) {
        // Llamamos a la función sumar y almacenamos el resultado en una variable
        int resultado = sumar(5, 10);
        System.out.println("El resultado de la suma es: " + resultado);

        // Llamamos a la función saludar y mostramos el resultado
        System.out.println(saludar("Juan"));
    }

    // Función que suma dos números enteros y devuelve el resultado
    static int sumar(int a, int b) { // El tipo de retorno es int
        return a + b;
    }

    /*el tipo de retorno de una función
     es el tipo de dato que la función devuelve después de realizar su tarea.
     */

    static String saludar(String nombre) { // El tipo de retorno es String
        return "Hola, " + nombre + "!";
    }
}
