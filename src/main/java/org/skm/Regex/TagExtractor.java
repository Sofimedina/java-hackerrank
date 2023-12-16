package org.skm.Regex;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagExtractor {

    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/TagExtractor/test1"));
            String tagReg = "<(.+)>([^<]+)</\\1>";
            Pattern tagPattern = Pattern.compile(tagReg);
            for (int i=1;i<lines.size();i++){
                Matcher tagMatcher = tagPattern.matcher(lines.get(i));
                if (tagMatcher.find()) {
                    do {
                        System.out.println(tagMatcher.group(2));
                    } while (tagMatcher.find());
                } else {
                    System.out.println("None");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
