package Enum;

//Автоматизированное управление светофором

class TrafficLightSimulator implements Runnable {
    private Thread thrd; // поток для имитации светофора
    private TrafficLightColor tlc; // текущий цвет светофора
    boolean stop = false; // для остановки имитации установить в true
    boolean changed = false; // true, если светофор переключился

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    // Запуск имитации автоматизированного светофора
    public void run() {
        while (!stop) {
            try {
                tlc.getDelay();
                /*switch (tlc) {
                    case GREEN -> tlc.getDelay(); // зеленый на 10 секунд
                    case YELLOW -> tlc.getDelay(); // желтый на 2 секунды
                    case RED -> tlc.getDelay(); // красный на 12 секунд*/
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }
    }

    // Переключение цвета светофора
    synchronized void changeColor() {
        switch (tlc) {
            case RED -> tlc = TrafficLightColor.GREEN;
            case YELLOW -> tlc = TrafficLightColor.RED;
            case GREEN -> tlc = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify(); // уведомить о переключении цвета светофора
    }

    // Одидание переключения цвета светофора
    synchronized void waitForChange() {
        try {
            while (!changed) wait(); // ожидать переключения цвета светофора
            changed = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    // Возврат текущего цвета
    TrafficLightColor getColor() {
        return tlc;
    }

    // Прекращение имитации светофора
    void cancel() {
        stop = true;
    }
}
