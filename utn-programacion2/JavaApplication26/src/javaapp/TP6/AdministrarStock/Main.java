
package javaapp.TP6.AdministrarStock;

public class Main {

    public static void main(String[] args) {
        
        Producto p1 = new Producto("1", "Hamburguesa", 8500.0, 20, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("2", "Pizza", 1500.0, 100, CategoriaProducto.ALIMENTOS);
        Producto p3 = new Producto("3", "Sandwich de Pollo", 3000.0, 20, CategoriaProducto.ALIMENTOS);
        Producto p4 = new Producto("4", "iPhone 14", 85000.0, 10, CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("5", "Remera Adidas T40 Negra", 30000.0, 200, CategoriaProducto.ROPA);
        Producto p6 = new Producto("6", "Notebook Asus 16''", 650000.0, 40, CategoriaProducto.ELECTRONICA);
        Producto p7 = new Producto("7", "Silla gamer + reposa pies", 450000.0, 15, CategoriaProducto.HOGAR);
        Producto p8 = new Producto("8", "Escritorio gamer 2x3,5", 53000.0, 20, CategoriaProducto.HOGAR);
        Producto p9 = new Producto("9", "Zapatillas Nike SK8 T42", 80000.0, 20, CategoriaProducto.ROPA);
        
        Inventario inventario = new Inventario();

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        inventario.agregarProducto(p6);
        inventario.agregarProducto(p7);
        inventario.agregarProducto(p8);
        inventario.agregarProducto(p9);
        
        System.out.println("\n----Listar Productos-----\n");
        inventario.listarProductos();
        System.out.println("\n----Buscar Producto ID-----\n");
        Producto p_id = inventario.buscarProductoPorId("4");
        System.out.println(p_id.mostrarInfo());
        System.out.println("\n----Filtrar Por Categoria-----\n");
        inventario.filtrarPorCategoria(CategoriaProducto.ROPA);
        System.out.println("\n----Eliminar ID Y Mostrar-----\n");
        inventario.eliminarProducto("4");
        System.out.println("\n----Actualizar Stock-----\n");
        inventario.actualizarStock("5", 50);
        System.out.println("\n----Mostrar Total Stock-----\n");
        inventario.obtenerTotalStock();
        System.out.println("\n----Producto Mayor Stock-----\n");
        inventario.obtenerProductoConMayorStock();
        System.out.println("\n----Filtrar Precios-----\n");
        inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        System.out.println("\n----Mostrar Descripcion Categorias-----\n");
        inventario.mostrarCategoriasDisponibles();
    };
};