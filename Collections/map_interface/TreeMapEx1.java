package Collections.map_interface;

import java.util.TreeMap;

public class TreeMapEx1{
    public static void main(String[] args) {
       TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Ivan", "Nedoruvan", 1);
        Student st3 = new Student("Elesei", "Vagapov", 4);
        Student st4 = new Student("Maxim", "Sidorov", 2);
        Student st5 = new Student("Dmitry", "Knipolov", 2);
        Student st6 = new Student("Vasily", "Jarikov", 1);
        Student st7 = new Student("Leonid", "Manikov", 4);
        Student st8 = new Student("Kurban", "Reonov", 3);
        Student st9 = new Student("Timur", "Mustafhov", 2);
        Student st10 = new Student("Nikolay", "Balinsov", 1);

        treeMap.put(6.5,st1);
        treeMap.put(6.8,st2);
        treeMap.put(7.2,st3);
        treeMap.put(7.4,st4);
        treeMap.put(7.7,st5);
        treeMap.put(7.9,st6);
        treeMap.put(8.1,st7);
        treeMap.put(8.4,st8);
        treeMap.put(8.8,st9);
        treeMap.put(9.2,st10);

        System.out.println(treeMap);



////        System.out.println(treeMap.get(6.5));
////        treeMap.remove(6.5);
////        System.out.println(treeMap);
//        System.out.println( treeMap.descendingMap());
//        System.out.println( treeMap.headMap(7.4));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());
    }
}
