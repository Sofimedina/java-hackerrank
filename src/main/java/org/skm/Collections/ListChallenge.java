package org.skm.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListChallenge {
    public void run(int numbersOfElements,String numbersEntered,List<Querie> queries){
        List<String> numbers=new ArrayList<>(numbersOfElements);
        for (String number:numbersEntered.split("\\s+")) {
            numbers.add(number);
        }




        for (Querie querie:queries) {
            if (querie.getQuerieDesc().equals("Insert")){
                int indexForInsert=Integer.parseInt(querie.querieVal.split("\\s+")[0]);
                String valToInsert=querie.querieVal.split("\\s+")[1];
                if (numbers.size()>indexForInsert){
                    numbers.add(indexForInsert,valToInsert);
                }else {
                    numbers.add(valToInsert);
                }

            }
            if (querie.getQuerieDesc().equals("Delete")){
                int indexToRemove=Integer.parseInt(querie.querieVal);
                if (indexToRemove<numbers.size()){
                    numbers.remove(numbers.get(indexToRemove));
                }
            }

        }

        String response="";
        for (String number:numbers){
            response=response+number+" ";
        }
        System.out.println(response);
    }
}
