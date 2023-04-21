package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonDemo implements ActionListener {
    JLabel jlab;
    ButtonDemo() {

        // Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Пример кнопки");

        // Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());

        // Задать исходные размеры фрейма
        jfrm.setSize(220,90);

        // Прекратить работу программы, если
        // пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Оздать две кнопки
        JButton jbtnUp = new JButton("Отпущена");
        JButton jbtnDown = new JButton("Нажата");

        // ДОбавить слушателей действий
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);

        // Добавить кнопки на панель содержимого
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);

        // Создать метку
        jlab = new JLabel("Нажать кнопку.");

        // Добавить метку во фрейм
        jfrm.add(jlab);

        // Отобразить фрейм
        jfrm.setVisible(true);
    }

    // Обработка событий кнопки
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Отпущена"))
            jlab.setText("Кнопка отпущена");
        else
            jlab.setText("Кнопка нажата");
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
