
package javaapp.TP3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
        //Ejercicio #1 - Registro de Estudiantes
        System.out.println("Ejercicio #1 - Registro de Estudiantes");
        Estudiante e = new Estudiante();
        System.out.println("Ingresa los datos del estudiante");
        System.out.println("Nombre:");
        e.setNombre(scanner.nextLine());
        System.out.println("Apellido:");
        e.setApellido(scanner.nextLine());
        System.out.println("Curso:");
        e.setCurso(scanner.nextLine());
        System.out.println("Calificación:");
        e.setCalificacion(scanner.nextFloat());
        
        System.out.println(e.mostrarInfo());
        System.out.println("bajarCalificacion(5)");
        e.bajarCalificacion(5);
        System.out.println("subirCalificacion(3)");
        e.subirCalificacion(3);
        System.out.println(e.mostrarInfo());
        
        //Ejercicio #2 - Registro de Mascotas
        System.out.println("Ejercicio #2 - Registro de Mascotas");
        Mascota m = new Mascota();
        System.out.println("Ingresa los datos de la mascota");
        System.out.println("Nombre: ");
        m.setNombre(scanner.nextLine());
        System.out.println("Especie: ");
        m.setEspecie(scanner.nextLine());
        System.out.println("Edad: ");
        m.setEdad(scanner.nextInt());
        
        System.out.println(m.mostrarInfo());
        System.out.printf("... Despúes de 2 año ...\n");
        m.cumplirAnios();
        m.cumplirAnios();
        System.out.println(m.mostrarInfo());
        
        //Ejercicio #3 - Encapsulamiento con la Clase Libro
        System.out.println("Ejercicio #3 - Encapsulamiento con la Clase Libro");
        Libro l = new Libro();
        System.out.println("Ingresa los datos del libro ");
        System.out.println("Titulo: ");
        l.setTitulo(scanner.nextLine());
        System.out.println("Autor: ");
        l.setAutor(scanner.nextLine());
        System.out.println("Año de publicación: ");
        l.setAnioPublicacion(scanner.nextInt());
        
        System.out.println("Intento de modificación inválido (mayor al año actual) ");
        l.setAnioPublicacion(scanner.nextInt());
        System.out.println("Valor actual de Año Publicado: "+ l.getAnioPublicacion());
        System.out.println("Setteo Año = 2022");
        l.setAnioPublicacion(2022);
        System.out.println(l.getAnioPublicacion());
        System.out.println("Titulo: "+ l.getTitulo() +
                "\nAutor: "+ l.getAutor() + 
                "\nAño de Publicación: "+ l.getAnioPublicacion());
        
        //Ejercicio #4 - Gestión de Gallinas en Granja Digital 
        System.out.println("Ejercicio #4 - Gestión de Gallinas en Granja Digital");
        Gallina g1 = new Gallina();
        Gallina g2 = new Gallina();
        System.out.println("Simulación de gallinas ");
        g1.setIdGallina(1);
        g1.setEdad(3);
        g1.setHuevosPuestos(500);
        System.out.println("Gallina1:\nID="+ g1.getIdGallina() + ", \nEdad=" + 
                g1.getEdad() +"\nHuevosPuestos="+ g1.getHuevosPuestos());
        g2.setIdGallina(2);
        g2.setEdad(1);
        g2.setHuevosPuestos(120);
        System.out.println("Gallina2:\nID="+ g2.getIdGallina() + ", \nEdad=" + 
                g2.getEdad() +"\nHuevosPuestos="+ g2.getHuevosPuestos());
        **/
        //Ejercicio #5 - Simulación de Nave Espacial 
        System.out.println("Ejercicio #5 - Simulación de Nave Espacial ");
        NaveEspacial nave1 = new NaveEspacial();
        NaveEspacial nave2 = new NaveEspacial();
        nave1.setNombre("Nave 1");
        nave1.setCombustible(0);
        nave1.mostrarEstado();
        nave1.avanzar(100);
        nave1.despegar();
        nave1.recargarCombustible(100);
        nave1.avanzar(100);
        nave1.despegar();
        nave1.mostrarEstado();
        
        
    }

}
