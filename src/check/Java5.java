package check;

public class Java5 {
    public static void main(String[] args) {
        //1
        double d[] = new double[12];
        d[0] = 1.0;
        d[1] = 1.1;
        d[2] = 1.2;
        d[3] = 1.3;
        d[4] = 1.4;
        d[5] = 1.5;
        d[6] = 1.6;
        d[7] = 1.7;
        d[8] = 1.8;
        d[9] = 1.9;
        d[10] = 1.10;
        d[11] = 1.11;

        double d1[] = {1.0,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9,1.10,1.11, 1.1};
        for (int i = 0; i < 12; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 12; i++) {
            System.out.print(d1[i] + " ");
        }
        System.out.println();

        //2
        int q[] = new int[5];
        for (int i = 0; i < 5; i++) {
            q[i] = i + 1;
            System.out.print(q[i] + " ");
        }
        System.out.println();

        //3
        double res = 0;
        double avr = 0;

        for (int i = 0; i < d1.length; i++) {
            res += d1[i];
            System.out.print(res + " ");
            avr = res / d1.length;
        }
        System.out.println("\n" + avr);
        System.out.println();

        //4 - string buble
        String str[] = {"Это", "символьный", "строк", "массив", "!"};
        int size = str.length;
        //реализовать механизм пузырьковой сортировки
        for(int a = 1; a < size; a++){
            for(int b = size - 1; b >= a; b--){
                if(str[b-1].compareTo(str[b]) > 0){//если порядок не соблюдается,
                    //поменять элменты местами
                    String t = str[b-1];
                    str[b-1] = str[b];
                    str[b] = t;
                }
            }
        }
        System.out.print("Отсортировнный массив: ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + str[i]);
        }
        System.out.println();

        //6
        String str1 = "Мне нравится Java";
        System.out.println(str1.length());
        System.out.println(str1.charAt(2));

        //9
        int x = 1;
        int y = x < 0? 10 : 20;
        System.out.println(y);

    }
}
