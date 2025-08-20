
package javaapp.TP2;
import java.util.Scanner;

public class ejercicio4 {

    public static void ejercicio(){
        Scanner scanner = new Scanner(System.in);
        double productPrice, productDiscount;
        String categoryOption;
        System.out.println("-- CALCULADORA DE DESCUENTO x CATEGORÍA --");
        System.out.println("Ingresa el precio del producto: ");
        productPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Ingresa la categoría (puede ser A, B o C): ");
        categoryOption = scanner.nextLine();
        System.out.println("---------------------");
        productDiscount = categoryOption.equalsIgnoreCase("A") ? 
                0.10 : (categoryOption.equalsIgnoreCase("B") ? 
                0.15 : (categoryOption.equalsIgnoreCase("C") ? 0.20 : 0));
        System.out.println("- El precio del producto es $" + productPrice);
        System.out.println("- El desucento aplicado es " + (productDiscount*100) + "%");
        System.out.println("- El precio total es $" + (productPrice - 
                (productPrice * productDiscount)));      
    }
}
