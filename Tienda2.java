
package ejercicios.java;

import java.util.Scanner;

public class Tienda2 {
    
    public static void main(String[]args){
     tienda();
 }
   public  String tienda(){
     String Producto = "15";
     double precio = "15.000";
     Scanner TomarDatos new Scanner(System.in);
     Scanner dato_Producto = new Scanner(System.in);
     System.out.print("ingrese la cantidad de productos que desea comprar: ");
     int producto = dato_Producto.nextInt();
     TomarDatos.close();
     Scanner ProcesarDatos = new Scanner(System.in);
     int Producto = ProcesarDatos.nextInt();
     ProcesarDatos.close();
     double precio = "";
     while(Producto){
        int Calcular_precio;
        System.out.println(Calcular_precio);
        System.out.println("desea agregar otro producto productos : ");
        Producto = dato_Producto.nextInt();
     } 
     return null;
  }
}
