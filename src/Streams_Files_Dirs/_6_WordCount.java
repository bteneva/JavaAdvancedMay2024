package Streams_Files_Dirs;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class _6_WordCount {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\words.txt";
        String[] words = Files.readString(Path.of(path)).split(" ");
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        String text = Files.readString(Path.of("C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\text.txt"));
        for (String word : words) {
            wordCount.put(word, 0);
        }
        for (String word : text.split("\\s+")) {
            if (wordCount.containsKey(word)){
                int count = wordCount.get(word) + 1;
                wordCount.put(word, count);
            }
        }
        PrintWriter writer = new PrintWriter("C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\result.txt");
        wordCount.entrySet().forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();

    }
}
