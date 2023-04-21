package gen;

// Пример обобщенного интерфейса

// Подразумевается, что класс, реализующий этот
// интерфейс, содержит одно или несколько значений
interface Containment<T> {
    // Метод contains() проверяет, содержится ли
    // некоторый элемент в объекте класса,
    // реализующего интерфейс Containment

    boolean contains(T o);
 }

 // Реализовать интерфейс Containment с помощью массива,
 // предназначенного для хранения значений.
