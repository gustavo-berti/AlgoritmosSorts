package br.edu.ifpr.insertionsort;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("example10k.txt");
        int array[] = readArray(file);
        insertionSort(array);
        printArray(array);

    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            Sum.totalComparation++;
            while (j >= 0 && array[j]>key) {
                Sum.totalSwap++;
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static int[] readArray(File file){
        int array[];
        try {
            BufferedReader bf = new BufferedReader(new FileReader("example10k.txt"));
            String line = bf.readLine();
            line.replace("{","").replace("}","");
            String[] lines = line.split(", ");
            array = Arrays.stream(lines).mapToInt(Integer::parseInt).toArray();
        }
        catch(Exception e) {
            int fail[] = {0};
            array = fail;
        }
        return array;
    }

    public static void printArray(int[] array) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Insertion Organizado"))) {
            writer.write("{");
            for (int i = 0; i < array.length; i++) {
                writer.write(String.valueOf(array[i]));
                if(i<array.length - 1){
                    writer.write(", ");
                }
            }
            writer.write("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nTotal de comparações: "+ Sum.totalComparation+"\nTotal de trocas: "+ Sum.totalSwap);
    }
}
