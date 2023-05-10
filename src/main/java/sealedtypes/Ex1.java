package sealedtypes;

interface Transporter {
}

class Truck implements Transporter {
}

class Car implements Transporter {
}

//class Bicycle implements Transporter {}

public class Ex1 {
  public static void main(String[] args) {
    Transporter t = Math.random() > 0.5 ? new Truck() : new Car();

    if (t instanceof Truck tr) {
      // can the truck do this?
    } else if (t instanceof Car c) {
      // can the car do this?
    }

  }
}
