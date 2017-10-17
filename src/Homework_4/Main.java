package Homework_4;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Mercedes-Benz","S class",2016,"black");
        Human regularGuy = new Human("Giorgi","Chubinidze","male",21,car);

        System.out.println(regularGuy.toString());
    }
}
