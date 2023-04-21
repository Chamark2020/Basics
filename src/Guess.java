package com.company;

import java.io.IOException;

public class Guess {
    public static void main(String[] args) throws IOException {
        char answer = 's';
        char i, ignore;
        System.out.print("Guess char from A to Z: ");
        do {
            i = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while(ignore != '\n');
            if (i == answer) {
                System.out.println("Amazing! You guessed!");
                break;
            } else {
                System.out.print("Sorry, but hidden letter is closer to the ");
                if (i < answer) {
                    System.out.print("end of alphabet\nTry again: ");
                   // i = (char) System.in.read();
                } else {
                    System.out.print("beginning of the alphabet\nTry again: ");
                   // i = (char) System.in.read();

                }
            }
        } while ((i != '1') && (i != '2'));
    }
}

