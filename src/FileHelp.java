// Демонстрация работы справочной системы на основе файла
public class FileHelp {
    public static void main(String[] args) {
        Help4 hlpopj = new Help4("helpfile.txt");
        String topic;

        System.out.println("Воспользуйтесь справочной системой.\n" +
                "Для выхода из системы введите 'stop'.");

        do {
            topic = hlpopj.getSelection();
            if (!hlpopj.helpon(topic)) System.out.println("Тема не найдена.\n");
        } while (topic.compareTo("stop") != 0);
    }
}
