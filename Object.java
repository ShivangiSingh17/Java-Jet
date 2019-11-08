// We created objects of "switch" class.
// This program creates two objects s1 and s2 of class 'switch'.


class Switch {
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
   Switch s1 = new Switch(); // create s1 object of switch class
   Switch s2 = new Switch(); // create s2 object of switch class
	s1.turnOn();//Turning the switch s1 on.
  }
}
