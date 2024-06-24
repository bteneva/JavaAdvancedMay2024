package Streams_Files_Dirs._4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of("C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\input.txt"));
        content = content.replaceAll("\\s+", "");
        int vowels = 0;
        int punctuations = 0;
        int other = 0;

        for (char symbol : content.toCharArray()) {
            if (isVowel(symbol)){
                vowels++;

            } else if (isPunctuation(symbol)) {
                punctuations++;
            }
            else {
                other++;
            }
        }
        String newContent = String.format("Vowels: %d%nOther symbols: %d%nPunctuation: %d", vowels, other, punctuations);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\output1.txt"));
        bufferedWriter.write(newContent);
        bufferedWriter.close();

    }

    private static boolean isPunctuation(char symbol) {
        return symbol == '!' || symbol == '?' || symbol == '.' || symbol == ',';
    }

    private static boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'o' || symbol == 'e' || symbol == 'i' || symbol == 'u' ;
    }
}
