# Interfaces in Java
In java interfaces are group of methods with empty bodies we use keyword (implement) in interfaces as we use extend keyword in inheritance.

* We can make reference of interface but we can not make make objects of interface
* Default access modifier of objects of interfaces is 'public'
 
# There are mainly three reasons to use interface. They are given below.

* It is used to achieve abstraction.
* By interface, we can support the functionality of multiple inheritance.
* It can be used to achieve loose coupling.

# Interfaces Diagram

![why-use-java-interface](https://user-images.githubusercontent.com/97012657/183828099-dedead70-430f-4f18-94fc-3d6e3caadaac.jpg)


# How to declare an interface?
An interface is declared by using the interface keyword. It provides total abstraction; means all the methods in an interface are declared with the empty body, and all the fields are public, static and final by default. A class that implements an interface must implement all the methods declared in the interface.

Syntax:
----

interface <interface_name>{  
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
}  

# The relationship between classes and interfaces
![interfacerelation](https://user-images.githubusercontent.com/97012657/183828652-28165a80-f21b-4c55-b214-a1f72cb75783.jpg)

# Java Interface Example
In this example, the Printable interface has only one method, and its implementation is provided in the A6 class.

interface printable{  
void print();  
}  
class A6 implements printable{  
public void print(){
System.out.println("Hello");
                   }  
  
public static void main(String args[]){  
A6 obj = new A6();  
obj.print();  
 }  
}  

Output:
----
Hello
