import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("ingrese un número de día de la semana: ");
        int n = leer.nextInt();

        switch (n){
            case 1:
                System.out.println("el día es lunes");
                break;
            case 2:
                System.out.println("el día es martes");
                break;
            case 3:
                System.out.println("el día es miercoles");
                break;
            case 4:
                System.out.println("el día es jueves");
                break;
            case 5:
                System.out.println("el día es viernes");
                break;
            case 6:
                System.out.println("el día es sábado");
                break;
            case 7:
                System.out.println("el día es domingo");
                break;
            default:
                System.out.println("el número ingresado es incorrecto");
        }
    }
}