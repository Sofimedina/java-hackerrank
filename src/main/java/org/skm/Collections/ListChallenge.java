package org.skm.Collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListChallenge {

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

    public static void main(String[] args) {

        //WITH FILE
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/java/org/skm/Collections/test3.txt"));
            List<Querie> queries = new ArrayList<>();
            for (int i = 3; i < Integer.parseInt(lines.get(2)); i = i + 2) {
                queries.add(new Querie(lines.get(i), lines.get(i + 1)));
            }

            List<String> numbers = new ArrayList<>(Integer.parseInt(lines.get(0)));
            Collections.addAll(numbers, lines.get(1).split("\\s+"));

            for (Querie querie : queries) {
                if (querie.getQuerieDesc().equals("Insert")) {
                    int indexForInsert = Integer.parseInt(querie.querieVal.split("\\s+")[0]);
                    String valToInsert = querie.querieVal.split("\\s+")[1];
                    if (numbers.size() > indexForInsert) {
                        numbers.add(indexForInsert, valToInsert);
                    } else {
                        numbers.add(valToInsert);
                    }

                }
                if (querie.getQuerieDesc().equals("Delete")) {
                    int indexToRemove = Integer.parseInt(querie.querieVal);
                    if (indexToRemove < numbers.size()) {
                        numbers.remove(numbers.get(indexToRemove));
                    }
                }

            }

            String response = "";
            for (String number : numbers) {
                response = response + number + " ";
            }
            System.out.println(response);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
