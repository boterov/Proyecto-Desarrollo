import java.util.Scanner;
//Procesamiento y Persistencia/
public class PrincipalDesarrollo{
  public static void main(String[] args){
        
       Scanner scan = new Scanner(System.in); 
        System.out.println("Ingrese su codigo de estudiante");
        String codigo = scan.next();
        System.out.println("Bienvenido a PlasticEAFIT usuario: " + codigo);
        System.out.println("¿Que desea realizar?");
        System.out.println(" - Digite 1 para ingresar material");
        System.out.println(" - Digite 2 para redimir puntos");
        int proceso= scan.nextInt();
        
        while(proceso != 0){     
        switch(proceso){
            
         case 1: 
          System.out.println("Ingrese el material plastico");
          double peso = scan.nextDouble();
          Desarrollo.Conversion(peso);
          break;
        
         case 2: 
          Desarrollo.Acumulado();
          System.out.println("Ingrese 1, 2 ó 3 para redimir Bonos - Regalos");
          int canjeo = scan.nextInt();
          
          if(canjeo == 1){
            double p = 13;
            Desarrollo.Resta(p);
          }
          else if(canjeo == 2){
            double p = 10;
            Desarrollo.Resta(p);
          }
          else if(canjeo == 3){
            double p = 17;
            Desarrollo.Resta(p);
          }else{
            System.out.println("Comando incorrecto");
           }
          break;
      }
      
        System.out.println("¿Con qué desea continuar?");
        System.out.println(" - Digite 0 para salir");
        System.out.println(" - Digite 1 para ingresar material");
        System.out.println(" - Digite 2 para redimir puntos");
        proceso= scan.nextInt();
        
    }
       System.out.println("Saliendo...");
  }
 }