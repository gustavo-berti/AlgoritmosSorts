package br.edu.ifpr.arraySorts;

public class ArraySorts {
    
    public static void bubbleSort(int[] array){
        boolean swap = true;
        while(swap){
            swap = false;
            for(int i = 1;i< array.length;i++){
                if(array[i-1]>array[i]){
                    int temp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temp;
                    swap = true;
                }
            }
        }
        
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j]>key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]<array[key])
                    key = j;
            }
            if (key != i) {
                int temp = array[i];
                array[i] = array[key];
                array[key] = temp;
            }
        }
    }    
    public static void mergeSort(int[] array, int[] aux, int begin, int end) {
        if (begin < end){
            int middle = (begin + end) / 2;
            mergeSort(array, aux, begin, middle);
            mergeSort(array, aux, middle + 1, end);
            for (int i = begin; i <= end; i++) {
                aux[i] = array[i];
            }
            int left = begin;
            int right = middle + 1;
            for (int i = begin; i <= end; i++) {
                if (left > middle) {
                    array[i] = aux[right++];
                } else if (right > end) {
                    array[i] = aux[left++];
                } else if (aux[left] < aux[right]) {
                    array[i] = aux[left++];
                } else {
                    array[i] = aux[right++];
                }
            }
        }
    }
}
