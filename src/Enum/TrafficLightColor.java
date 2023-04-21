package Enum;

enum TrafficLightColor {
    RED(6000), GREEN(5000), YELLOW(2000);

    private int delay;

    TrafficLightColor(int ms) {
        delay = ms;
    }

    public void getDelay() throws InterruptedException {
        Thread.sleep(delay);
    }
}
