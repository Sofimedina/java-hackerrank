package org.skm.DataStructures;

import java.io.IOException;
import java.util.Scanner;

public class TwoDimArrayExample {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Integer[][] array = new Integer[6][6];

        for (int i = 0; i < 6; i++) {
            String[] s = scanner.nextLine().split(" ");
            for (int j = 0; j < 6; j++) {
                array[i][j] = Integer.parseInt(s[j]);
            }

        }

        System.out.println("array print---------");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("hourglass print---------");

        Integer max = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(array[i][j] + " " + array[i][j + 1] + " " + array[i][j + 2]);
                System.out.println( "   " + array[i + 1][j + 1] + " ");
                System.out.println(array[i + 2][j] + " " + array[i + 2][j + 1] + " " + array[i + 2][j + 2]);
                int sum = array[i][j] + array[i][j + 1] +      array[i][j + 2] +
                                        array[i + 1][j + 1] +
                        array[i + 2][j]+array[i + 2][j + 1] + array[i + 2][j + 2];
                System.out.println("---------/" + sum);

                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
