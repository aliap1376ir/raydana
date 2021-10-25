package com.raydana;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            String content = SlugGenerator.generate(SlugGenerator.Options.GENERATE_FROM_NUMBERS_AND_LETTERS, 10);
            File file = new File("Ray", new Date().getTime() + ".txt");
            file.getParentFile().mkdirs();
            FileOutputStream fout = new FileOutputStream(file);
            fout.write(content.getBytes(StandardCharsets.UTF_8));
            fout.flush();
            fout.close();
            System.out.println(file.getPath() + " is generated with content " + content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
