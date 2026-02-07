public class Definicion_funciones_metodos {
    public static void main(String[] args) {

        //llamar a la funcion
        saludar();

        //crear un objeto de la clase para llamar al metodo (aún no visto)
        Definicion_funciones_metodos obj = new Definicion_funciones_metodos();
        obj.despedir("Juan");

    }

    //definir funcion
    static void saludar(){
        System.out.println("hola");
    }
    //definir metodo
    public void despedir(String nombre){
        System.out.println("Adios " + nombre);
    }
}
