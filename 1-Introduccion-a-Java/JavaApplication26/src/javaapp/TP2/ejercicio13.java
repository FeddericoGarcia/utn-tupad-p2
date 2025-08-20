
package javaapp.TP2;

public class ejercicio13 {
    
    public static void ejercicio(){
        System.out.println("-- LISTA DE PRECIOS --");
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Lista de precios: ");
        imprimirRecursivo(precios, 0);
        precios[2] = 129.99;
        System.out.println("Lista de precios modificados: ");
        imprimirRecursivo(precios, 0);
    }
    
    public static void imprimirRecursivo(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            imprimirRecursivo(precios, indice + 1);
        }
    }
}
