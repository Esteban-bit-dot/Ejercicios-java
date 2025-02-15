package Ejercicios.java;

import java.util.Scanner;

public class Retaurante {
    
      public static void Main(String[] args){
          String Menu();
      }
        public static void Menu (String[] args){
            Scanner TomarDatos = new Scanner(System.in);
            System.out.print("Ingrese un plato de comida: ");
            System.out.print("Ingrese el tipo de bebida: ");
            int menu = TomarDatos.nextInt();
            Scanner ProcesarDatos = new Scanner(System.in);
            int menu = ProcesarDatos.nextInt();
            switch (Menu) {
            case 'pollo frito':
                System.out.println("30.000");
                break;
            case 'gaseosas':
                System.out.println("20.000");
                break;
            case 'jugos':
                System.out.println("15.000");
                break;
             case 'arroz con pollo':
                System.out.println("10.000");
                break;
            default:
                System.out.println("Error");
                return; 
            }  
           switch (Metodo_pago) {
             case 'Efectivo':
                System.out.println(descuento: 15%);
                break;
             case 'targeta de credito':
                System.out.println(descuento: 35%);
                break;
            case 'Cheque':
                System.out.println(descuento: 0%);
                break;
    
            default:
                System.out.println("Error");
                return;
            }
       }
}
