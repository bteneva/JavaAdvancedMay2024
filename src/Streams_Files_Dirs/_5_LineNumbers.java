package Streams_Files_Dirs;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _5_LineNumbers {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputLineNumbers.txt";
        List<String> lines = Files.readAllLines(Path.of(path));
        int countLines = 0;
        PrintWriter printWriter = new PrintWriter("C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output2.txt");
        for (String line : lines) {
            countLines++;
            line = String.format("%d. %s", countLines, line);
            printWriter.println(line);
        }
        printWriter.close();
    }
}
