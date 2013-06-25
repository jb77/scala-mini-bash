public class SugarJava {
  public static void main(String[] args) {

    System.out.println(formatMessage("James"));
    System.out.println(formatMessage("Will"));
    System.out.println(formatMessage());

  }

  public static String formatMessage() {
    return formatMessage("there");
  }

  public static String formatMessage(String name) {
    if (name.equals("Will")) {
      return "Hello Boss!";
    } else {
      return "Hello " + name + "!";
    }
  }
}