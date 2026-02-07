//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nombres [];

        nombres = new String[3];

        nombres[0]="Alex";
        nombres[1]="Juan";
        nombres[2]="Pedro";

        System.out.println(nombres[2]);

        nombres[2]="carlos";
        System.out.println(nombres[2]);

        System.out.println(nombres.length);

        int[] arraynumeros = {1,2,3,4,5};
        System.out.println(arraynumeros[1]);
        System.out.println(arraynumeros.length);


        //FOREACH
        for(String dato:nombres){
            System.out.println(dato);
        }




    }
}