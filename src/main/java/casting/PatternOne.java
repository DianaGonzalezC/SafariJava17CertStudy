package casting;

public class PatternOne {
  public static void main(String[] args) {
    Object obj = "Hello";
    boolean answered = false;
    if (obj instanceof String) {
      String str = (String)obj;
      if (str.length() > 3) {
        System.out.println(str);
        answered = true;
      }
    }
    if (!answered) System.out.println("Nope");

    System.out.println("------------");

    // this is still a boolean expression!!!
    // Look into this Tuesday :)
    if (obj instanceof String str) {
      if (str.length() > 3) {
        System.out.println(str);
        answered = true;
      }
    }
    if (!answered) System.out.println("Nope");
  }
}
