package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TFDemo implements ActionListener {

    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    TFDemo() {

        // Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Использование текстового поля");

        // Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());

        //Задать исходные размеры фрейма
        jfrm.setSize(240,120);

        // Прекратить работу программы, если
        // пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать текстовое поле
        jtf = new JTextField(10);

        // Установить команду действия для текстового поля
        jtf.setActionCommand("myTF");

        // Создать кнопку
        jbtnRev = new JButton("Обратить");

        // Добавить слушателей событий лоя текстового поля и кнопки
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        // Создать метки
        jlabPrompt = new JLabel("Введите текст: ");
        jlabContents = new JLabel("");

        // Добавить компоненты на панель содержимого
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);
        jfrm.add(jlabPrompt);

        // Отобразить фрейм
        jfrm.setVisible(true);
    }

    // Обработать события действий
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Обратить")) {
            // Была нажата кнопка
            String orgStr = jtf.getText();
            String resStr = "";

            // Обратить строку в текстовом поле
            for (int i = orgStr.length()-1; i >=0; i--) {
                resStr += orgStr.charAt(i);
            }
            // Сохранить обращенную строку в текстовом поле
            jtf.setText(resStr);
        } else {
            // Клавиша <Enter> была нажата в тот момент, когда фокус
            // ввода находился в текстовом поле
            jlabContents.setText("Вы нажали ENTER. Текст: " + jtf.getText());
        }
    }
    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TFDemo();
            }
        });
    }
}


