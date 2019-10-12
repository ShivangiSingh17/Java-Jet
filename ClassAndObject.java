//Lamp class is created.
//The class has an instance variable `isOn` and three methods turnOn(), turnOff() and displayLightStatus().


class Lamp {
  boolean isOn;

  void turnOn() {
    isOn = true;
  }

  void turnOff() {
   isOn = false;
  }
  
  void displayLightStatus() {
     
     System.out.println("Light on? " + isOn);
  }
}


public class ClassObjectsExample {
public static void main(String[] args) {
   
   Lamp l1 = new Lamp(), l2 = new Lamp();
   
   l1.turnOn();
   l2.turnOff();
   
   l1.displayLightStatus();
   l2.displayLightStatus();
  }
}


/*The program on running, the output will be:
Light on? true
Light on? false*/
