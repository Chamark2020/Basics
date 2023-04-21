package hw;

class ToolsDemo {
    public static void main(String[] args) {
        Tools t;

        for (Tools p: Tools.values()) {
            System.out.println(p + " имееет порядковый номер " + p.ordinal());
        }
    }
}
