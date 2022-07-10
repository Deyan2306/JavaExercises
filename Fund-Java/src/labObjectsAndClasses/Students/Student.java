package labObjectsAndClasses.Students;

public class Student {
    private String firstName;
    private String lastName;
    private String age;
    private String homeTown;

    public Student (String firstName, String lastName, String age, String homeTown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.homeTown = homeTown;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
