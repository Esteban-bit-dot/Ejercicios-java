package ejecicios.java;

import java.util.Scanner;

public class Tienda_Virtual {
    public static String Operacion_compra(int mostrar_total){
        String operacion_compra = "";
        Scanner TomarDatos = new Scanner(System.in);
        int Operacion_compra = TomarDatos.nextInt();
        TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
        Operacion_compra = ProcesarDatos.nextInt();
        ProcesarDatos.close();
        System.out.print("ingrese el nombre del producto ($): ");
        System.out.print(mostrar_total);
        Operacion_compra = dato_Operacion_compra.nextInt();
        int Acumulador = Operacion_compra + 1;
        int Agregar_producto = 0;
        int carro_compras = 0;
        int i;
        for(i=1; 1<=carro_compras, i++){
          System.out.print(Agregar_producto);
        }
        return null;
   }
}
