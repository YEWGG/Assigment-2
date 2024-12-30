package models;

public abstract class Person implements Payable, Comparable<Person> {
    private int id;
    private String name;
    private String surname;
    public static int gen_id = 1;

    private void generateID() {
        id = gen_id++;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        generateID();
    }

    public Person() {
        generateID();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return null;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname+ " earns " + getPaymentAmount()+" tenge";
    }
    @Override
    public int compareTo(Person obj){
        if(this.getPaymentAmount()>obj.getPaymentAmount()){
            return 1;
        }
        else if(this.getPaymentAmount()<obj.getPaymentAmount()){
            return -1;
        }
        else{
            return 0;
        }
    }

}
