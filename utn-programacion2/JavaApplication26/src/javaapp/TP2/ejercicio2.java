
package javaapp.TP2;
import java.util.Scanner;

public class ejercicio2 {
    
    public static void ejercicio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- EL MAYOR DE TRES --");
        System.out.println("Ingresá el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingresá el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Ingresá el tercer número:");
        int num3 = scanner.nextInt();
        int mayor = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : 
                        ((num2 > num3) ? num2 : num3);
        System.out.println("El número mayor es el "+ mayor );
    }
}
