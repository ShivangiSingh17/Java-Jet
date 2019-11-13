![GitHub last commit](https://img.shields.io/github/last-commit/Starcode71Ooze/JAVA-JET.svg?color=light%20green)  ![Github coverage](https://img.shields.io/badge/Java-100%25-blue.svg) ![Java](https://img.shields.io/badge/Beginner's-Guide-orange.svg)

![alt text](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqe9qPKBN1TNd-HhAPNCx5_dnp8K-K4wS3mouErVI3zt-qLnKi)
# Java
Java is one of the most popular and widely used programming language and platform. It is fast, reliable and secure. Also java is an *object-oriented programming* language. Java is a *statically type language* (because the type of data is predefined as part of the programing language and all constants or variables are defined for a given program).
### Data Types:
They are basically of two types:
1. Primitive data type
1. Object data type

:sound:Primitive consists of boolean, byte, char, short, int, long, float, double. Whereas Object consists of types created by the programmer.
### Variables in Java:
A variable is the name given to a memory location. It is the basic unit of storage in a program.
When declaring a variable, it needs the data type, variable name and value.
For Eg. `int cost = 20;`
Here `int` is data type ,`cost` is the variable name and `20` is value.
### Java Identifiers:
In Java, an identifier can be a class name, method name, variable name or a label. There are certain rules to define java identifiers:

1. Only alphanumeric characters are allowed as identifiers i.e. [A-Z], [a-z], [0-9] and '$', '_'.

1. Identifiers should not start with digit[0-9].

1. Special characters like @ and & are also not allowed.

1. [*Reserved words*](https://www.computerhope.com/jargon/j/java_reserved_words.htm) can't be used.

Here is the first java program-[*Hello World*](https://github.com/Starcode71Ooze/JAVA-JET/blob/master/HelloWorld.java)

#### Basic Syntax in Java:
About Java programs, there are some very important rules to keep in mind,  as follows:

##### Case Sensitivity 
Java is case sensitive, which means identifier `Hello` and `hello` would have different meaning in Java.

##### Class Names 
For all class names the first letter should be in Upper Case. If several words are used to form a name of the class, each inner word's first letter should be in Upper Case. This naming pattern is commonly named UpperCamelCase.

Example: ``class MyFirstJavaClass``

##### Method Names 
All method names should start with a Lower Case letter. If several words are used to form the name of the method, then each inner word's first letter should be in Upper Case.

Example: `public void myMethodName()`


##### Program File Name
In Java, the name of the program file should exactly match the class name.

:unlock:When saving the file, you should save it using the class name (Remember Java is case sensitive) and append '.java' to the end of the name (if the file name and the class name do not match, your program will not compile).

:unlock:But please make a note that in case you do not have a public class present in the file then file name can be different than class name. It is also not mandatary to have a public class in the file.

Example: Assume `'MyFirstJavaProgram'` is the class name. Then the file should be saved as `'MyFirstJavaProgram.java'`

##### public static void main(String args[]) 
Java program processing starts from the `main()` method which is a mandatory part of every Java program.




### OOP Concept:
![alt text](https://stackify.com/wp-content/uploads/2017/04/java-oops-793x397.jpg)

Java is an object oriented programming language. The main aim of OOP is to bind together the data and the functions that operate so that no other part of the code can access this data except that function.
<dd>OOPs Concept INCLUDES: </dd>
:sound:1)<B>Polymorphism-</B> Way to differentiate between entities with the same name efficiently.

  For example:[here](https://github.com/Starcode71Ooze/JAVA-JET/blob/master/polymorphism.java)


:sound:2)<B> Inheritance-</B> Mechanism by which one class can inherit the features of another class.

:sound:3)<B> Object-</B> It is the most basic unit of OOPs. An object consists of: 
 
 - State: It is represented by attributes of an object. It also reflects the properties of an object.
 
 - Behaviour : It is represented by methods of an object. It also reflects the response of an object to other objects.
 
 - Identity: It gives a unique name to an object and enables one object to interact with other objects.
 
 A simple program to explain the concept of an *object* can be found [here](https://github.com/Starcode71Ooze/JAVA-JET/blob/master/Object.java).

:sound:4)<B>Classes-</B>Class is a user defined blueprint or prototype from which objects are created. It shows the set of properties that are common to all objects of same type. In general, class declarations includes:

- Modifiers : A class can be public or has default access.

- Class Name: The name should begin with a letter <B>(capitalized by convention).</B>

- Super Class: The name of the class’s parent (superclass), preceded by the keyword `extends`.

- Body: The class body surrounded by braces, { }.
 
 A simple program to explain the concept of classes can be found [here](https://github.com/Starcode71Ooze/JAVA-JET/blob/master/Class.java).

 ##### :star::star:NOTE: When a class is defined, only the specification for the object is defined; no memory or storage is allocated. To access members defined within the class, you need to create objects.:star: :star:

Example of Class and Object together is [here](https://github.com/ShivangiSingh17/Java-Jet/blob/master/ClassAndObject.java).

### Object Cloning in Java
#### Is cloning possible in real life ?? :joy::joy:
![alt text](https://s3.amazonaws.com/lowres.cartoonstock.com/science-human_cloning-clones-genetic_engineering-cartoon--cgrn5_low.jpg)

Cloning basically means creating an exact copy of an object. The `clone()` method of Object class is used to clone an object.
The `java.lang.Cloneable` interface must be implemented by the class whose object clone we want to create. Else `clone()` method generates `CloneNotSupportedException`.

Syntax of the `clone()` method:

```java
protected Object clone() throws CloneNotSupportedException
```

The `clone()` method is defined in the Object class.
#### *Why do we need this clone() method??*
This method saves the extra processing task for creating the exact copy of an object. If we perform it by using the new keyword, it will take a lot of time, and that's why we use  object cloning.
Example of the `clone()` method is [here](https://github.com/Starcode71Ooze/JAVA-JET/blob/master/Class%20and%20Objects.java).
  
### Java.lang.StringBuffer.appendCodePoint() Method *{RARELY USED}*
This method is used to append the string representattion of the codepoint argument. The syntax followed is:
public StringBuffer appendCodePoint(int cp).

###### Parameter:

codePoint − This is a Unicode code point.

###### Return Value: 

The method returns this object after appending the string represented by the codepoint.

### Arrays
An array is a type of data structure wherein all elements are of the same data type. Once defined, the size of an array is fixed and cannot increase to accommodate more elements. *The first element of an array starts with index zero.*
Or simply can be defined as a programming construct to define certain categories.
It is present in java.util package.
There are *three-steps* involved in defining an array:

- Declaring an array

Syntax:
    `<elementType> <arrayName>[];`
    

- Constructing an Array

Syntax:
      `arrayname = new dataType[]`


- Initialize the Array 

Syntax:
Eg:     `intArray[0]=n; // Assigns an integer value (n=any number) to the first element 0 of the array`

:mag:To declare an array, define the variable type with square brackets.

While working in array we may need to access the terms that are stored in that an array.We do that by referring to the `index number`. Arrays can store data in form of primitive data type or in form of an objects of a class. If it stores as primitive data type then data is stored at memory location or else as a heap segment.

There are two types of array we learn about:

:one: One-Dimensionnal Array

:two: Multi-Dimensional Array

So lets discuss in detail; 

:one:One-dimensional array declaration has two components: *the type and the name.* 

*type* declares the element type of the array. The element type determines the data type of each element that comprises the array. Like array of int type, we can also create have an array of primitive data types like char, float, double..etc or user defined data type(objects of a class). Thus, the element type for the array determines what type of data the array will hold.

Array is basically declared as:

:arrow_right:   type var-name[];
  ###### OR
:arrow_right:   type[] var-name;

Now moving on to the next step that is intialising an array.It basically refers to assigning a initial condition/value to the array.
Syntax:

`variable-name = new type [size];`

:warning: *type specifies* 

The type of data being allocated, size specifies the number of elements in the array, and var-name is the name of array variable that is linked to the array. That is, to use new to allocate an array, you must specify the type and number of elements to allocate.

##### Example:

int intArray[];    //declaring array

`intArray = new int[n];`  // allocating memory to array

where n=any whole number

- The elements in the array allocated by new will automatically be initialised to zero (for numeric types), false (for boolean), or null (for reference types). It is a default value storage.

- Obtaining an array is a two-step process. First, you must declare a variable of the desired array type. Second, you must allocate the memory that will hold the array, using new, and assign it to the array variable.

:heavy_exclamation_mark:Our above example can we written as this also:

`int[] intArray = new int[20];` // combining both statements as one statement.


#### Array Literals
This type is used when we already know about the array like variables and size of the array.

:mag: There is no need to write the `new int[]` part.


#### Accessing Array elements
Once we have an array declared and initialised we can access any element stored in that array by inputing the location of that element. 
Example we create an array called students and we stored the list of all students with their roll no. then we can access any student name by giving his roll no. and transversing in the array as
`student[12]`        
//Let the boy named Deepak is having the roll no.12, so the output will be "Deepak".

#### Arrays of Objects
Lets at first consider an [example](https://github.com/ShivangiSingh17/Java-Jet/blob/master/ObjectArray.java) . 

:question::question:Would you like to guees the output:question::question:.
Just like general arrays the difference with the array of objects is that it stores objects in the array whereas the general array stores integers, variables, boolean etc. Also the array elements store the location of reference variables of the object.

###### Syntax:
```Class obj[]= new Class[array_length]```

So now lets look toowards the output of the :arrow_double_up:[example](https://github.com/ShivangiSingh17/Java-Jet/blob/master/ObjectArray.java). The output will be:


```Element at 0 : 1 Atharv
Element at 1 : 2 Vaibhav
Element at 2 : 3 Gargi
Element at 3 : 4 Sunil
Element at 4 : 5 Shikhar
```


#### Overriding in Java
The benefit of overriding is: ability to define a behavior that's specific to the subclass type, which means a subclass can implement a parent class method based on its requirement.

In object-oriented terms, overriding means to override the functionality of an existing method.
