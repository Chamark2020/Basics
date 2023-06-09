package lambda;
// реализация функциональных интерфейсов лямбда-выражениями
class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal; // Объявление ссылки на интерфейс

        // Здесь лябдма-выражение - это просто константа.
        // При его назначении переменной myVal создается
        // экземпляр класса, в котором лямбда-выражение
        // реализует метод getValue() интерфейса MyValue
        myVal = () -> 98.6;

        // Вызвать метод getValue(), предоставляемый ранее
        // назначенным лябмда-выражением.
        System.out.println("Постоянное значение: " + myVal.getValue());

        // Создать параметризованное лябмда-выражение и назначить его
        // ссылке на экземпляр MyParamValue. Это лямбда-выражение
        // возвращает обратнуж величину своего аргумента.
        MyParamValue myPval = (n) -> 1.0 / n;

        // Вызвать метод getValue(v) посредством ссылки myPval.
        System.out.println("Обратная величина 4 равна " + myPval.getValue(4.0));
        System.out.println("Обратная величина 8 равна " + myPval.getValue(8.0));

        // Лямбда-выражение должно быть совместимым с методом,
        // который определяется фкнуциональным интерфейсом. Поэтому
        // приведенные ниже два фрагмента кода работать не будут.
        /*myVal = () -> "three"; // Ошибка! тип String несовместим с типом double
        myPval = () -> Math.random(); // Ошибка! Требуется параметр*/
    }
}
