package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
//        list.add("lele");



        List<? extends Number> list30 = new ArrayList<Integer>();
        List<? super Number> list31 = new ArrayList<Number>();


        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("lele");
        list2.add("Peot");
        list2.add("majeg");
        showListInfo(list2);



        ArrayList<Double>list3 = new ArrayList<>();
        list3.add(3.14);
        list3.add(3.15);
        list3.add(3.16);
        System.out.println(summ(list3));


        ArrayList<Integer>list4 = new ArrayList<>();
        list4.add(3);
        list4.add(5);
        list4.add(10);
        System.out.println(summ(list4));
//
//        ArrayList<String> list5 = new ArrayList<>();
//        System.out.println(summ(list5));
    }

    static void showListInfo(List<?> list){
        System.out.println("My list contains following elements: "+ list);
    }

    public static double summ(ArrayList <? extends Number> list){
       double summ = 0;
       for (Number n : list){
           summ+= n.doubleValue();
       }
       return summ;
    }

}
