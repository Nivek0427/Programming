public class ParametrosyArgumentos {
    public static void main(String[] args) {

        sumar(3, 5); //llamar a la funcion con argumentos

        //crear variables para usar como argumentos
        var nombre = "Maria";
        var edad = 25;
        //llamar a la funcion con variables como argumentos
        saludar(nombre, edad);

        //llamar a la funcion con argumentos
        saludar("Juan", 30);

    }

    //definir funcion con parametros
    static void sumar(int a, int b){
        int resultado = a + b;
        System.out.println("La suma es: " + resultado);
    }

    //definir funcion con parametros
    static void saludar(String nombre, int edad){
        System.out.printf("Hola %s tu edad es %s\n", nombre, edad);
    }
}
