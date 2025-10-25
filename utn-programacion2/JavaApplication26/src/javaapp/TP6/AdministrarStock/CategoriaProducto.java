
package javaapp.TP6.AdministrarStock;

public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    private final String DESCRIPCION;

    CategoriaProducto(String descripcion){
       this.DESCRIPCION = descripcion;
    }
    
    public String getDescripcion(){
        return DESCRIPCION;
    } 
    
}
