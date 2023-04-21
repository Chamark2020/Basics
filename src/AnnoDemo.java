// Пример использования аннотации @Deprecated

import thread.MyThread2;

// Пометить классс как не рекомендованный к применению
@Deprecated
class MyClass{
    private String msg;

    MyClass(String m) {
        msg = m;
    }

    // Пометить метод как не рекомендованный к применению
    @Deprecated
    String getMsg() {
        return msg;
    }
}
class AnnoDemo {
    public static void main(String[] args) {
        MyClass myObj = new MyClass("тест");

        System.out.println(myObj.getMsg());
    }
}
