package com.jcmsalves.kotlinplayground.trywithresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Use {

    private String readFirstLine() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("test.file"));
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
