package Homework_4;

public class Human {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private Car favoriteCar;

    public Human(String firstName) {
        this.firstName = firstName;
    }
    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Human(String firstName, String lastName, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }
    public Human(String firstName, String lastName, String sex, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }
    public Human(String firstName, String lastName, String sex, int age, Car favoriteCar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.favoriteCar = favoriteCar;
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
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Car getFavoriteCar() {
        return favoriteCar;
    }
    public void setFavoriteCar(Car favoriteCar) {
        this.favoriteCar = favoriteCar;
    }

    @Override
    public String toString() {

        return age+" years old "+sex+", " +firstName +" " +lastName+", likes "+favoriteCar.toString()+".";
    }
}
