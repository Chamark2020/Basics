import java.io.IOException;

public class HelpClassDemo {
    public static void main(String[] args) throws IOException {
        char enter, ignore;
        Help help = new Help();
        for(;;) {
            do {
                help.showmenu();
                System.out.print("Choose from 1 to 7 (q - exit):");

                enter = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!help.isvalid(enter));

            if (enter == 'q') break;
            
            System.out.println("\n");
            
            help.helpon(enter);
        } 
    }
}