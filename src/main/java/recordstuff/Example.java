package recordstuff;

// purpose is "immutable" data carrier (named tuples? with extras)
// accessor methods created for each "component"
// has name of the component with empty parens, throws no checked exceptions
// has the type of the component (if varags then array)
// components create final fields with the same name
// components cannot have the name of an Object method (e.g. wait, toString :)
record Client(String name, int creditLimit) { // these two are "components"
  // line n1
  // not permitted to add any instance fields
//  private final int x = 99;
  // are permitted static fields, don't even have to be final
  private static int x;
  // are permitted instance, "overriding", and static methods

  @Override // Not really "overriding" -- it's replacing
  public String toString() {
//    return super.toString(); // NOPE, there is no super...
    return "I'm a client with credit " + creditLimit;
  }
}

public class Example {
  public static void main(String[] args) {
    Client c1 = new Client("Fred", 99);
    Client c2 = new Client("Fred", 99);
    Client c3 = new Client("Jim", 99);
    System.out.println(c1); // toString :)
    System.out.println(c1.name());
    System.out.println("equality");
    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));

    System.out.println("hashCodes");
    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c3.hashCode());


  }
}
