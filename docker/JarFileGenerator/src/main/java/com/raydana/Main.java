package com.raydana;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println(SlugGenerator.generate(SlugGenerator.Options.GENERATE_FROM_NUMBERS_AND_LETTERS, 10));
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
