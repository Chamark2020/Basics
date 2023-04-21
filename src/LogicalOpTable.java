package com.company;
//отобрпжение таблицы истинности для логических оперций
public class LogicalOpTable {
    public static void main(String[] args) {
        /*boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true; q = true;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) + "\t");
        System.out.print(((p & q) ? 1 : 0) + "\t" + ((p | q) ? 1 : 0) + "\t");
        System.out.println(((p ^ q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));
        p = true; q = false;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) +"\t");
        System.out.print(((p&q) ? 1 : 0) + "\t" + ((p|q) ? 1 : 0) + "\t");
        System.out.println(((p^q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));

        p = false; q = true;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) +"\t");
        System.out.print(((p&q) ? 1 : 0) + "\t" + ((p|q) ? 1 : 0) + "\t");
        System.out.println(((p^q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));

        p = false; q = false;
        System.out.print((p ? 1 : 0) + "\t" + (q ? 1 : 0) +"\t");
        System.out.print(((p&q) ? 1 : 0) + "\t" + ((p|q) ? 1 : 0) + "\t");
        System.out.println(((p^q) ? 1 : 0) + "\t" + ((!p) ? 1 : 0));*/

        boolean p, q;
        p = true;
        q = true;
        int count;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        for (count = 0; count <= 3; count++) {
            System.out.print(((p) ? 1:0) + "\t" + ((q) ? 1:0) + "\t");
            System.out.print(((p&q) ? 1:0) + "\t" + ((p|q) ? 1:0) + "\t");
            System.out.println(((p^q)? 1:0) + "\t" + ((!p) ? 1:0));

            if (count == 0) {
                p = true;
                q = false;
            }
            if (count == 1) {
                p = false;
                q = true;
            }
            if (count == 2) {
                p = false;
                q = false;
            }
        }
    }
}
