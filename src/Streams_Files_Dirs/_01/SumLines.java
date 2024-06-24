package Streams_Files_Dirs._01;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> lines = Files.readAllLines(Path.of(path));
        for (String line : lines) {
            int sum = 0;
            for (char c : line.toCharArray()) {
                sum += c;
            }
            System.out.println(sum);
        }
    }
}
