package org.skm.DataStructures;

import java.util.Scanner;

public class SubArray
{
    static void getSubArray(int[] number, int i){

        return;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String[] numbersString=scanner.nextLine().split(" ");

        int[] numbers={1,-2,4,-5,1};
        int count=0;
        for (int i=0;i<numbersString.length;i++) {
            String s="";
            int sum=0;
            for (int j=i;j<numbersString.length;j++){
                s=s+" "+String.valueOf(numbersString[j]);
                System.out.println(s);
                sum=sum+Integer.valueOf(numbersString[j]);
                if (sum<0){
                    count++;
                }
            }
        }
        System.out.println("Count:"+count);
    }
}
