// We created objects of "switch" class.
// This program creates two objects s1 and s2 of class 'switch'.


class switch {
  boolean isOn;

  void turnOn() {
    isOn = true;
  }

  void turnOff() {
   isOn = false;
  }
}

class ClassObjectsExample {
public static void main(String[] args) {
   switch s1 = new switch(); // create s1 object of switch class
   switch s2 = new switch(); // create s2 object of switch class
  }
}
