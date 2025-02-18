package Ejercicios.java;

import java.util.Scanner;
import java.util.Random;

public class juego_adivinanza {
 
    public static void main(String[] args) {
        
    } 
    public static String Adivinar_numero (){
        Scanner TomarDatos = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intento = 0;
        int numeroUsuario = 0;
        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¿Puedes adivinar cuál es?");
        TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
        numeroUsuario=dato_numeroUsuario.nexInt();
        ProcesarDatos.close();
        while (numeroUsuario != numeroSecreto) {
            System.out.print("Introduce tu adivinanza: ");
            numeroUsuario = dato_numeroUsuario.nextInt();
            intento++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor. ¡Inténtalo de nuevo!");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número es menor. ¡Inténtalo de nuevo!");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intento + " intentos.");
            }
        }
        return null;
    }
}
