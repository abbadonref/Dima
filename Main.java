
import java.util.Scanner;



public class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        double a = sc.nextShort();
        System.out.println("enter another число");
        double b = sc.nextShort();
        System.out.println("число в степени a: " + Math.pow(b,a));

        System.out.println("ваш корень из числа "+a+"    " + Math.sqrt(a));

    }
}



