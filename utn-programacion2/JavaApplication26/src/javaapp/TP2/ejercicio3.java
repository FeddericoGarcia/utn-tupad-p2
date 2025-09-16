
package javaapp.TP2;
import java.util.Scanner;

public class ejercicio3 {
    
    public static void ejercicio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-- CLASIFICACIÓN DE EDAD --");
        System.out.println("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        if (edad > 0 && edad < 12){
            System.out.println("Eres un/a Niño/a");
        } else if (edad >= 12 && edad <= 17){
            System.out.println("Eres Adolescente");
        } else if ( edad >= 18 && edad <= 59){
            System.out.println("Sos Adulto/a");
        } else {
            System.out.println("Eres un/a Adulto/a mayor");
        }
    }
}
