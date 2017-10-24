package Homework_5.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        List<Integer> integersList = new ArrayList<>();

        integersList.add(1);
        integersList.add(2);
        integersList.add(3);

        List<String> stringsList = new ArrayList<>();

        stringsList.add("a");
        stringsList.add("b");
        stringsList.add("c");

        Map<Integer,String> integerStringMap = new HashMap<>();

        for (int i=0;i<integersList.size();i++){
            integerStringMap.put(integersList.get(i),stringsList.get(i));
        }

    }
}
