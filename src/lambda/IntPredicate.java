package lambda;

// Демонстрация использования ссылок на статические методы.

// Функциональный интерфейс для числовых предикатов, которые
// воздействуют на целочисленные значения

interface IntPredicate {
    boolean test(int n);
}
