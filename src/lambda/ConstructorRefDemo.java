package lambda;

class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass.
        // Поскольку метод func() интерфейса MyFunc принимает аргумент,
        // new ссылается на параметризированный конструктор MyClass,
        // а не на конструктор по умолчанию.
        MyFunc2 myClassCons = MyClass::new;

        // Создать экземпляр MyClass посредством ссылки на конструктор
        MyClass mc = myClassCons.func("Тестирование");

        // Использовать только что созданный экземпляр MyClass
        System.out.println("Строка str в mc: " + mc.getStr());
    }
}
