
package javaapp.TP8.Parte1.AppMain;

import javaapp.TP8.Parte1.Entities.PayPal;
import javaapp.TP8.Parte1.Entities.Producto;
import javaapp.TP8.Parte1.Entities.Pedido;
import javaapp.TP8.Parte1.Entities.TarjetaDeCredito;

public class Main {

    public static void main(String[] args) {
        Producto prod_1 = new Producto(1, "Alfajor", 50.0);
        Producto prod_2 = new Producto(2, "Chocolate", 100.0);
        Producto prod_3 = new Producto(3, "Coca-Cola 1.5ml", 75.0);
        Producto prod_4 = new Producto(4, "Sprite 500ml", 50.0);
        
        Pedido new_order = new Pedido();
        
        new_order.setProduct_list(prod_1);
        new_order.setProduct_list(prod_2);
        new_order.setProduct_list(prod_3);
        new_order.setProduct_list(prod_4);
        
        TarjetaDeCredito tc_1 = new TarjetaDeCredito();
        tc_1.setAmount(150000.0);
        
        PayPal pp_1 = new PayPal();
        pp_1.setAmount(200.0);
        
        System.out.println("----------------------------------");
        System.out.println("Productos agregados en el carrito: ");
        System.out.println(new_order.getProduct_list());
        System.out.println("----------------------------------");
        System.out.println("El total de la compra es de $"+ new_order.calcularTotal());
        System.out.println("----------------------------------");
        System.out.println("Realizar pago con TC: ");
        tc_1.procesarPago(new_order.calcularTotal());
        System.out.println("----------------------------------");
        System.out.println("Realizar pago con PayPal: ");
        pp_1.procesarPago(new_order.calcularTotal());
        System.out.println("----------------------------------");

    }

}