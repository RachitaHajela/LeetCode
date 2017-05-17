package com.edu;

/**
 * Created by RHAJELA on 5/17/2017. Program to calculate pow(x,n);
 */
public class Pow {

    public double myPow(double x, int n) {

        double temp;
        if (n == 0) return 1;
        temp = myPow(x, n / 2);
        if (n % 2 == 0) return temp * temp;
        else {
            if (n > 0) return x * temp * temp;
            else return (temp * temp) / x;
        }


       /*
       Using DIvide and COnquer : gives wrong answer with negative n
       if(n == 0) return 1.0;
        else if (n %2 == 0) return myPow(x,n/2) * myPow(x,n/2);
        else return x * myPow(x,n/2) * myPow(x,n/2);*/
    }
}
