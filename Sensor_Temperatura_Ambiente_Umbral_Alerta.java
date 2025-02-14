package ejercicio.java;

 import java.util.Scanner;

public class Sensor_temperatura_ambiente_umbral_alerta {
     
     public  static  void main(String[]args){
      Sensor();
}
     public static  String Sensor (){
    Scanner TomarDatos = new Scanner(System.in);
       String Temperatura="25";
        System.out.print("ingrese la temperatura: ");
       int numero = TomarDatos.nextInt();
       TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
       int numero = ProcesarDatos.nextInt();
       ProcesarDatos.close();
        int temp = 0;
        if(temp<=25){
            System.out.println("La tempreatura es valida");
        }else{
            System.out.println("Alerta temperatura invalida");
        }
         return null;
}
}
