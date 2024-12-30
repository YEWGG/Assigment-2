import java.util.ArrayList;
import java.util.Collections;
import models.Person;
import models.Student;
import models.Employee;
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("Dauren", "Zhexenov", 4.0));
        persons.add(new Student("Nurkhan", "Orazbay", 3.5));
        persons.add(new Student("Ruslan", "Bolatbekuly", 1.0));
        persons.add(new Employee("Askar", "Khaimuldin", "Senior-Lecturer", 7000000));
        persons.add(new Employee("Alisher", "Kairzhan", "Junior-Lecturer", 500000));
        persons.add(new Employee("Aidana", "Oryngalieva", "Assistant", 1000000));
        Collections.sort(persons);
        printData(persons);
    }
    public static void printData(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}