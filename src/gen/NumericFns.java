package gen;
// Класс NumericFns как пример неудачной попытки создать
// обобщенный класс для выполнения различных математических
// операций, включая получение обратной величины или
// извлечение дробной части числовых значений любого типа.

/*class NumericFns<T> {
    T num;

    // Передать конструктору ссылку на числовой объект
    NumericFns(T n) {
        num = n;
    }

    // Вернуть обратную величину
    double reciprocal() {
        return 1 / num.doubleValue(); // Ошибка!
    }

    // Вернуть дробную часть
    double fraction() {
        return num.doubleValue() - num.intValue(): // Ошибка!
    }*/

// В этой версии класса NumericsFns аргументом типа,
// заменяющим параметр типа Т, должен стать класс Number
// или производный от него подкласс, как показано ниже.

class NumericFns<T extends Number> {
    T num;

    // Передать конструктору ссылку на числовой объект
    NumericFns(T n) {
        num = n;
    }

    // Вернуть обратную величину
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Вернуть дробную часть
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // Использование шаблона аргумента
    // Проверить равенство абсолютных значений двух объектов
    boolean absEqual(NumericFns<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) return true;
        return false;
    }
}
