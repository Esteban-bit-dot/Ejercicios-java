package ejercicio.java;

import java.util.Scanner;

public class Acensor_limite_peso {

    
 public static void Acesor_limite_peso(String[] args){
      peso();
  }
 public static void peso(){
     String peso="";
  Scanner TomarDatos = new Scanner(System.in);
   System.out.print("ingrese su peso: ");
   int numero = TomarDatos.nextInt();
   TomarDatos.close();
    Scanner ProcesarDatos = new Scanner(System.in);
    int numero = ProcesarDatos.nextInt();
   ProcesarDatos.close();
   if(imc==p/h^[2]){
       System.out.println("El peso es valido");
   }else{
       System.out.println("El peseo no es valido");
   }
 }
}
