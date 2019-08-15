// A class is a blueprint
// for creating objects

// OOP
// model things as objects
// an object has behavior
// an object has state
// an object identity
// an object is an entity

// Profile Printer
// Name, Age, Occupation, Nationality, Gender

// class
// have variable declarations called fields or properties
// methods; functions; functions or procedures

// behavior
// age is 25
// getYearOrBirth

// access modifiers
public class Person {
    // access modifiers
    public String firstName;
    public String lastName;
    public String occupation;
    public String nationality;
    public int age;
    public String gender;

    // Default constructor
    // Constructor

    public Person() {}

    public int getYearOfBirth() {
        return 0;
    }


    @Override
    public String toString() {
        return "{ Full Name: " + firstName + " " + lastName +
                " Nationality: " + nationality +
                " Gender: " + gender +
                "}";
    }
}
