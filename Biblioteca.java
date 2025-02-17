package ejercicios.java;

import java.util.Scanner;


public class Biblioteca {
     public static void main(String[]args){
     libro();
 }
     public static String libro(){
       String libro = "";
       Scanner TomarDatos = new Scanner(System.in);
       Libro = dato_Libro.nextInt();
       TomarDatos.close();
       Scanner ProcesarDatos = new Scanner(System.in);
       libro = ProcesarDatos.nextInt();
       ProcesarDatos.close();
       do {
         int texto = 0;
         int Acumulador = texto + 1;
         System.out.println("ingrese el titulo del libro: ");
         System.out.println("ingrese el Numbre del autor: ");
         System.out.println("Ingrese el numero de paginas: ");
         libro= dato_Libro.nextInt();
     }while(libro>5){
         
     }
       return null;
   }
} 
