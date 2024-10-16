package br.edu.ifpr.extra;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Extra {
    public static void printArray(int[] array, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("{");
            for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                if (i < array.length - 1) {
                    writer.write(", ");
                }
            }
            writer.write("}");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int[] readFile(File file) {
        int array[];
        try {
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = bf.readLine();
            String[] lines = line.split(", ");
            array = new int[lines.length];
            for (int i = 0; i < lines.length; i++) {
                array[i] = Integer.parseInt(lines[i]);
            }
            bf.close();
        } catch (Exception e) {
            int fail[] = { 0 };
            array = fail;
        }
        return array;
    }
}
