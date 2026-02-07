public class Variables_argumentos {
    public static void main(String[] args) {
        // Ejemplo de uso de varargs(variables de argumentos)

        // Llamada a la función con diferentes cantidades de argumentos
        System.out.println(sumar(1, 2)); // Salida: 3
        System.out.println(sumar(1, 2, 3)); // Salida: 6
        System.out.println(sumar(1, 2, 3, 4)); // Salida: 10
    }

    //varargs permite pasar un número variable de argumentos a una función. En este caso,
    // la función sumar puede recibir cualquier cantidad de enteros y los suma todos.

    // Función con parametros indefinidos (varargs)
    public static int sumar(int... numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }        return suma;
    }
}
