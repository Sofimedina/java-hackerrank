package org.skm.DataStructures;

import java.io.IOException;
import java.util.Scanner;

public class TwoDimArrayExample {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
//        int n=Integer.parseInt(scanner.nextLine());
        Integer[][] array=new Integer[6][6];
        for (int i=0;i<6;i++){
            for (int j=0;j<6;j++){
                array[i][j]=0;
            }
        }

        for (int i=0;i<6;i++){
            for (int j=0;j<6;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
