
package javaapp.TP7.FigurasGeometricas;

public class Rectangulo extends Figura{
    private double base, altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println(nombre.toUpperCase() +
                "\n Area: "+ (base * altura));
    }

}
