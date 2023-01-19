package demo.devdojo.maratonajava.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
  public static void main(String[] args) {
    File file = new File("io/txt/file.txt");
    try (FileWriter fileWriter = new FileWriter(file); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
      bufferedWriter.write("Imagine a message written with the buffered writer");
      bufferedWriter.newLine();
      bufferedWriter.flush();
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }
}
