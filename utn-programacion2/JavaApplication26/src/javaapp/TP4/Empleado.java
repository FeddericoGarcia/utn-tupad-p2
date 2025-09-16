package javaapp.TP4;

public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    public Empleado() {
        totalEmpleados++;
    }

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.id += Math.random()*100;
        this.salario = 1500;
        totalEmpleados++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public static void setTotalEmpleados(int totalEmpeados) {
        Empleado.totalEmpleados = totalEmpeados;
    }
    
    public void actualizarSalario(double aumento){
        this.salario = aumento * salario;
    }
    
    public void actualizarSalario(int aumento){
        this.salario += aumento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + 
                puesto + ", salario=" + salario + '}';
    }
    
    public static void mostrarTotalEmpleados(){
        System.out.println("Total de Empleados: \n"+ getTotalEmpleados());
    }

}
