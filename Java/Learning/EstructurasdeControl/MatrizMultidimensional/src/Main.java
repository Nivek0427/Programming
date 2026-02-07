//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [][] x = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int[] matrizinterna:x){
            for(int dato:matrizinterna){
                System.out.print(dato+"\n");
            }
        }

        int [][][] y = {
                {
                        {1,2,3},
                        {4,5,6}
                },
                {
                        {-1,-2,-3},
                        {-4,-5,-6}
                }
        };

        for (int [][] matriz2d:y){
            for(int []matriz:matriz2d){
                for(int dato:matriz){
                    System.out.print(dato);
                }
            }
        }

    }
}