import java.util.*;
public class ejercicio14{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double n1;
        System.out.println(" ingresar primer numero ");
        n1 = scanner.nextDouble();

        double n2;
        System.out.println(" ingresar segundo numero ");
        n2 = scanner.nextDouble();

        double r;
        r = n1 % n2; 
        System.out.println(" residuo " + r);

        if ( r > 0 ){
            System.out.println(" numero es divisible ");

        }
        else{
            System.out.println(" numero es divisible  ");
        }
        }
    } 
   