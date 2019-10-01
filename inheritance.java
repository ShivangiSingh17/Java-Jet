//Inheritance is an important pillar of OOP(Object Oriented Programming).
//It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class


// Java program to demonstrate Inheritance 

// If we want to define dogs and cats and birds and we know all these
// animals have names and ages we should create a superclass class.

// SUPERCLASS
class Animal {
    private String name;
    private int age;

    public void identify() {
        System.out.println("I am an animal!");
    }

    public void rename(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int newAge) {
        if(newAge > 0)
            age = newAge;
    }

    public int getAge() {
        return age;
    }
}

// SUBCLASSES
class Dog extends Animal {
    public void bark() {
        System.out.println("Bark!");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Meow!");
    }
}

class Bird extends Animal {
    public void chirp() {
        System.out.println("Chirp!");
    }
}
}
public class Test  
{ 
    	// Driver code 
    public static void main(String args[]) 
	{ 
		Dog dog = new Dog();
        dog.setAge(5); //function of base class is called using an object of derived class.
        System.out.println(dog.getAge());
        dog.bark();
        Cat cat = new Cat();
        cat.identify();
        cat.meow();
        
	} 
} 
