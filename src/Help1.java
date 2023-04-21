import java.io.IOException;

public class Help1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Help");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.print("Choose:");
        char enter = 0;
        for (int i = 0; (enter != '1') && (enter != '2') ; i++) {
            enter = (char) System.in.read();
            switch (enter) {
                case '1':
                 System.out.println("if(условие) оператор;\nelse оператор;");
                    break;
                case '2':
                    System.out.println("Оператор switch:\nswitch(выражение) {\ncase константа:");
                    System.out.println(" последовательность операторов");
                    System.out.println(" break;");
                    System.out.println(" // ... ");
                    System.out.println("}");
                    break;
                default:
                    System.out.println("Please, choose number from menu.");
                    break;
            }
        }
    }
}