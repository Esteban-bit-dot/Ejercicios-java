package Ejercicios.java;

import java.util.Scanner;

public class Asistencia_Virtual_Cine {
    
    public static void main (String[] args){
         String Cine();  
    }
    public static void Cine (String[] args){
         Scanner TomarDatos = new Scanner(System.in);
         System.out.print("Ingrese una Edad: ");
         int Edad = dato_Edad.nextInt();
         int Cine = TomarDatos.nextInt();
         Scanner ProcesarDatos = new Scanner(System.in);
         int Cine = ProcesarDatos.nextInt();
          switch (Edad) {
            case 'niños 7 años':
                System.out.println("peliculas animadas y educativas");
                break;
            case 'Niños y Adolecentes 7 y 17 años':
                System.out.println("peliculas animaciones, aventuras y comedias familiares ");
                break;
            case 'Adultos 18 y 30 años':
                System.out.println("peliculas accion, drama, comedia y ciencia ficcion");
                break;
            case 'Adultos mayores de 31 años ':
                System.out.println("peliculas comedias y dramas de su interes");
                break;
            default:
                System.out.println("Error");
                return;
         }
    }

}
