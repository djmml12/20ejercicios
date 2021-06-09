import java.util.*;
public class ejercicio13{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double PI = 3.1416;
        double r;
        System.out.println(" ingresar radio ");
        r = scanner.nextDouble();
        if (r <= 0){
            System.out.println(" Radio menor o igual que 0 no se puede calcular ");
        }
        else{
            System.out.println(" ingresar altura ");
            double h;
            h = scanner.nextDouble();
            if (h<=0){
                System.out.println(" no se puede calcular altura menor o igual a 0");
            }
            if (h>0){
                double v;
                double rr;
                rr= PI*PI;
                v= PI * rr * h;
                System.out.println(" volumen es "+v);

                
            }
        }

     }
}     
