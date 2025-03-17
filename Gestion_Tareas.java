package ejecicios.java;

import java.util.Scanner;

public class Tarea {
    
    public static String descripcion(){
        String Descripcion = "";
        Scanner TomarDatos = new Scanner(System.in);
        Descripcion = dato_Descripcion.nextInt();
        TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
        Descripcion= dato_Descripcion.nextInt();
        ProcesarDatos.close();
        int descripcion = 0;
        do{
            int Acumulador = descripcion + 1;
           System.out.println("ingrese el nombre de la tarea: ");
           System.out.println("ingrese la fecha de vencimiento: ");
        }while (descripcion + 1){
             System.out.print("¿desea hacer gregar mas tareas?: ");
        }
      return null;  
    } 
}
