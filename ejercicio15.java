import java.util.*;
public class ejercicio15{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double n;
        System.out.println(" numero ");
        n = scanner.nextDouble();
        
        if ( n < 0){
            System.out.println(" numero negativo ");
        }
        else{
            System.out.println(" numero positivo ");
        }
    }
}    