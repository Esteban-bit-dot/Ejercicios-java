
package ejecicios.java;

import java.util.Scanner;

public class Sensor_temperatura {

   
    public static void main(String[] args) {
        Sensor();
    }
    public static String Sensor(){
        String Temperatura = "";
        Scanner TomarDatos = new Scanner(System.in);
        Temperatura = dato_Temperatura.nextInt();
        TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
        Temperatura = dato_Temperatura.nextInt();
        ProcesarDatos.close();
        boolean Alerta = true;
        do{
          int temp = 0;
          if (temp>25){
            System.out.print("ingrese la temperatura (c°): ");
          }else{
            System.out.print("Alerta la temperatura es muy alta");
          }
        }while(Alerta){
           System.out.print("ingrese de nuevo la tempeartura (c°): ");
        }
      return null;  
    } 
}
