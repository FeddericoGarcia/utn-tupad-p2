
package javaapp.TP2;
import java.util.Scanner;

public class ejercicio5 {

    public static void ejercicio(){
        Scanner scanner = new Scanner(System.in);
        int num, amount = 0;
        System.out.println("-- SUMA DE NÚMEROS PARES --");
        System.out.println("Ingresa un número, o '0' para finalizar: ");
        num = scanner.nextInt();
        while(num != 0){
            amount += (num % 2 == 0) ? num : 0;
            System.out.println("Ingresa un número");
            num = scanner.nextInt();
        }
        System.out.println("- La suma total de los pares es: " + amount);
    }
}
