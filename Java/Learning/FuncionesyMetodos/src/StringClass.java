public class StringClass {
    public static void main(String[] args) {
        //metodo CharAt
        String nombre = "João";
        char letra = nombre.charAt(0);//obtener el caracter en la posicion 0 (la primera letra)
        System.out.println(letra);

        //metodo length
        int tamano = nombre.length();//obtener el tamaño de la cadena
        System.out.println(tamano);

        //metodo substring
        String subcadena = nombre.substring(1, 3);//extraer una subcadena desde
        // el indice 1 hasta el indice 3 (excluyendo el indice 3)
        System.out.println(subcadena);

        //metodo toLowerCase
        String minusculas = nombre.toLowerCase();//convertir a minusculas
        System.out.println(minusculas);

        //metodo toUpperCase
        String mayusculas = nombre.toUpperCase(); //convertir a mayusculas
        System.out.println(mayusculas);

        //metodo replace
        String reemplazo = nombre.replace('o', 'a'); //reemplazar la letra 'o' por 'a'
        System.out.println(reemplazo);

        //metodo equals
        String nombre2 = "João";
        boolean sonIguales = nombre.equals(nombre2); //comparar dos cadenas
        System.out.println(sonIguales);



    }
}
