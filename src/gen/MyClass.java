package gen;

// Реализовать интерфейс Containment с помощью массива,
// предназначенного для хранения значений.
class MyClass<T> implements Containment<T> {
    T[] arrayRef;

    MyClass(T[] o) {
        arrayRef = o;
    }

    // Реализовать метод contains()
    public boolean contains(T o) {
        for (T x: arrayRef) {
            if (x.equals(o)) return true;
        }
        return false;
    }
}

class GenIFDemo {
    public static void main(String[] args) {
        Integer x[] = {1, 2, 3};

        MyClass<Integer> ob = new MyClass<Integer>(x);

        if (ob.contains(2)) System.out.println("2 содержится в ob");
        else System.out.println("2 НЕ содержится в ob");

        if (ob.contains(5)) System.out.println("5 содержится в ob");
        else System.out.println("5 НЕ содержится в ob");

        // Следующие строки кода не допустимы, так как объект ob
        // является вариантом реализации интерфейса Containment для
        // типа Integer, а значение 9.25 относится к типу Double.

        /*if (ob.contains(9.25)) // Недопустимо
            System.out.println("9.25 не содержится в ob");*/
    }
}
