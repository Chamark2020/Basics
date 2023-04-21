package gen;

class TwoGen<T, V> {
    T ob1;
    V ob2;

    // Передать конструктору класса ссылки на объекты типоа T и V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // Отобразить типы T и V
    void showTypes() {
        System.out.println("Тип Т - это " + ob1.getClass().getName());
        System.out.println("Тип V - это " + ob2.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    V getob2() {
        return ob2;
    }
}
