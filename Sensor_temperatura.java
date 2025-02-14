package ejercicio.java;

import java.util.Scanner;

public class Sensor_Teperatura {
    
    public static void Sensor(String[] args){
      temperatura();
  }
    public static String temperatura(){
        String temperatura= "25";
        Scanner TomarDatos = new Scanner(System.in);
        System.out.print("ingrese la temperatura: ");
       int numero = TomarDatos.nextInt();
       TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
       int numero = ProcesarDatos.nextInt();
       ProcesarDatos.close();
        return null;
        int temp = 0;
        if(temp<=25){
            System.out.println("La tempreatura es valida");
        }else{
            System.out.println("La temperatura es invalida");
        }
        return null;
}
