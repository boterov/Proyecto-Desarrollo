public class Desarrollo{
    
public static double puntos;
public static double constante = 15;
public static String imp; 
public static double rest;

    public static void Conversion(double peso){
        double conver = peso + constante;
        puntos= conver;
        if(peso<=100){
            System.out.println("Los puntos obtenidos en esta oportunidad son: "+ puntos);
            System.out.println("Gracias por tu contribución al desarrollo sostenible");
        }
        else{System.out.println("Exceso de peso");
    }
}
    
    public static void Acumulado(){
        System.out.println("Su puntaje acumulado es de " + puntos + " ECO-Puntos");
        System.out.println("Bonos Redimibles: ");
        System.out.println("0. Cancelar proceso");
        System.out.println("1. Parqueadero gratis * 1 semana    $13 ECO-puntos");
        System.out.println("2. Bono 2 almuerzos gratis          $10 ECO-puntos");
        System.out.println("3. Regalo cuaderno 5 materias       $17 ECO-puntos");
}   

    public static void Resta(double p){
        if(p <= puntos){
       rest = puntos - p;
       System.out.println("Bono-Regalo redimido con exito");
       puntos = rest;
    }  
        else{
        System.out.println("Puntaje insuficiente para redimir");    
    } 
}
}