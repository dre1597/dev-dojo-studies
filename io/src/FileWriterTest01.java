import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// BufferedWriter - new one using buffer
// BufferedReader - new one using buffer

public class FileWriterTest01 {
  public static void main(String[] args) {
    File file = new File("io/txt/file.txt");
    try(FileWriter fileWriter = new FileWriter(file)) {
      fileWriter.write("Imagine a message");
      fileWriter.flush();
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }
}
