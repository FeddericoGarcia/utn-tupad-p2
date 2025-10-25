
package javaapp.TP6.AdministrarStock;

public class Producto {
    private String id, nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto() {
    }

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(!id.isEmpty()){
            this.id = id;
        } else {
            System.out.println("No se obtuvo ID del producto");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(!nombre.isEmpty()){
            this.nombre = nombre;
        } else {
            System.out.println("No se obtuvo nombre del producto");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio > 0){
            this.precio = precio;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if(precio > 0){
            this.cantidad = cantidad;
        }
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public String mostrarInfo() {
        return "{\n" + "id=" + id + "\nnombre=" + nombre + "\nprecio=" + precio 
                + "\ncantidad=" + cantidad + "\ncategoria=" + categoria + '}';
    }

}
