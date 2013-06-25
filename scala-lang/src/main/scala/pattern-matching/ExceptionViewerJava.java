import java.lang.NullPointerException;
import java.lang.Exception;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class ExceptionViewerJava {
  public static void main(String[] args) {

    List<Exception> latestExceptions = new ArrayList<Exception>();
    latestExceptions.add(new Exception("Something happened in the bytes"));
    latestExceptions.add(new FileNotFoundException("Couldn't find input file"));
    latestExceptions.add(new NullPointerException("Can't de-reference pointer"));

    List<String> displayMessages = new ArrayList<String>();

    for(Exception ex : latestExceptions) {
      if ((ex instanceof FileNotFoundException)) {
        displayMessages.add("[RED] File problem: "+ex.getMessage());
      } else if ((ex instanceof NullPointerException)) {
        displayMessages.add("[RED] Runtime null pointer problem: "+ex.getMessage());
      } else {
        displayMessages.add("[AMBER] General problem: "+ex.getMessage());
      }
    }

    for(int i=0; i<displayMessages.size(); i++) {
      System.out.print(displayMessages.get(i));
      if (i < displayMessages.size() - 1) {
        System.out.println(",");
      } else {
        System.out.println("");
      }
    }

  }
}