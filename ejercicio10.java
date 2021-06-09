import java.util.*;
public class ejercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double b;
        System.out.println(" Ingresar base ");
        b = scanner.nextDouble();
        double h;
        System.out.println(" Ingresar altura ");
        h = scanner.nextDouble();
        double area;
        area = b*h;
        System.out.println(" área "+area);
        double per;
        per = 2*b+2*h;
        System.out.println(" perimetro "+per);
    }
}