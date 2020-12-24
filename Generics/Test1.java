package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("privet");
        list.add("poka");
        list.add("lets-go");

        for (String s: list) {
            System.out.print(s + " ");
        }
    }

}


class Car{}