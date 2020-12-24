package Collections.map_interface;

import Generics.game.Employee;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        int num_passport;
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000,"Zaur Tregulov");
        map1.put(1500,"Ivan Sidorov");
        map1.put(2600,"Nikolay Andromedov");
        map1.put(3250,"Leonid Vagapov");
        map1.put(1563,"Timur Oparin");
        map1.put(5941,"Vasily Tembov");
        map1.putIfAbsent(1000, "Lion Keogl");
//        System.out.println(map1);
//        System.out.println(map1.get(4600));
        map1.remove(2600);
        System.out.println(map1);
//        if(map1.containsKey(5941)){
//            System.out.println("ON EST " + map1.get(5941));
//        }else
//            System.out.println("EGO NETU!!!");

        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha","Dobruy");
        map2.put("Misha","Angry");
        Map<Employee, Employee> map3 = new HashMap<>();


    }



}
