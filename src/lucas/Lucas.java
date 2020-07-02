package lucas;
import java.util.ArrayList;
import java.util.Scanner;

public class Lucas {

    public static void main(String[] args) {
        //secuencia hasta 20
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(1);

        for (int i = 2; i < 20; i++) {
            int a = numeros.get(i - 1) + numeros.get(i - 2);
            //System.out.println(i + 1 + " " + a);
            numeros.add(a);
        }

        // el 18th numero de lucas
        System.out.println(numeros.get(17));

        //el numero de lcas mas cercano a 1000
        int b = 0;
        for (int i = 0; i < 20; i++) {
            if (numeros.get(i) <= 1000) {
                b = numeros.get(i);
                //break;
            }
        }
        System.out.println("el numero mas cercano a 1000: " + b);

        //el primer numero mas grande que 100
        int c = 0;
        for (int i = 0; i < 20; i++) {
            if (numeros.get(i) >= 100) {
                c = numeros.get(i);
                break;
            }
        }
        System.out.println("el numero mas grande a 100: " + c);
    }
}
