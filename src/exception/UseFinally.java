package exception;
// Использование блока finally
public class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[] = new int[2];

        System.out.println("Получено: " + what);
        try {
            switch (what) {
                case 0:
                    t = 10 / what; // сгенерировать ошибку деления на нуль
                    break;
                case 1:
                    nums[4] = 4; // сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    return; // возвратиться из блока try
            }
        }
        catch (ArithmeticException exc) {
            // Перехватить исключение
            System.out.println("Попытка деления на нуль");
            return; // вернуться из блока catch
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // перехватить исключение
            System.out.println("Соответствующий элемент не найден");
        }
        finally {
            System.out.println("Выход из блока try");
        }
    }
}
