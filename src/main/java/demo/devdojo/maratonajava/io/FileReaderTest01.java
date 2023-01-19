package demo.devdojo.maratonajava.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
  public static void main(String[] args) {
    File file = new File("io/txt/file.txt");

    try (FileReader fileReader = new FileReader(file)) {
//      char[] in = new char[20];
//      int read = fileReader.read(in);
//      for(char c: in) {
//        System.out.print(c);
//      }

      int i;

      while ((i = fileReader.read()) != -1) {
        System.out.print((char) i);
      }
    } catch (IOException exception) {
      exception.printStackTrace();
    }
  }
}
