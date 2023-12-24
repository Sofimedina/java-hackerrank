package org.skm.Other;

import java.util.HashSet;
import java.util.Set;

public class MultiplesOf {
    public static void main(String[] args) {
        int number=10;
        Set<Integer> multiples=new HashSet<>();
        int sum=0;

        for(int i=0;i<number;i++){
            if (i%3==0 || i%5==0){
                multiples.add(i);
            }
        }


        System.out.println(multiples.stream().reduce(0,(n1,n2) ->n1+n2));

    }
}
