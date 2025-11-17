
package javaapp.TP7.Empleados;

public abstract class Empleado {
    public double calcularSueldo(Empleado e){
        if (e instanceof EmpleadoFijo){
            return 1500000.0;
        } else if (e instanceof EmpleadoTemporal){
            return 1000000.0;
        } else {
            return 0;
        }
    }
}
