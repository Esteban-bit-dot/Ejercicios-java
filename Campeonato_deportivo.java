package Ejercicios.java;

import java.util.Scanner;

public class Campeonato_deportivo {
    
    public static void Resutado_partido (String[] args){
        Resultado();
    
  }
     public static void Resultado(String[] args){
          Scanner TomarDatos = new Scanner(System.in);
          System.out.print("ingrese el nombre de equipo1: ");
          System.out.print("ingrese el nombre de equipo2: ");
          int Resultado = TomarDatos.nextInt();
          Scanner ProcesarDatos = new Scanner(System.in);
          int Resultado = ProcesarDatos.nextInt();
          int puntos = 3G * E;
          switch (Equipo){
            case 'resultado 1':
                System.out.println("El equipo 1 gano ");
               System.out.print(equipo1 3goles vs equipo2 1gol); 
                break;
            case 'resultado 2':
                System.out.println("el equipo 2 perdio");
                 System.out.print(equipo1 4goles vs equipo2 0gol); 
                break;
            case 'resulado  3':
                System.out.println("los equipos empataron");
                System.out.print(equipo1 3goles vs equipo2 3gol); 
                break;
            default:
                System.out.println("Error");
                return;
        }
     }
}
