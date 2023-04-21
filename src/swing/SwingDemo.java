package swing;

import javax.swing.*;

class SwingDemo {
    SwingDemo() {
        // Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Простое приложение Swing");

        // Установить начальные размеры
        jfrm.setSize(400,200);

        // Завершить работу программы, когда пользователь
        // закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать текстовыую метку
        JLabel jlab = new JLabel("Программирование интерфейса с помощью Swing");

        // Добавить метку на панель содеримого
        jfrm.add(jlab);

        // Отобразить фрейм
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
