package advanced;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class lesson58_write_files {
    public static void main(String[] args){

        // How to write a file using jJava (4 popular options)

        // FileWriter = Good for small or medium-sized text files.
        // BufferedWriter = Better performance for large amounts of text.
        // PrintWriter = Best for structured data, like reports or logs.
        // FileOutputStream = Best for binary files (e.g., images, audio files)

        String filePath = "C:\\Users\\HP\\Dekstop\\test.txt";
        String textContent = "I like pizza.";

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            System.out.println("File has been written.");
        }catch (FileNotFoundException e){
            System.out.println("Could not locate file location.");
        }catch (IOException e){
            System.out.println("Could not write file.");
        }

    }
}
