package Streams_Files_Dirs._3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadAllCapitals {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of("C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt"));
        content = content.toUpperCase();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output.txt"));
        bufferedWriter.write(content);
        bufferedWriter.close();

    }
}
