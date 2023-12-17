package org.skm.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int nroOfLines=Integer.parseInt(sn.nextLine());
        ArrayList<List<String>> listOfList=new ArrayList<>(nroOfLines);
        for (int i=0;i<nroOfLines;i++){
            List<String> listOfNumber=new ArrayList<>(List.of(sn.nextLine().split(" ")));
            listOfList.add(listOfNumber);
        }
        int nroOfQueries=Integer.parseInt(sn.nextLine());
        ArrayList<String> result=new ArrayList<>(nroOfQueries);
        String[] query;
        for (int i=0;i<nroOfQueries;i++){
            query=sn.nextLine().split(" ");
            if (listOfList.size()>Integer.parseInt(query[0])){
                if (listOfList.get(Integer.parseInt(query[0])-1).size()>Integer.parseInt(query[1])){
                    result.add(listOfList.get(Integer.parseInt(query[0])-1).get(Integer.parseInt(query[1])));
                }else {
                    result.add("ERROR!");
                }
            }else{
                result.add("ERROR!");
            }
        }

        for (String number:result
             ) {
            System.out.println(number);
        }


    }
}
