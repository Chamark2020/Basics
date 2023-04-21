package lambda;

class MyClass {
    private String str;

    // Этот конструктор принимает аргумент
    MyClass(String s) {str = s;}

    // Это конструктор по умолчанию
    MyClass() {str = "3";}

    String getStr() {return str;}
}
