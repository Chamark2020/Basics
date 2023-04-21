package hw;

import lambda.*;
import java.util.function.Predicate;

class lambda {

    public static void main(String[] args) {

       // int factorial = 1;

        Predicate<Integer> mn = n -> (n >= 10 && n <= 20);
        if (mn.test(12)) System.out.println("Число 12 в диапазоне");
        if (mn.test(9)) System.out.println("Число 9 в диапазоне");
        else System.out.println("Число 9 вне диапазона");

        System.out.println();

        MyTest mt = n -> (n >= 10 && n <= 20);
        if (mt.testing(15)) System.out.println("Число 15 в диапазоне");
        if (mt.testing(4)) System.out.println("Число 4 в диапазоне");
        else System.out.println("Число 4 вне диапазона");

        System.out.println();

        NumericFunc nf = n -> {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        };

        System.out.println("Факториал числа 5 равен " + nf.func(5));

        System.out.println();

        MyFunc<Integer> mf = n -> {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        };
        System.out.println("Факториал числа 4 равен " + mf.func(4));

    }
}
