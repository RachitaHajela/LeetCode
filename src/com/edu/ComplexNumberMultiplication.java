package com.edu;

/**
 * Created by Rachita on 10/4/2017.
 */
public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        int ansA=0, ansB=0;


        String[] num1 = a.split("\\+");
        String[] num2 = b.split("\\+");

        int a1 = Integer.valueOf(num1[0]);
        num1[1] = num1[1].substring(0,num1[1].length()-1);
        System.out.println(num1[1]);
        int b1 = Integer.valueOf(num1[1]);

        int c = Integer.valueOf(num2[0]);
        num2[1] = num2[1].substring(0,num2[1].length()-1);
        int d = Integer.valueOf(num2[1]);


        ansA = (a1*c) - (b1*d);
        ansB = (a1*d) + (b1*c);

        return ansA+"+"+ansB+"i";
    }
}
