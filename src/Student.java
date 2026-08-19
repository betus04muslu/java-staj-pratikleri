public class Student {
    private String firstName;
    private String lastName;
    private int id;
    private double grade;

    public Student(String firstName, String lastName, int id, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = grade;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getId() { return id; }
    public double getGrade() { return grade; }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + firstName + " " + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }
}

