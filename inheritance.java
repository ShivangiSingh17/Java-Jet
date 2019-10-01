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
