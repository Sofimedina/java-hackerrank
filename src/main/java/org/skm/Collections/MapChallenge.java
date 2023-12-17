package org.skm.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapChallenge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberOfEntries=Integer.parseInt(scanner.nextLine());
        Map<String,String> phoneBook=new HashMap<>(numberOfEntries);
        for (int i = 0; i < numberOfEntries; i++) {
            String name=scanner.nextLine();
            String phone=scanner.nextLine();
            phoneBook.put(name,phone);
        }
        while (scanner.hasNext()){
            String nameSearched=scanner.nextLine();
            if (phoneBook.containsKey(nameSearched)){
                System.out.println(nameSearched+"="+phoneBook.get(nameSearched));
            }else{
                System.out.println("Not found");
            }

        }

        scanner.close();
    }
}
