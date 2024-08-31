package br.edu.ifpr.insertionsort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date1 = java.sql.Date.valueOf("2004-08-11");        
        Date date2 = java.sql.Date.valueOf("2005-08-11");        
        Date date3 = java.sql.Date.valueOf("2006-08-11");        
        Date date4 = java.sql.Date.valueOf("2007-08-11");        
        Date date5 = java.sql.Date.valueOf("2008-08-11");        
        Date date6 = java.sql.Date.valueOf("2009-08-11");        
        Date date7 = java.sql.Date.valueOf("2010-08-11");        
        Date date8 = java.sql.Date.valueOf("2011-08-11");        
        Date date9 = java.sql.Date.valueOf("2012-08-11");
        Date date10 = java.sql.Date.valueOf("2013-08-11");
        Date array[] = {date10,date8,date9,date6,date7,date4,date5,date1,date2,date3};
        insertionSort(array);
        printArray(array);

    }
    public static void insertionSort(Date[] array) {
        for (int i = 1; i < array.length; i++) {
            Date key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].after(key)) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(Date[] array) {
        SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/YYYY");
        for (int i = 0; i < array.length; i++) {
            System.out.print(sdt.format(array[i]) + " ");
        }
    }
}
