package factura;

import java.util.Scanner;

public class Factura {

    public static void nombre_Cliente(String[] args) {
        String nombre_Cliente="";
        Scanner TomarDatos = new Scanner(System.in);
        System.out.print("ingrese un Nombre aqui: ");
        nombre_Cliente=TomarDatos.nextLine();
        TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
        nombre_Cliente=ProcesarDatos.nextLine();
        ProcesarDatos.close();
        System.out.println(nombre_Cliente);
        
    }
    public static String Producto(String objProducto){
        String Producto="";
        Scanner TomarDatos = new Scanner(System.in);
        System.out.print("ingrese el nombre de un producto: ");
        objProducto=TomarDatos.nextLine();
        TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
        objProducto=ProcesarDatos.nextLine();
        ProcesarDatos.close();
        System.out.println(Producto);
        return null;
    }
    
    public static int Precio() {
      String Precio="";
      String Producto="";
      Scanner TomarDatos = new Scanner(System.in);
      System.out.print("ingrese los numeros: ");
      Precio = TomarDatos.nextLine();
      TomarDatos.close();
      Scanner ProcesarDatos = new Scanner(System.in);
      Producto=ProcesarDatos.nextLine();
      ProcesarDatos.close();
      System.out.println(Precio);
      return 0;
     }

   public static int Calcular_datos(int iva){
        System.out.println("ingrese la cantidad de productos: ");
        System.out.println("ingrese el tipo de usuario (A,B o C): ")
        int precio = 0;
        return cantidad_producto * precio;
        return precio + (precio * iva / 100);
    }
}
