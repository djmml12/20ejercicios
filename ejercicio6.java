import java.util.Random;

public class ejercicio6{
    public static void main(String[] args){
        Random aleatorio = new Random();
        int n = (aleatorio.nextInt(200));
        System.out.println(" numero aleatorio es " + n);
        double num2;
        num2 = n*.30;
        double num3;
        num3 = num2 + n;
        System.out.println(" numero aleatorio + 30% es " + num3);


        }
    }
