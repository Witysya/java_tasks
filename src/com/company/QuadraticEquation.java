package com.company;
import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args)
    {
        int a, b, c;
        double root1, root2, d;
        Scanner s = new Scanner(System.in);

        // TODO Use English
        System.out.println("Дано квадратне рівняння :ax^2 + bx + c");
        System.out.print("Введіть a:");
        // TODO handle the case when user enters not int value in fields
        a = s.nextInt();
        System.out.print("Введіть b:");
        b = s.nextInt();
        System.out.print("Введіть c:");
        c = s.nextInt();
        System.out.println("Дано квадратне рівняння :"+a+"x^2 + "+b+"x + "+c);
        d = b * b - 4 * a * c;
        if(d > 0) {
            System.out.println("Корені не є рівними");
            root1 = ( - b + Math.sqrt(d))/(2*a);
            root2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Перший корінь:"+root1);
            System.out.println("Другий корінь:"+root2);
        } else if(d == 0) {
            System.out.println("Корені є рівними");
            root1 = (-b+Math.sqrt(d))/(2*a);
            System.out.println("Корінь:"+root1);
        } else {
            System.out.println("Недійсне");
        }
    }
}
