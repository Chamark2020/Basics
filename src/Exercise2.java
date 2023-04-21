package com.company;

public class Exercise2 {
    public static void main(String[] args) {
      /*  boolean b;
        for (int i = 2; i <= 100 ; i++) {
            b = true;
            for (int j = 0; j <= i / j ; j++) {
                if ((i % j) == 0){
                    b = false;
                } else {
                    System.out.println(i);
                }
            }
        }*/
       /* for(int i = 0; i < 10; i++) {
            int sum = 0;
            sum += i;
            System.out.println("Sum is: " + sum);
        }*/
        int i, j;
        boolean isprime;
        for(i = 2; i < 100; i++) {
            isprime = true;
            for (j = 2; j <= i / j; j++)
                if ((i % j) == 0) isprime = false;
            if (isprime)
                System.out.println(i + " - простое число.");
        }
    }
}
