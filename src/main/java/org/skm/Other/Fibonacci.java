package org.skm.Other;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void  getFiboNumber(Integer number1,Integer number2,Integer count){
        List<Integer> listOfFibos=new ArrayList<>(count+2);
        listOfFibos.add(number1);
        listOfFibos.add(number2);

        for (int i=2;i<count+2;i++){
            listOfFibos.add(listOfFibos.get(i-1)+listOfFibos.get(i-2));
        }

        System.out.println(listOfFibos);

        return;
    }
    public static void main(String[] args) {

        getFiboNumber(2,3,4);
    }
}
