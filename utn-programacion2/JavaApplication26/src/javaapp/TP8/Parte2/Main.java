
package javaapp.TP8.Parte2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javaapp.TP8.Parte2.CustomExceptions.EdadInvalidaException;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, Exception {
        mostrarMenu();
    }
    public static void mostrarMenu() throws FileNotFoundException, Exception{
        Scanner sc = new Scanner(System.in);
        
        int opt = -1;

        while (opt != 0) {
            System.out.println("Ingresá la opción deseada: ");
            System.out.println("1. Division Segura");
            System.out.println("2. Conversion Cadena a Número");
            System.out.println("3. Lectura de archivo");
            System.out.println("4. Verificar Edad");
            System.out.println("5. Leer buffer");
            System.out.println("0. Salir");
            
            opt = sc.nextInt();

            switch(opt){
                case 1: divisionSegura(); break;
                case 2: conversionCadenaNumero(); break;
                case 3: lecturaArchivo(); break;
                case 4: verificarEdad(); break;
                case 5: leerBuffer(); break;
                case 0: { 
                    System.out.println("Saliendo del sistema");
                    return;
                }
                default: 
                    System.out.println("Opción incorrecta.");
            }
        }
    }
        
    public static void divisionSegura() throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Divisón segura");
        int result, num1, num2;
        System.out.println("Ingresa el primer número");
        num1 = sc.nextInt();
        System.out.println("Ingresa el segundo número");
        num2 = sc.nextInt();

        try{
            result = num1 / num2;
            System.out.println("Tu resultado es: "+ result);
        } catch (ArithmeticException e){
            System.out.println("No es posible realizar una división por 0 (cero). \n"+ e.getMessage());
        } 
        System.out.println("------------------------\n");

    }

    public static void conversionCadenaNumero() throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversion de String a Int");
        System.out.println("Ingresa una cadena de texto: ");
        String input = sc.nextLine(); 
        
        try {
            int result = Integer.parseInt(input);
            System.out.println("El número convertido es: "+ result);
        } catch(NumberFormatException e) {
            System.out.println("No es posible convertir tu texto a formato numérico. \n"+ e.getMessage());
        } 
        System.out.println("------------------------\n");

    }

    public static void lecturaArchivo() throws FileNotFoundException, Exception{
        System.out.println("Lectura de archivo de texto");

        try{
           File file = new File("texto.txt");
           Scanner reader = new Scanner(file);
           
           System.out.println("------------------------");
           while (reader.hasNextLine()){
               System.out.println(reader.nextLine());
           }

           reader.close();

        } catch (FileNotFoundException e){
            System.out.println("No se encontró el archivo seleccionado. \n"+ e.getMessage());
        } 
        System.out.println("------------------------\n");

    }

    public static void verificarEdad() throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int age;
        try {
            age = sc.nextInt();
            if (age <= 0 || age > 120){
                throw new EdadInvalidaException("Edad invalida");
            } else {
                System.out.println("Tenes "+ age +" años!");
            }
        } catch (EdadInvalidaException e){
            System.out.println("No es posible ingresar un valor menor a 0 y mayor a 120.\n");
            e.getMessage();
        }
        System.out.println("------------------------\n");
    }

    public static void leerBuffer() throws IOException{
 
        File file = new File("texto.txt");

        try (BufferedReader br = new BufferedReader(new java.io.FileReader(file))) {
            String linea;
            System.out.println("------------------------");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo:");
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------\n");

    }
        
}
        