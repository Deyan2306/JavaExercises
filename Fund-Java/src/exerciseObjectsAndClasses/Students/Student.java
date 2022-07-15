package exerciseObjectsAndClasses.Students;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public Student (String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
