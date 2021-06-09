import java.util.*;
public class ejercicio12{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double c;
        System.out.println(" ingresar temperatura en Cº ");
        c = scanner.nextDouble();
        double f;
        f = c*1.8+32;
        System.out.println(" la temperatura en Fº es "+f);
        }
}