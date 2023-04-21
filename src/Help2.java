package com.company;

import java.io.IOException;

public class Help2 {
    public static void main(String[] args) throws IOException {
        char enter, ignore;
        System.out.println("Help");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("3. for");
        System.out.println("4. while");
        System.out.println("5. do-while\n");
        do {
            System.out.print("Choose from 1 to 5:");

            enter = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
        } while (enter < '1' | enter > '5');
            switch (enter) {
                case '1':
                 System.out.println("if(условие) оператор;\nelse оператор;");
                    break;
                case '2':
                    System.out.println("Оператор switch:\nswitch(выражение) {\ncase константа:");
                    System.out.println(" последовательность операторов");
                    System.out.println(" break;");
                    System.out.println(" // ... ");
                    System.out.println("}");
                    break;
                case '3':
                    System.out.println("Oпepaтop for:\n");
                    System.out.print("for (инициaлизaция; условие; итерация)");
                    System.out.println(" оператор;");
                    break;
                case '4':
                    System.out.println("Oпepaтop while:\n");
                    System.out.println("while (ycлoвиe) оператор;");
                    break;
                case '5':
                    System.out.println("Oпepaтop do-while:\n");
                    System.out.println("do {");
                    System.out.println(" оператор;");
                    System.out.println("} while (условие);");
                    break;
            }
    }
}
