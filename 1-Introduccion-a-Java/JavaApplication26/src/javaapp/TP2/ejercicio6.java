
package javaapp.TP2;
import java.util.Scanner;

public class ejercicio6 {

    public static void ejercicio(){
        Scanner scanner = new Scanner(System.in);
        int num, count = 5, countPos = 0, countNeg = 0, countZero = 0;
        System.out.println("-- CONTADOR POSITIVO, NEGATIVOS Y CEROS --");
        System.out.println("Ingresa 10 números al azar: ");
        while(count != 0){
            System.out.println("Te quedan "+ count +" intentos");
            num = scanner.nextInt();
            countPos += (num > 0) ? num : 0;
            countNeg += (num < 0) ? num : 0;
            countZero += (num == 0) ? 1 : 0;
            count--;
        }
        System.out.println("- Suma de números pares: "+ countPos);
        System.out.println("- Suma de números impares: "+ countNeg);
        System.out.println("- Suma de números ceros: "+ countZero);
    }
}
