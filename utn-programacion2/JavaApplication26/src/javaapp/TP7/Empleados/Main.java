
package javaapp.TP7.Empleados;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        
        Empleado e1 = new EmpleadoTemporal();
        Empleado e2 = new EmpleadoFijo();
        Empleado e3 = new EmpleadoTemporal();
        Empleado e4 = new EmpleadoFijo();
        
        listaEmpleados.add(e1);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        
        for (int i = 0; i < listaEmpleados.size(); i++) {
            Empleado e = listaEmpleados.get(i);
            System.out.println("Empleado: "+ (i+1) + 
                    " - Sueldo: "+ e.calcularSueldo(e));
        }
    }
}
