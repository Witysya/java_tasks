package com.company;
import java.util.Scanner;

class Testchat {
    public static void main(String args[]) {
        System.out.print("Привіт!");
        Scanner sc = new Scanner(System.in);
        String phrase1 = sc.next();


        System.out.println("Як твої справи?");

        String phrase2 = sc.next();

        if (phrase2.contains("добре") || phrase2.contains("супер") || phrase2.contains("прекрасно") || phrase2.contains("чудово")) {
            {
                System.out.println("Я радий, що в тебе все добре! Які плани на літо?");
                //break;
            }}

        while (phrase2.contains("погано") || phrase2.contains("зле") || phrase2.contains("недобре") || phrase2.contains("жахливо")) {
            {
                System.out.println("Не переживай, не існує проблем які не можна вирішити.");
                break;
            }}
        String phrase3 = sc.next();

        while (phrase3.contains("немає") || phrase2.contains("нікуди") || phrase2.contains("вдома")) {

            {   System.out.println("Тобі необхідно відпочити");
                break;
            }}
        while (phrase3.contains("море") || phrase2.contains("закордон") || phrase2.contains("океан")) {
            {  System.out.println("Бажаю тобі гарного відпочинку!");
                break;
            }
        }}}





