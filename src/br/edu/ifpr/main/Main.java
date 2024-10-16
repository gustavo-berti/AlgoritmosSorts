package br.edu.ifpr.main;

import java.io.*;

import br.edu.ifpr.arraySorts.ArraySorts;
import br.edu.ifpr.extra.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("example1kk.txt");
        int array[] = Extra.readFile(file);
        int[] aux = new int[array.length];
        // ArraySorts.bubbleSort(array);
        // Extra.printArray(array, "Bubble Organizado");
        // ArraySorts.insertionSort(array);
        // Extra.printArray(array, "Insertion Organizado");
        // ArraySorts.selectionSort(array);
        // Extra.printArray(array, "Selection Organizado");
        ArraySorts.mergeSort(array, aux, 0, array.length - 1);
        Extra.printArray(array, "Merge Organizado");
    }
}
