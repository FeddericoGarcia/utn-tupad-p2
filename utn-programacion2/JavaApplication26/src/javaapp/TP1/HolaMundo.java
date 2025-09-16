package javaapp.TP1;

import java.util.Scanner;
        
public class HolaMundo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Hola, Java!");
        /****************/
        System.out.println("*************");
        /****************/
        String nombre = "Federico";
        int edad = 29;
        double altura = 175;
        boolean estudiante = true;
        
        System.out.println("Mi nombre es " + nombre + ", tengo "
        + edad + " años, mi estatura es de " + altura + " cm.\nMuchos me preguntan"
                + " si todavia estudio, yo les respondo que " + estudiante);
        /****************/
        System.out.println("*************");
        /****************/
        System.out.println("Ingresa tus datos;");
        System.out.println("1. Nombre ");
        String name = scanner.nextLine();
        System.out.println("1. Edad");
        String yearsOld = scanner.nextLine();
        System.out.println("Tu nombre es " + name + " y tienes " + yearsOld + 
                " de edad");
        /****************/
        System.out.println("*************");
        /****************/
        System.out.println("Ingresa dos números: ");
        System.out.println("Primer número: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Segundo número: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Suma: "+ (firstNumber + secondNumber));
        System.out.println("Resta: "+ (firstNumber - secondNumber));
        System.out.println("Multiplicación: "+ (firstNumber * secondNumber));
        System.out.println("División: "+ (firstNumber / secondNumber));
        /****************/
        System.out.println("*************");
        /****************/
        System.out.println("Nombre: Juan Pérez\n" + "Edad: 30 años\n" +
                "Dirección: \"Calle Falsa 123\"");
        /****************/
        System.out.println("*************");
        /****************/
        System.out.println("int x = 10 -> Expresión");
        System.out.println("- Se debe a que es una variable la cual recibe un valor");
        System.out.println("x = x + 5 -> Expresión con instrucción");
        System.out.println("- Esta es una combinación de ambas, por una parte genera una "
                + "instrucción por el cálculo que realiza\n y por otro la asignación es una"
                + "expresión.");
        System.out.println("System.out.println(x) -> Instrucción");
        System.out.println("- Esta sentencia es un pedido al IDE para que ejecute una "
                + "acción.");
        /****************/
        System.out.println("*************");
        /****************/
        System.out.println("Ingresa dos números enteros: ");
        System.out.println("Primer número: ");
        int one = scanner.nextInt();
        System.out.println("Segundo número: ");
        int two = scanner.nextInt();
        double three = (double) one / (double) two;
        System.out.println("- Resultado en entero: "+ (one / two));
        System.out.println("- Resultado en flotante: "+ three );
        /****************/
        System.out.println("*************");
        /****************/
        System.out.print("Ingresa tu nombre: ");
        String nombre2 = scanner.nextLine();
        System.out.println("Hola, " + nombre);

    }

}
