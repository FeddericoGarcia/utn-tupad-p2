
package javaapp.TP2;
import java.util.Scanner;

public class ejercicio11 {
    static double descuento = 0.10;
    
    public static void ejercicio(){
        Scanner scanner = new Scanner(System.in);
        double precio;
        System.out.println("-- VARIABLE GLOBAL --");
        System.out.println("Ingresa el precio del producto: ");
        precio = scanner.nextDouble();
        System.out.println("El precio con descuento es $"+ 
                (precio - calcularDescuentoEspecial(precio)));
    }
    
    public static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * descuento;
        System.out.println("El descuento aplicado es del "+ descuentoAplicado + "%");
        return descuentoAplicado;
    }
}
