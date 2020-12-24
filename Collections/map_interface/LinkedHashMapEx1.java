package Collections.map_interface;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapEx1 {
    public static void main(String[] args) {
        LinkedHashMap<Double,Student> lhm = new LinkedHashMap<>(16,0.75f, true);
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Ivan", "Nedoruvan", 1);
        Student st3 = new Student("Elesei", "Vagapov", 4);
        Student st4 = new Student("Maxim", "Sidorov", 2);
        Student st5 = new Student("Dmitry", "Knipolov", 2);

        lhm.put(6.5,st1);
        lhm.put(6.8,st2);
        lhm.put(7.7,st5);
        lhm.put(7.2,st3);
        lhm.put(7.4,st4);
        System.out.println(lhm);

        System.out.println(lhm.get(6.8));
        System.out.println(lhm.get(7.2));
        System.out.println(lhm.get(7.4));
        System.out.println(lhm.get(6.5));


        System.out.println(lhm);



    }
}
