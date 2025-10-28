package exercise2;

public class Patient {

    String firstName;
    String lastName;
    int age;
    float heightInMeters;
    float weightInKg;

    public Patient(String firstName, String lastName, int age, float heightInMeters, float weightInKg) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.heightInMeters = heightInMeters;
        this.weightInKg = weightInKg;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeightInMeters() {
        return heightInMeters;
    }

    public void setHeightInMeters(float heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    public float getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(float weightInKg) {
        this.weightInKg = weightInKg;
    }

    public String toString(){
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nAge: " + age + "\nHeight: " + heightInMeters + "\nWeight: " + weightInKg;
    }

}
