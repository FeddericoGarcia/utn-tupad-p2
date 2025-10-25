
package javaapp.TP6.AdministrarStock;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto prod){
        if (!productos.contains(prod)){
            productos.add(prod);
            System.out.println("Producto "+ prod.getNombre() +
                    " agregado exitosamente");
        } else {
            System.out.println("El producto "+ prod.getNombre() +" ya existe en la lista");
        }
    }
    
    public void listarProductos(){
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }
        for (Producto p : productos){
            System.out.println(p.mostrarInfo());
        }
    }
    
    public Producto buscarProductoPorId(String id){
        for (Producto p : productos){
            if (p.getId().equalsIgnoreCase(id)){
                System.out.println("Producto encontrado:");
                p.mostrarInfo();
                return p;
            }
        }
        System.out.println("No se encontró el producto con ID " + id);
        return null;
    }
    
    public void eliminarProducto(String id){
        Producto productoAEliminar = null;
        for (Producto p : productos){
            if (p.getId().equalsIgnoreCase(id)){
                productoAEliminar = p;
                break;
            }
        }

        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            System.out.println("Producto con ID " + id + " eliminado correctamente.");
        } else {
            System.out.println("No se encontró un producto con ID " + id + ".");
        }
        listarProductos();
    }

    public void actualizarStock(String id, int nuevaCantidad){
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock del producto " + p.getNombre() +
                    " actualizado a " + nuevaCantidad + " unidades.");
        } else {
            System.out.println("No se encontró el producto con ID " + id + ".");
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria){
        boolean encontrado = false;
        System.out.println("Filtrando por categoria: "+ categoria);
        for (Producto p : productos){
            if (p.getCategoria().equals(categoria)){
                System.out.println(p.mostrarInfo());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en la categoría " + categoria);
        }
    }
        
    public void obtenerTotalStock(){
        int total = 0;
        for (Producto p : productos){
            total += p.getCantidad();
        }
        System.out.println("Stock total disponible: " + total);
    }
    
    public void obtenerProductoConMayorStock(){
        if (productos.isEmpty()) {
            System.out.println("No hay productos cargados.");
            return;
        }

        Producto productoMayor = productos.get(0);

        for (Producto p : productos){
            if (p.getCantidad() > productoMayor.getCantidad()){
                productoMayor = p;
            }
        }

        System.out.println("El producto con mayor stock es " + productoMayor.getNombre().toUpperCase() +
                " con un total de " + productoMayor.getCantidad() + " unidades.");
    }
    
    public void filtrarProductosPorPrecio(double min, double max){
        boolean encontrado = false;
        System.out.println("Productos con precio entre $" + min + " y $" + max + ":");
        for (Producto p : productos){
            if(p.getPrecio() >= min && p.getPrecio() <= max){
                System.out.println(p.mostrarInfo());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron productos en ese rango de precios.");
        }
    }
    
    public void mostrarCategoriasDisponibles(){
        System.out.println("Categorías disponibles:");
        for (CategoriaProducto cat : CategoriaProducto.values()) {
            System.out.println(cat.name() + " - " + cat.getDescripcion());
        }
    }
}