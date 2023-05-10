package client;

//import anotherpackage.HackIt;

import java.lang.reflect.Field;

public class MyClient {
  public static void main(String[] args) throws Throwable {
    System.out.println(service.MyValues.message);
//    System.out.println(service.MyValues.secretMessage);
    Class<?> cl = service.MyValues.class;
    Field f = cl.getDeclaredField("secretMessage");
    f.setAccessible(true);
    Object secret = f.get(null);
    System.out.println(secret);
    // JPMS prohibits "split packages"
//    System.out.println(HackIt.getIt());
  }
}
