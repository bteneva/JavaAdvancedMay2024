package Streams_Files_Dirs._02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/04. Java-Advanced-Files-and-Streams-Exercises-Resources/input.txt"));
        int sum = 0;

        String line = bufferedReader.readLine();
        while(line != null){
            for (char symbol : line.toCharArray()) {
                sum += symbol;
            }
            line = bufferedReader.readLine();
        }
        System.out.println(sum);

    }
}
