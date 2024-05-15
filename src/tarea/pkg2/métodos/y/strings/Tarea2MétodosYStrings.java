/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.pkg2.métodos.y.strings;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Tarea2MétodosYStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();

    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        boolean respuesta = true;
        while (respuesta == true) {
            System.out.println(" Ejercicios Métodos y String ");
            System.out.println("1. Replace");
            System.out.println("2. Factorial");
            System.out.println("3. Mensaje");
            System.out.println("4. Promedio");
            System.out.println("5. Aprobados y reprobados");
            System.out.println("6. Contains");
            System.out.println("7. Salir del programa");
            System.out.println("Ingrese la opcion: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    opcion1();
                    break;
                case 2:
                    opcion2();
                    break;
                case 3:
                    opcion3();
                    break;
                case 4:
                    opcion4();
                    break;
                case 5:
                    opcion5();
                    break;
                case 6:
                    opcion6();
                    break;
                case 7:
                    respuesta = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    respuesta = false;
                    break;
            }
        }
        System.out.println("");

    }

    public static void opcion1() {
        Scanner scanner = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        System.out.println("Ingrese la palabra: ");
        String palabra = string.nextLine();
        System.out.println("Ingrese la letra o caracter que se desea cambiar: ");
        char caracter = scanner.next().charAt(0);
        System.out.println("Ingrese la letra o caracter que se cambiaria por: ");
        char remplazo = scanner.next().charAt(0);
        System.out.println("Nueva palabra: " + remplazo(palabra, caracter, remplazo));
    }

    public static String remplazo(String palabra, char caracter, char remplazo) {
        int tamano = palabra.length();
        String palabranueva = "";
        for (int i = 0; i < tamano; i++) {
            char c = palabra.charAt(i);
            if (c == caracter) {
                palabranueva += remplazo;
            } else if (c != caracter) {
                palabranueva += c;
            }
        }
        return palabranueva;
    }

    public static void opcion2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese n numero: ");
        int numero = scanner.nextInt();
        System.out.println("El factorial: "+factorial(numero) );
    }
    public static String factorial (int numero){
        String factorialPantalla = "";
        for (int i = 1; i <= numero; i++) {
            factorialPantalla += i + " x ";
        }
        int cont = 1;
        for (int i = 1; i <= numero; i++) {
            cont *= i;
        } factorialPantalla += " = " + cont;
        return factorialPantalla;
    }

    public static void opcion3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto: ");
        String texto = scanner.nextLine();
        System.out.println("Su cadena de texto: " + texto);
    }

    public static void opcion4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nota #1: ");
        int nota1 = scanner.nextInt();
        System.out.println("Ingrese nota #2: ");
        int nota2 = scanner.nextInt();
        System.out.println("Ingrese nota #3: ");
        int nota3 = scanner.nextInt();
        System.out.println("Ingrese nota #4: ");
        int nota4 = scanner.nextInt();
        System.out.println("El promedio de las 4 notas es: " + promedio(nota1, nota2, nota3, nota4));

    }

    public static int promedio(int nota1, int nota2, int nota3, int nota4) {
        int sumar = 0;
        int promedio = 0;
        if (nota1 >= 0 && nota2 >= 0 && nota3 >= 0 && nota4 >= 0) {
            sumar = nota1 + nota2 + nota3 + nota4;
            promedio = sumar / 4;
        } else {
            System.out.println("Notas invalidas");
        }
        return promedio;
    }

    public static void opcion5() {
        if (AproRepro()) {
            System.out.println("El alumno aprobo.");
        } else {
            System.out.println("El alumno reprobo.");
        }
    }

    public static boolean AproRepro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nota: ");
        int nota = scanner.nextInt();
        if (nota >= 60) {
            return true;
        } else {
            return false;
        }
    }

    public static void opcion6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cadena principal: ");
        String cadena1 = scanner.nextLine();
        System.out.println("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine();
        boolean contiene = verificar(cadena1, cadena2);
        if (contiene == true){
            System.out.println("La segunda cadena si se encuentra en la cadena principal ");
        } else if (contiene != true){
            System.out.println("La segunda cadena no se encuentra en la cadena principal ");
        } else {
            System.out.println("Datos invalido");
        }
    }
    public static boolean verificar (String cadena1, String cadena2){
        if (cadena1.contains(cadena2)){
            return true;
        } else {
            return false;
        }
    }
}
