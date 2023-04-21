package swing;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

class ListDemo implements ListSelectionListener {

    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    // Создать массив имен
    String names[] = {"Sherry", "Jon" , "Rachel" , "Sasha" , "Josselyn", "Randy",
            "Tom", "Mary", "Ken", "Andrew", "Matt", "Todd"};

    ListDemo() {
        // Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("JList Demo");

        // Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());

        // Задать исходные размеры фрейма
        jfrm.setSize(300,200);

        // Прекратить работу программы, если
        // пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать объект JList
        jlst = new JList<String>(names);

        // Задать режим выбора одиночных элементов
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Добавить список в панель с полосами прокрутки
        jscrlp = new JScrollPane(jlst);

        // Задать предпочтительные размеры прокручиваемой панели
        jscrlp.setPreferredSize(new Dimension(240,110));

        // Создать метку для отображения результатов выбора
        jlab = new JLabel("Please choose a name");

        // Добавить обработчик событий выбора элемента из списка
        jlst.addListSelectionListener(this);

        // Добавить список и метку в панель содержимого
        jfrm.add(jscrlp);
        jfrm.add(jlab);

        // Отобразить фрейм
        jfrm.setVisible(true);
    }

    // Обработать события выбора элементов из списка
    public void valueChanged(ListSelectionEvent le) {
        // Получить индекс элемента, состояние выбора
        // которого было изменено
        int idx = jlst.getSelectedIndex();

        // Отобразить результат выбора, если элемент был выбран
        if (idx != -1)
            jlab.setText("Current selection: " + names[idx]);
        else // Иначе еще раз предложить сделсть выбор
            jlab.setText("Please choose a name");
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }
}
