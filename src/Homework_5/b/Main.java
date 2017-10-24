package Homework_5.b;

public class Main {

    public static void main(String[] args){
        MyClass myClass = new MyClass();
        MyFunction(myClass);
    }

    public static void MyFunction(MyInterface myClass){
        System.out.println(myClass.GetRandomNumber());
    }
}
