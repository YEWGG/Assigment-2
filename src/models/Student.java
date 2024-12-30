package models;

public class Student extends Person{
    private double gpa;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public Student() {
        super();
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
    @Override
    public int compareTo(Person obj){
        return super.compareTo(obj);
    }
}

