package exception;

public class ExcDemo2 {
    public static void main(String[] args) {

        try {
            ExcTest.genException();
        }
        // А здесь исклчюение перехватывается
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Выход за границы массива!");
        }
        System.out.println("После оператора catch");
    }
}
