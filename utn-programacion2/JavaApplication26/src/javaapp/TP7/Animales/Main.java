
package javaapp.TP7.Animales;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> listAnimales = new ArrayList<>();
        
        Animal a1 = new Gato();
        Animal a2 = new Perro();
        Animal a3 = new Vaca();
        
        listAnimales.add(a1);
        listAnimales.add(a2);
        listAnimales.add(a3);
        
        for (Animal a : listAnimales){
            a.describirAnimal();
            a.hacerSonido();
            System.out.println("----");
        }
        
    }
}
