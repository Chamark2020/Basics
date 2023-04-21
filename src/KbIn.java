package com.company;

import java.io.IOException;

public class KbIn{
    public static void main(String[] args) throws IOException {
        System.out.print("Enter any text: ");
        //Только для символов походу..Либо int, но выводит соответсвеющее символу число
        char i = (char)System.in.read();
        System.out.println("You've just entered: " + i);
    }
}
