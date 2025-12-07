
package javaapp.TP8.Parte1.Entities;
import javaapp.TP8.Parte1.Interfaces.Pagable;

public class Producto implements Pagable{
    private int id;
    private String name;
    private double price;

    public Producto() {
    }

    public Producto(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nProducto " + "id=" + id + ", name=" + name + ", price=" + price + "}";
    }

    @Override
    public double calcularTotal() {
        return getPrice();
    }
   
}
