import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class HelloNamesJava {
  public static void main(String[] args) throws IOException {
    
    FileReader fileReader = new FileReader("names.txt");
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    
    List<String> names = new ArrayList<String>();

    String line = null;
    
    while ((line = bufferedReader.readLine()) != null) {
      names.add(line);
    }

    bufferedReader.close();

    for(String name : names) {
      System.out.println("Hello "+name+"!");
    }
  }
}