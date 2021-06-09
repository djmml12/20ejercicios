import java.util.*;
public class ejercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double cent;
        System.out.println(" Ingresar centímetros ");
        cent = scanner.nextDouble();
        double yarda;
        yarda = cent / 91;
        System.out.println( "a yarda es "+ yarda );
        double mt;
        mt = cent / 100;
        System.out.println( "a metro es " + mt );
        double pie;
        pie = cent/32;
        System.out.println( "a pie es " + pie );
        double pulg;
        pulg = cent / 2.54;
        System.out.println( "a pulgada es " + pulg );

    }
}