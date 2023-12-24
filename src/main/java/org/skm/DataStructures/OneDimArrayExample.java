package org.skm.DataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OneDimArrayExample {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        Integer[] array=new Integer[n];
        for (int i=0;i<n;i++){
            array[i]=Integer.parseInt(scanner.nextLine());
        }

        for (int number:array
             ) {
            System.out.println(number);
        }
    }
}
