
public class Help {
    
    void showmenu() {
            System.out.println("Help");
            System.out.println("1. if");
            System.out.println("2. switch");
            System.out.println("3. for");
            System.out.println("4. while");
            System.out.println("5. do-while");
            System.out.println("6. break");
            System.out.println("7. continue");
    }
    
    void helpon(int what) {
            switch (what) {
                case '1':
                    System.out.print("Оператор if:");
                    System.out.print("\nif(условие) оператор;\nelse оператор;");
                    break;
                case '2':
                    System.out.print("Оператор switch:\nswitch(выражение) {\ncase константа:");
                    System.out.print(" последовательность операторов");
                    System.out.print(" break;");
                    System.out.print(" // ... ");
                    System.out.print("}\n");
                    break;
                case '3':
                    System.out.print("Oпepaтop for:");
                    System.out.print("for (инициaлизaция; условие; итерация)");
                    System.out.print(" оператор;\n");
                    break;
                case '4':
                    System.out.print("Oпepaтop while:\n");
                    System.out.print("while (ycлoвиe) оператор;\n");
                    break;
                case '5':
                    System.out.print("Oпepaтop do-while:\n");
                    System.out.print("do {");
                    System.out.print(" оператор;");
                    System.out.print("} while (условие);\n");
                    break;
                case '6':
                    System.out.print("Оператор break:\n");
                    System.out.print("break; или break метка;\n");
                    break;
                case '7':
                    System.out.print("Oпepaтop continue:\n");
                    System.out.print("continue; или continue метка;\n");
                    break;
              }
              System.out.println();
         }
       boolean isvalid(int ch){
        if(ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
        }
        
}
