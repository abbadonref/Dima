

import java.util.Scanner;// импортируем класс Scanner

public class Main{// объявляется класс Test

    public static void main(String[] args) {// так включаются программы,
        // просто запомнить
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
         short a = sc.nextShort();
        System.out.println("Введите число:");
        short b = sc.nextShort();
        sc.close();
         if  ((a%2)==0)
         {
             System.out.println("вот сумма:" + a+b);
         }
         else if ((b%3)==0){
             System.out.println("вот произведение" + a*b);
         }
          else {
            System.out.println("вот нуль"+ 0);
        }

    }
}
