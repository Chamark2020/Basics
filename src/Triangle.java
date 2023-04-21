// Подкласс для представления треугольников
//произвожный от класса TwoDShape
class Triangle extends TwoDShape{
    String style;

    double area(){
        return width * height / 2;
    }
    void showStyle(){
        System.out.println("Треугольник " + style);
    }
}
