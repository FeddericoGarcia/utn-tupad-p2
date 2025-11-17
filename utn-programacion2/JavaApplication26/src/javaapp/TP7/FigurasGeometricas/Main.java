
package javaapp.TP7.FigurasGeometricas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figura> listaFiguras = new ArrayList<>();
        
        Circulo c1 = new Circulo("Circulo #1",4);
        Circulo c2 = new Circulo("Circulo #2",8);
        Rectangulo r1 = new Rectangulo("Rectangulo #1",3,5);
        Rectangulo r2 = new Rectangulo("Rectangulo #1",2,8);
        
        listaFiguras.add(c1);
        listaFiguras.add(c2);
        listaFiguras.add(r1);
        listaFiguras.add(r2);
        
        for (Figura f : listaFiguras){
            f.calcularArea();
        }
        
    }
}
