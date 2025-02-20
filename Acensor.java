package ejercicio.java;

import java.util.Scanner;


public class Acensor {

    public static void Acensor(String[] args) {
        Acensor();  
        String pisos="10";
        Scanner TomarDatos = new Scanner(System.in);
        System.out.print("ingrese el piso al que desea ir:  ");
        int Acensor = dato_Acensor.nextInt();
        int numero = TomarDatos.nextInt();
        TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
        int numero = ProcesarDatos.nextInt();
        ProcesarDatos.close();
        if(numero==10){
            System.out.println("el piso es valido");
        }else{
            System.out.println("el piso es invalido");
        }

    }
  }
