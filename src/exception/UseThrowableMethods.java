package exception;

import org.w3c.dom.ls.LSOutput;

public class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // Перехватить исключение
            System.out.println("Стандартное сообщение: ");
            System.out.println(exc);
            System.out.println("\nСтек вызовов: ");
            exc.printStackTrace();
        }
        System.out.println("После оператора catch");
    }
}
