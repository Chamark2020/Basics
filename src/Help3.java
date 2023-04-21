package Java;

import java.io.IOException;

public class Help3 {
    public static void main(String[] args) throws IOException {
        char enter, ignore;
            System.out.println("\nHelp");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while");
            System.out.println("6. break");
            System.out.println("7. continue\n");
        for (; ; ) {
            do {
                System.out.print("Choose from 1 to 7 (q - exit):");

                enter = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (enter < '1' | enter > '7' & enter != 'q');

            if (enter == 'q') break;

            switch (enter) {
                case '1':
                    System.out.println("\nОператор if:");
                    System.out.println("\nif(условие) оператор;\nelse оператор;");
                    break;
                case '2':
                    System.out.println("\nОператор switch:\nswitch(выражение) {\ncase константа:");
                    System.out.println(" последовательность операторов");
                    System.out.println(" break;");
                    System.out.println(" // ... ");
                    System.out.println("}\n");
                    break;
                case '3':
                    System.out.println("\nOпepaтop for:");
                    System.out.print("for (инициaлизaция; условие; итерация)");
                    System.out.println(" оператор;\n");
                    break;
                case '4':
                    System.out.println("\nOпepaтop while:\n");
                    System.out.println("while (ycлoвиe) оператор;\n");
                    break;
                case '5':
                    System.out.println("\nOпepaтop do-while:\n");
                    System.out.println("do {");
                    System.out.println(" оператор;");
                    System.out.println("} while (условие);\n");
                    break;
                case '6':
                    System.out.println("\nОператор break:\n");
                    System.out.println("break; или break метка;\n");
                    break;
                case '7':
                    System.out.println("\nOпepaтop continue:\n");
                    System.out.println("continue; или continue метка;\n");
                    break;
            }
        }
    }
}