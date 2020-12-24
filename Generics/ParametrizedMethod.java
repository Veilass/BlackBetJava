package Generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer>al1 = new ArrayList<>();
        // ArrayList al1 = new ArrayList();
        //int i = (Integer)al1.get(0);
        al1.add(10);
        al1.add(20);
        al1.add(5);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);

        ArrayList<String>al2 = new ArrayList<>();
        al2.add("Privet");
        al2.add("Poka");
        al2.add("Kak dela");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);
        String s1 = GenMethod.getFirstElement(al2);
    }

}


class GenMethod{
    public static <T> T getFirstElement(ArrayList<T> aL){
        return aL.get(0);
    }

    public static <T> T getSecondElement(ArrayList<T> aL){
        return aL.get(1);
    }
}


