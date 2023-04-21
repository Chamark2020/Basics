/* Упражнение 16.1.
*
*  Утилита сравнения файлов  на основе Swing.
*
* */

package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class SwingFC implements ActionListener {

    JTextField jtfFirst; // Хранит имя первого файла
    JTextField jtfSecond;// Хранит имя второго файла

    JButton jbtnComp; // Кнопка запуска операии сравнения файлов

    JLabel jlabFirst, jlabSecond; // Метки, отображающие подсказки для пользователя

    JLabel jlabResult;  // Метка для отображения результата сравнения
                        // и сообщений об ошибках

    SwingFC() {

        // Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Compare files");

        // Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());

        // Задать исходные размеры фрейма
        jfrm.setSize(300,150);

        // Прекратить работу программы, если
        // пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать поля для ввода имен
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        // Задать команды действия для текстовых полей
        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");

        // Создать кнопку Compare
        JButton jbtnComp = new JButton("Compare");

        // Добавить слушатель событий для кнопки Compare
        jbtnComp.addActionListener(this);

        // Создать метки
        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");

        // Добавить компоненты на панель содержимого
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);

        // Отобразить фрейм
        jfrm.setVisible(true);
    }

    // Сравнить файлы после нажатия кнопки Compare
    public void actionPerformed(ActionEvent ai) {
        int i = 0, j = 0;

        // Сначала убедиться в том, что введены имена обоих файлов
        if (jtfFirst.getText().equals("")) {
            jlabResult.setText("First file name missing");
            return;
        }
        if (jtfSecond.getText().equals("")) {
            jlabResult.setText("Second file name missing");
            return;
        }

        // Сравнить файлы, используя оператор try с ресурсами
        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
             FileInputStream f2 = new FileInputStream(jtfSecond.getText())){

            // Сравнить содержимое обоих файлов
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);

            if (i != j)
                jlabResult.setText("Files are not the same");
            else
                jlabResult.setText("Files compare equal");
        } catch (IOException exc) {
            jlabResult.setText("File Error");
        }
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingFC();
            }
        });
    }
}
