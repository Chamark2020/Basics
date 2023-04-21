package exception;

public class ReThrowDemo {
    public static void main(String[] args) {
        try {
            ReThrow.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // повторно перехватить исключение
            System.out.println("Фатальная ошибка - выполнение программы прервано");
        }
    }
}
