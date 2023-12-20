package org.skm.Collections;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetChallenge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int numberOfPairs=Integer.parseInt(scanner.nextLine());
        HashSet<String> pairs=new HashSet<>();
        String pair;
        for (int i=0;i<numberOfPairs;i++){
            pair=scanner.nextLine();
            pairs.add(pair);

            System.out.println(pairs.size());
        }

    }
}
