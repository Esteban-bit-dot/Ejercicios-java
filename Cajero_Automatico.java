package ejercicios.java;

import java.util.Scanner;

public class Cajero_Automatico {

  
    public static void main(String[] args) {
       String cajero();
    }
    public static String cajero(){
     double Saldo = "1.000000";
     String dato_saldo = "";
     Scanner TomarDatos new Scanner(System.in);
     Scanner dato_Saldo = new Scanner(System.in);
     System.out.print("ingrese el monto de desea retirar: ");
     Saldo = dato_saldo.nextDouble();
     TomarDatos.close();
     Scanner ProcesarDatos = new Scanner(System.in);
     double Saldo = ProcesarDatos.nextDouble();
     int Monto;
     while(Monto>Saldo){
        System.out.println("El monto es mayor al saldo error ");
        System.out.println("ingrese el monto que desea retirar: ");
        Saldo = dato_Saldo.nextDouble();
     } 
     return null;
  }
}
