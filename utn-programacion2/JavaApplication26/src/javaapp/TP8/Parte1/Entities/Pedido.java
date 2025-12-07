
package javaapp.TP8.Parte1.Entities;

import java.util.ArrayList;
import javaapp.TP8.Parte1.Interfaces.Pagable;


public class Pedido implements Pagable{
    private ArrayList<Producto> product_list;
    private Cliente cte;

    public Pedido() {
        this.product_list = new ArrayList<>();
    }

    public Pedido(ArrayList<Producto> product_list) {
        this.product_list = new ArrayList<>();
    }

    public ArrayList<Producto> getProduct_list() {
        return product_list;
    }

    public void setProduct_list(Producto product) {
        product_list.add(product);
    }

    public void changeState(boolean new_state){
        if (new_state){
            cte.notifyToCustomer();
        }
    }
    
    @Override
    public String toString() {
        return "Pedido{" + "product_list=" + product_list + '}';
    }

    @Override
    public double calcularTotal() {
        double result = 0; 
        for (int i = 0; i < product_list.size(); i++) {
            result += product_list.get(i).getPrice();
        }
        return result;
    }

}
