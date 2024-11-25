//Create a class person with datamembers like name,age, phno with methods getvalues and printvalues, storethe class in a package called pack1. Define a classnamed student in subpackage SubPack1 and extendthe class defined as person. Use this class in a program of different package Pack2, create an object and invokethe methods defined in pack1 class file.
package Package1;

public class Person {
    String name;
    int age;
    String phNo;

    public Person(String name, int age, String phNo) {
        this.name = name;
        this.age = age;
        this.phNo = phNo;
    }

    public String getValues() {
        return this.name + " " + this.age + " " + this.phNo;
    }

    public void printValues() {
        System.out.println(this.name + " of Age " + this.age + " with Phone Number " + this.phNo);
    }
}
