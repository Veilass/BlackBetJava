package Collections.map_interface;

import java.util.Hashtable;

public class HashTableEx1 {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Ivan", "Nedoruvan", 1);
        Student st3 = new Student("Elesei", "Vagapov", 4);
        Student st4 = new Student("Maxim", "Sidorov", 2);

        ht.put(6.5,st1);
        ht.put(6.8,st2);
        ht.put(7.7,st3);
        ht.put(7.2,st4);

        System.out.println(ht);
    }
}
