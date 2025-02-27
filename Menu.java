package ejercicios.java;

import java.util.Scanner;


public class Menu {
     public static void main(String[]args){
     Menu();
 }
     public static String Menu(String datomenu){
       String Menu = "";
       Scanner TomarDatos = new Scanner(System.in);
       Menu = dato_Menu.nextInt();
       TomarDatos.close();
       Scanner ProcesarDatos = new Scanner(System.in);
       Menu = ProcesarDatos.nextInt();
       ProcesarDatos.close();
       do {
         int texto = 0;
         int precio_Total= 0;
         int Acumulador = texto + 1;
         System.out.println("***Menu de Comida***");
         System.out.println(" 1. pollo frito $20.000 ");
         System.out.println(" 2. salchipapa $15.000");
         System.out.println("3. churro $6.000");
         System.out.println("4. pasteles $5.000");
         System.out.println("5. papa rellena $8.000");
         System.out.print("Seleccione un menu: ");
         String Precio_total = Menu();
         Menu = datoMenu.nextInt();
     }while(Menu>5){
         System.out.println("¿desea volver a comprar otra comida?: ");
     }
       return null;
   }
}
