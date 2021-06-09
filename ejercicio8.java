import java.util.*;
public class ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double num1;
        System.out.println(" Ingresar primer número ");
        num1 = scanner.nextDouble();
        double num2;
        System.out.println(" Ingresar segundo número ");
        num2 = scanner.nextDouble();
        double num3;
        System.out.println(" Ingresar tercer número ");
        num3 = scanner.nextDouble();
        double promedio;
        promedio = num1 + num2 + num3;
        double promediof;
        promediof = promedio / 3;
        System.out.println(" promedio "+promediof);
    }
    
}
