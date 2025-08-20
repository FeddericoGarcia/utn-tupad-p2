
package javaapp.TP2;

public class ejercicio12 {
    
    public static void ejercicio(){
        System.out.println("-- LISTA DE PRECIOS --");
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Lista de precios: ");
        mostrarPrecios(precios);
        precios[2] = 129.99;
        System.out.println("Lista de precios modificados: ");
        mostrarPrecios(precios);
    }
    
    public static void mostrarPrecios(double[] precios) {
        for (double precio : precios) {
            System.out.println("Precio: $" + precio);
        }
    }
}
