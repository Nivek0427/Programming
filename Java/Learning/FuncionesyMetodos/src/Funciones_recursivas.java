import java.util.Scanner;

public class Funciones_recursivas {
    public static void main(String[] args) {
        // Ejemplo de uso de la función recursiva para calcular el factorial de un número
        Scanner leer = new Scanner(System.in);

        // Puedes cambiar el valor de 'numero' para calcular el factorial de otro número
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = leer.nextInt();
        // Llamada a la función recursiva para calcular el factorial
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);

        //ejemplo de uso de funcion recursiva con cuenta regresiva
        int cuenta = 10;
        System.out.println("Cuenta regresiva:");
        cuentaRegresiva(cuenta);
    }

    /*la función recursiva es una función que se llama a sí misma
        para resolver un problema. En este caso, la función 'factorial'
        se llama a sí misma con un valor decreciente de 'n' hasta llegar a la base del caso*/

    // Función recursiva para calcular el factorial de un número
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // El factorial de 0 y 1 es 1
        } else {
            return n * factorial(n - 1); // Llamada recursiva
        }
    }

    // Función recursiva para realizar una cuenta regresiva
    public static void cuentaRegresiva(int n) {
        if (n < 0) {
            System.out.println("¡Cuenta regresiva terminada!");
        } else {
            System.out.println(n);
            cuentaRegresiva(n - 1); // Llamada recursiva
        }
    }
}
