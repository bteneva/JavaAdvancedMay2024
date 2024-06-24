package Streams_Files_Dirs;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class _7_MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String file1Content = Files.readString(Path.of("C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputOne.txt"));
        String file2Content = Files.readString(Path.of("C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputTwo.txt"));
        PrintWriter printWriter = new PrintWriter("C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\merged.txt");
        printWriter.println(String.format("%s%n%s",file1Content, file2Content));
        printWriter.close();

    }
}
