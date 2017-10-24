package Homework_5.b;

import java.util.Random;

public class MyClass implements MyInterface{
    public int GetRandomNumber(){
        Random rand = new Random();
        int  n = rand.nextInt(2000);
        return n;
    }
}
