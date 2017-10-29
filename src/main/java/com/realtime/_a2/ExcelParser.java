
package com.realtime._a2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExcelParser {

    static final List<String> KEYWORDS = Arrays.asList("null", "true", "false", 
            "abstract", "continue", "for", "new", "switch", "assert", "default", 
            "goto", "package", "synchronized", "boolean", "do", "if", "private",
            "this", "break", "double", "implements", "protected", "throw", 
            "byte", "else", "import", "public", "throws", "case", "enum", 
            "instanceof", "return", "transient", "catch", "extends", "int", 
            "short", "try", "char", "final", "interface", "static", "void", 
            "class", "finally", "long", "strictfp", "volatile", "const", 
            "float", "native", "super", "while");

    public static void main(String[] args) {
        ExcelParser parser = new ExcelParser();
        parser.compute();
    }

    public void compute() {
        final String[] headers = new String[4];
        List<Matrik> matriks = new ArrayList<>();
        FileHandler fileHandler = new FileSaver();

        try (Stream<Path> paths = Files.walk(Paths.get("files/"))) {
            paths.filter(Files::isRegularFile).forEach(path -> {

                final String[] name = new String[1];

                try {
                    List<String> content = Files.lines(path).collect(Collectors.toList());
                    content.forEach(s -> {
                        if (s.startsWith("//Semester: #") && headers[0] == null) {
                            headers[0] = s.split("#")[1];
                        } else if (s.startsWith("//Course: #") && headers[1] == null) {
                            headers[1] = s.split("#")[1];
                        } else if (s.startsWith("//Group: #") && headers[2] == null) {
                            headers[2] = s.split("#")[1];
                        } else if (s.startsWith("//Task: #") && headers[3] == null) {
                            headers[3] = s.split("#")[1];
                        } else if (s.startsWith("//Matrik: #")) {
                            name[0] = s.split("#")[1];
                        }
                    });

                    if (name[0] != null) {
                        Map<String, Integer> wordCount = new HashMap<>();

                        long comments = content.stream().filter(line -> line.contains("//")).count();
                        // System.out.println("Comment " + comments);
                        long blanks = content.stream().filter(line -> line.replaceAll("\\s", "").length() == 0).count();
                        // System.out.println("Blank " + blanks);
                        // System.out.println("LOC " + content.size());
                        long actual = content.size() - blanks - comments;
                        // System.out.println("Actual " + actual);

                        final int[] totalKeywords = {0};
                        KEYWORDS.forEach(keyword -> {
                            final int[] occurances = {0};
                            content.forEach(line -> occurances[0] += Arrays.stream(line.split("\\s")).filter(word -> word.equals(keyword)).count());
                            if (occurances[0] > 0) {
                                // System.out.println(keyword + " " + occurances[0]);
                                totalKeywords[0] += occurances[0];
                            }
                            wordCount.put(keyword, occurances[0]);
                        });
                        // System.out.println("Total " + (actual + totalKeywords[0]));

                        Matrik matrik = new Matrik(name[0], content.size(), blanks, comments, actual, wordCount, actual + totalKeywords[0]);
                        matriks.add(matrik);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        fileHandler.storeData(headers, matriks);
    }
}

