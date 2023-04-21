public class TwoDShape {
    double width;
    double height;
    double p = 3.14;

    void showDim(){
        System.out.println("Ширина и высота - " +
                width + " и " + height);
    }
    double area(){
        return width * height;
    }
}
