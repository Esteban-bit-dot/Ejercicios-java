
package ejercicios.java;

import java.util.Scanner;

public class impresora {
    public static void main(String[]args){
    Pagina();
 }
  public static String Pagina (){
     double Papel="100.000";
     Scanner TomarDatos new Scanner(System.in);
     Scanner dato_Papel = new Scanner(System.in);
     System.out.print("ingrese la cantidad de paginas que desea imprimir: ");
     double Papel = dato_Papel.nextDouble();
     int pagina = dato_pagina.nextInt();
     TomarDatos.close();
     Scanner ProcesarDatos = new Scanner(System.in);
     double Papel = ProcesarDatos.nextDouble();
     ProcesarDatos.close();
     String Paginas;
     while(Paginas>Papel){
        System.out.println("Papel insuficiente");
        System.out.println("ingrese la cantidad de paginas que desea imprimir de nuevo: ");
        double Papel = dato_Papel.nextDouble();
        int pagina = dato_pagina.nextInt();
         break;
     } 
     return null;
  }
}
