package ejecicios.java;

import java.util.Scanner;

public class Registrar_Ventas {
    public static String tienda (){
        String Productos  = "";
        Scanner TomarDatos = new Scanner(System.in);
        int Producto = TomarDatos.nextInt();
        TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
        Productos = ProcesarDatos.nextInt();
        ProcesarDatos.close();
        System.out.print("ingrese un producto con su precio ($): ");
        Productos = dato_Productos.nextInt();
        int Acumulador = Productos + 1;
         int Mostrar_productos = 0;
        int i;
        for(i=1; 1<=Productos, i++){
           System.out.print(Mostrar_productos);
        }
        return null;
}

}
