
package javaapp.TP2;
import java.util.Scanner;

public class ejercicio7 {

    public static void ejercicio(){
        Scanner scanner = new Scanner(System.in);
        int nota;
        System.out.println("-- VALIDACIÓN DE NOTA --");
        do{
            System.out.println("Ingresa una nota entre 0 y 10: ");
            nota = scanner.nextInt();
            if (nota < 0 || nota > 10){
                System.out.println("Error: Nota inválida.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada");
    }
}
