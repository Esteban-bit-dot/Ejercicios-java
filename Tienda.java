    import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner TomarDatos= new Scanner(System.in);

        // Precios base de los productos
        int precioA = 100; // precio base de alimentos
        int precioV = 200; // precio base de vestimenta
        int precioE = 300; // precio base de electrónicos

        // Solicitar tipo de producto al cliente
        System.out.print("Ingrese el tipo de producto (A, V, E): ");
         int tipoProducto = TomarDatos.nextInt();
          
        // Solicitar cantidad de unidades
        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = TomarDatos.nextInt();
        TomarDatos.close();
        Scanner ProcesarDatos= new Scanner(System.in);
        int tipoProducto = ProcesarDatos.nextInt();
        int cantidad = ProcesarDatos.nextInt();
        TomarDatos.close();
         int precioBase = 0;
        String descuento = "50%";
        int costoSinDescuento = 0;
        int costoConDescuento = 0 ;

        switch (tipoProducto) {
            case 'A':
                System.out.println(precioBase = precioA);
                descuento = 0.15;
                break;
            case 'V':
                System.out.println(precioBase = precioV);
                descuento = 0.10;
                break;
            case 'E':
                System.out.println(precioBase = precioE);
                descuento = 0.5;
                break;
            default:
                System.out.println("Tipo de producto no válido.");
                return;
        }
      
        System.out.println(costoSinDescuento = precioBase * cantidad);
        System.out.println(costoConDescuento = costoSinDescuento - (costoSinDescuento * descuento));
  
    }
