
package ejercicios.java;

import java.util.Scanner;

public class impresora {
    public static void main(String[]args){
    Pagina();
 }
  public static String Pagina (){
     String Papel="100.000";
     Scanner TomarDatos new Scanner(Stystem.in);
     Scanner dato_Papel = new Scanner(System.in);
     System.out.print("ingrese la cantidad de paginas que desea imprimir: ");
     Papel = dato_Papel.nextInt();
     TomarDatos.close();
     Scanner ProcesarDatos = new Scanner(System.in);
     int Papel = ProcesarDatos.nextInt();
     ProcesarDatos.close();
     String Paginas;
     while(Paginas>Papel){
        System.out.println("Papel insuficiente");
        System.out.println("ingrese la cantidad de paginas que desea imprimir de nuevo: ");
        Papel = dato_Papel.nextInt();
     } 
     return null;
  }
}
