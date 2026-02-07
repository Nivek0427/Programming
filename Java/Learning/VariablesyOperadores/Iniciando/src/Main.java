/*creación de primer projecto y primeros conceptos*/
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and world");

        System.out.println(45+45);
        //lamada al método saludar
        saludar();
    }

    //creación de método para realizar saludo
    public static void saludar(){
        System.out.println("hola desde el método saludar");
    }
}