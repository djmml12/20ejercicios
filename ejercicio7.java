import java.util.Random;

public class ejercicio7{
    public static void main(String[] args){
        Random aleatorio = new Random();
        int n = (int) aleatorio.nextInt(50);
        System.out.println(" numero aleatorio es " + n);
        double num2;
        num2 = n*.15;
        double num3;
        num3 = n - num2;
        System.out.println(" numero aleatorio - 15% es " + num3);


        }
    }
