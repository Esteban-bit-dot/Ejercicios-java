package ejecicios.java;

import java.util.Scanner;

public class Resultado_Examen {
    
    public static void main(String[] args) {
        Sensor();
    }
    public  String Sensor(){
        String Resultado = "";
        Scanner TomarDatos = new Scanner(System.in);
        Resultado = dato_Resultado.nextInt();
        TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
        Resultado = dato_Resultado.nextInt();
        ProcesarDatos.close();
        boolean Reprobado = false;
        do{
          var Resultado = 0;
          if (Resultado){
            System.out.print("Ingrese la nota del Aprendiz: ");
              boolean Calcular_promedio = true;
            System.out.print(Calcular_promedio);
          }else{
            System.out.print("Error");
          }
        }while(Reprobado){
           System.out.print("Ingrese de nuevo la nota: ");
        }
      return null;  
    } 
}
