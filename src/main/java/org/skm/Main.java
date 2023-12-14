package org.skm;

import org.skm.Collections.ListChallenge;
import org.skm.Collections.Querie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListChallenge listChallenge=new ListChallenge();
        //WITH FILE
        try {
            List<String> lines= Files.readAllLines(Paths.get("src/main/java/org/skm/Collections/test3.txt"));
            List<Querie> queries=new ArrayList<>();
            for (int i=3;i<Integer.parseInt(lines.get(2));i=i+2){
                queries.add(new Querie(lines.get(i),lines.get(i+1)));
            }

            listChallenge.run(Integer.parseInt(lines.get(0)),lines.get(1),queries);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //WITH SCANNEER
        /*Scanner scanner=new Scanner(System.in);
        List<String> linesRead=new ArrayList<>();

        while (scanner.hasNextLine()) {
            linesRead.add(scanner.nextLine());
        }

        List<Querie> queries=new ArrayList<>(Integer.parseInt(linesRead.get(2)));

        for (int i=3;i<linesRead.size();i=i+2){
            queries.add(new Querie(linesRead.get(i),linesRead.get(i+1)));
        }

        listChallenge.run(Integer.parseInt(linesRead.get(0)),linesRead.get(1),queries);
        scanner.close();*/
    }
}