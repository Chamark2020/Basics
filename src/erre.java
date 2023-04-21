package com.company;

public class erre {
    public static void main(String[] args) {
        double num, sroot, rerr;
        for (num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Kopeнь квадратный из " + num + " равен " + sroot);
            // вычислить ошибку округления
            rerr = num - (sroot * sroot);
            System.out.println("Ошибкa округления: " + rerr);
            System.out.println();
        }
    }
}
