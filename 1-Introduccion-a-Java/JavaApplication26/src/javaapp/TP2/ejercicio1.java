
package javaapp.TP2;
import java.util.Scanner;

public class ejercicio1 {
    
     public static void ejercicio(){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("-- AÑO BISIESTO --");
        System.out.println("Ingresá el número de algun año: ");
        int num = scanner.nextInt();
        if (num%4==0 && num%100!=0 || num%400==0){
            System.out.println("¡El año es bisiesto!");
        } else {
            System.out.println("El año NO es bisiesto.");
        }
     }
     
}
