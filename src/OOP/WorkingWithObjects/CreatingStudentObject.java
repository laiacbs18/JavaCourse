package OOP.WorkingWithObjects;

public class CreatingStudentObject {
    public static void main(String[] args) {
        // Creating the student object 
        // using the default constructor
        Student student1 = new Student();

        // Setting the states of object
        // student1.name = "John"; // these return error since the states were changed to private
        // student1.age = 18;
        // student1.color = "black";
        // student1.sex = 'm';

        // New way to set them after creating getters and setters
        student1.setName("John");
        student1.setAge(18);
        student1.setColor("black");
        student1.setSex('m');

        // Calling the behaviours of object
        student1.Drinking();
        student1.Eating();
        student1.Running();

        // Creating the student object 
        // using the full state constructor
        Student student2 = new Student("Maria", 15, "Pink", 'f');
        student2.SayName(); // Will output "My name is Maria" since the name was added in the constructor
    }
}
