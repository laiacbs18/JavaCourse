package OOP;

public class CreatingStudentObject {
    public static void main(String[] args) {
        // Creating the student object
        Student student1 = new Student();

        // Setting the states of object
        student1.name = "John";
        student1.age = 18;
        student1.color = "black";
        student1.sex = 'm';

        // Calling the behaviours of object
        student1.Drinking();
        student1.Eating();
        student1.Running();
    }
}
