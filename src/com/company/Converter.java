package com.company;

public class Converter {

    public static void main(String[] args) {

        double usd;
        usd = convertEurToUsd(6, 2.4);
        usd = convertEurToUsd(4, 1.3);
        System.out.println(usd);
    }


    public static double convertEurToUsd(int eur, double course){
        return (eur * course);
    }
}

