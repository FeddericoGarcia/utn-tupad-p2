
package javaapp.TP7.FigurasGeometricas;

import static java.lang.Math.PI;

public class Circulo extends Figura {
    private double radio;
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        System.out.println(nombre.toUpperCase() +
                "\n Area: "+ (radio * PI));
    }
}

