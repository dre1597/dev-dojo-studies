package demo.devdojo.maratonajava.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
  public static void main(String[] args) {
    File file = new File("io/txt/file.txt");

    try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      String line;
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }
}
