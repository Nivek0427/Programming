public class Stringbuilder {
    public static void main(String[] args) {
        //StringBuilder es una clase que permite crear cadenas de texto de manera eficiente
        StringBuilder sb = new StringBuilder();

        sb.append("Hola"); //agregar texto al StringBuilder
        sb.append(" Mundo"); //agregar mas texto al StringBuilder

        //metodo toString para convertir el StringBuilder a String
        System.out.println(sb.toString());
    }

}
