import java.util.*;
public class ejercicio16{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double n1;
        System.out.println(" primer numero ");
        n1 = scanner.nextDouble();
        double n2;
        System.out.println(" segundo numero ");
        n2 = scanner.nextDouble();
        double n3;
        System.out.println(" tercer numero ");
        n3 = scanner.nextDouble();
        if ( n1>n3) {
                if ( n1>n2) {
                    System.out.println(" el numero mayor es  "+n1);
                }  
                if ( n3 > n2 ){
                    System.out.println(" el numero mayor es  "+n3);
                }  
        }
    }
}    