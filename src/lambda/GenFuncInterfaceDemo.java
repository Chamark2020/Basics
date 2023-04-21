package lambda;

// Использование обобщенного функционального интерфейса
class GenFuncInterfaceDemo {
    public static void main(String[] args) {
        // Данное лямбда-выражение определяет, является ли
        // одно целое число делителем другого
        SomeTest<Integer> isFactor = (n,d) -> (n % d) == 0;

        if (isFactor.test(10,2))
            System.out.println("2 является делителем 10");
        System.out.println();

        // Данное лямда-выражение определят, является ли
        // одно число типа Double делителем другого
        SomeTest<Double> isFactorD = (n,d) -> (n % d) == 0;

        if (isFactorD.test(212.0,4.0))
            System.out.println("4.0 является делителем 212.0");
        System.out.println();

        // Данное лямбда-выражение определяет, является лм
        // одна строка частью другой
        SomeTest<String> isIn = String::contains;

        String str = "Обобщенный функциональный интерфейс";

        System.out.println("Тестируемая строка: " + str);

        if (isIn.test(str,"face"))
            System.out.println("'face' найдено");
        else System.out.println("'face' не найдено");
    }
}
