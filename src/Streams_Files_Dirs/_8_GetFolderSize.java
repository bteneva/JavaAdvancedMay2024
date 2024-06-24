package Streams_Files_Dirs;

import java.io.File;

public class _8_GetFolderSize {
    public static void main(String[] args) {
        String path = "C:\\Users\\billy\\Documents\\SoftUniProjects\\SoftUni-Java-Advanced\\src\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(path);
        int size = 0;
        for (File file: folder.listFiles()){
            size +=file.length();
        }
        System.out.println("Folder size: "+ size);
    }
}
