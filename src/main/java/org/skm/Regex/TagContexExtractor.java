package org.skm.Regex;

/*regex challenge*/


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContexExtractor {

    public static void main(String[] args){
        //        String line = "<h1>Nayeem loves counseling</h1>";
        String line = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
//        String line = "<Amee>safat codes like a ninja</amee>";
//        String line = "<SA premium>Imtiaz has a secret crush</SA premium>";

        List<String> listLines = new ArrayList<>();

        Pattern patternAllTags ;
        Matcher matcher ;

        while (line.length() > 0) {
            patternAllTags = Pattern.compile("<.*?>", Pattern.CASE_INSENSITIVE);
            matcher = patternAllTags.matcher(line);

            if (matcher.find()) {
                int startPosTag = matcher.start();
                int endPosTag = matcher.end();
                String tag = line.substring(matcher.start(), matcher.end());
                String endTag = "</" + line.substring(matcher.start() + 1, matcher.end());
                patternAllTags = Pattern.compile(endTag);
                matcher = patternAllTags.matcher(line);
                if (matcher.find()) {
                    int startPosEndTag = matcher.start();
                    int endPosEndTag = matcher.end();
                    while (matcher.find()) {
                        startPosEndTag = matcher.start();
                        endPosEndTag = matcher.end();
                    }
                    StringBuilder stLineCatched = new StringBuilder();
                    StringBuilder stLine = new StringBuilder();
                    for (int i = 0; i < line.length(); i++) {
                        if (i < endPosEndTag) {
                            if (i == startPosTag) {
                                i = endPosTag;
                            }
                            if (i != startPosEndTag) {
                                stLineCatched.append(line.charAt(i));
                            } else {
                                i = endPosEndTag - 1;
                            }
                        } else {
                            stLine.append(line.charAt(i));
                        }
                    }
                    if (stLineCatched.length() > 0) {
                        listLines.add(stLineCatched.toString());
                    }
                    line = stLine.toString();
                }else{
                    line="";
                }
            } else {
                line="";
            }

        }
        if (listLines.size() > 0) {
            listLines.forEach(System.out::println);
        } else {
            System.out.println("None");
        }


//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//        while(testCases>0){
//            String line = in.nextLine();
//
//
//            Pattern patternAllTags = Pattern.compile("<.*?>", Pattern.CASE_INSENSITIVE);
//            Matcher matcher = patternAllTags.matcher(line);
//            boolean matchFound = matcher.find();
//            if(matchFound) {
//                System.out.println(matcher.start());
//                System.out.println(matcher.group());
//                System.out.println(matcher.end());
//                System.out.println("Match  found");
//            } else {
//                System.out.println("Match not found");
//            }
//            testCases--;
//        }
    }


}
