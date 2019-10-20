package com.company;

/*Inheritance is an important pillar of OOP(Object Oriented Programming).
  It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.*/

/*Important terminology:

        Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
        Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
        Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.*/

//this some of the most simple implementation of inheritance in Java
//Super Class
class Android{
    protected String brand = "Samsung";

}

//Sub Class
public class Inherit extends Android {

    public static void main(String[] args) {
        String SamsungModel = "Galaxy X10";


        Inherit myAndroid = new Inherit();
        System.out.println(myAndroid.brand+" "+SamsungModel);

    }
}
