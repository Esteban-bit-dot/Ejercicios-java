package Ejercicios.java;

import java.util.Scanner;


public class IMC {
    public static void main (String[] args){
     IMC();
    }
    public static void IMC (String[] args){
    Scanner TomarDatos = new Scanner(System.in);
    System.out.print("Ingrese su peso en kg: ");
    int peso = Scanner.nextInt();
    System.out.print("Ingrese su altura en metros: ");
    int altura = Scanner.nextInt(); 
    int imc = TomarDatos.nextInt();
    Scanner ProcesarDatos = new Scanner(System.in);
    int imc = ProcesarDatos.nextInt();
    switch (imc == Peso/Altura^[2]) {
            case 'Menor a 18.5':
                System.out.println("Bajo Peso");
                break;
            case 'Menor a 24.9':
                System.out.println("Peso Normal");
                break;
            case 'Menor a 29.9':
                System.out.println("SobrePeso");
                break;
             case 'Mayor a 29.90':
                System.out.println("Obecidad");
                break;
            default:
                System.out.println("Error");
                return;
      }
    }
}
