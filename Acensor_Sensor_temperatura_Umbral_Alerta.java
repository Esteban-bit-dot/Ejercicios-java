package Ejercicios.java;

import java.util.Scanner;

public class Acesor_Sensor_Temperatura_Umbral_Alerta {

        public static void temperatura(String[] args) {
        Scanner TomarDatos = new Scanner(System.in);
        System.out.print("Ingrese la temperatura ambiente (°C): ");
        int temperatura = TomarDatos.nextInt();
        int Sensor = dato_Sensor.nextInt();
        // Rango de temperatura aceptable
        int temp = 25;
        TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
        int temperatura = ProcesarDatos.nextInt();
        int Sensor = dato_Sensor.nextInt();
        ProcesarDatos.close();
        if (temperatura <= temp) {
            // Si la temperatura está dentro del rango, el ascensor puede moverse
            System.out.print("Ingrese el piso deseado: ");
            
        } else(Alerta=temp) {
            // Si la temperatura está fuera del rango, mostrar mensaje y no moverse
            System.out.println("Alerta La temperatura no es adecuada para mover el ascensor.");
        }
         return null;
      }
}
