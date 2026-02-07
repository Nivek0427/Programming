public class MathClass {
    public static void main(String[] args) {
        // Ejemplo de uso de la clase Math en Java
        // La clase Math proporciona métodos para realizar operaciones matemáticas comunes,
        // como trigonometría, exponenciación, logaritmos, etc.
        // Algunos de los métodos más comunes de la clase Math incluyen:
        //pi
        System.err.println(Math.PI); // Salida: 3.141592653589793
        //euler
        System.out.println(Math.E);  // Salida: 2.718281828459

        //potencia
        System.out.println(Math.pow(2, 3)); // Salida: 8.0 (2 elevado a la potencia de 3)
        //generar un  numero aleatorio dentro de un rango
        System.out.println(Math.random());

        var nrandom = (int)(Math.random()*100); // Genera un número aleatorio entre 0 y 99
        System.out.println(nrandom);

        //raiz cuadrada
        System.out.println(Math.sqrt(16)); // Salida: 4.0 (raíz cuadrada de 16)

        System.out.println(Math.max(7, 10)); // Salida: 10 (el número máximo entre 7 y 10)
        System.out.println(Math.min(7, 10)); // Salida: 7 (el número mínimo entre 7 y 10)

        //redondeo
        System.out.println(Math.round(3.6)); // Salida: 4 (redondea al número entero más cercano)
        System.out.println(Math.round(3.4)); // Salida: 3 (redondea al número entero más cercano)


    }
}
