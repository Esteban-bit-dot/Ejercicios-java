package ejercicios.java;

public class Cuenta_regresiva {
    
    public static void main(String[]args){
     Numero();
 }
    public static String Numero(){
     String numero = "";
     Scanner TomarDatos new Scanner(System.in);
     Scanner dato_Numero = new Scanner(System.in);
     System.out.print("ingrese un numero: ");
     Numero = dato_Numero.nextInt();
     TomarDatos.close();
     Scanner ProcesarDatos = new Scanner(System.in);
     int Numero = ProcesarDatos.nextInt();
     ProcesarDatos.close();
     while(numero){
        boolean num = true;
        System.out.println(num + : + 0 + 0);
        System.out.println("desea ingresar otro numero: ");
        System.out.printin("¡Tiempo cumplido!");
        Numero = dato_Numero.nextInt();
         break;
     } 
     return null;
  }
}
