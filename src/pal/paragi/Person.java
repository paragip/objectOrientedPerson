package pal.paragi;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            this.age = 0;
        } else this.age = age;
    }

    public boolean isTeen() {
        return age < 20 && age > 12; // if(age < 20 && age > 12) {return true;} else return false;
    }

    public String getFullName() {
        if(firstName.length() == 0 && lastName.length() == 0) {
            return "";
        } else if (firstName.length()==0) {
            return lastName;
        } else if (lastName.length()==0) {
            return firstName;
        } else return firstName + " " + lastName;
    }

}
