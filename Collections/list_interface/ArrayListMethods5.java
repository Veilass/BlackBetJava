package Collections.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Vasya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        List<Integer> list1 = List.of(3,8,15);
        System.out.println(list1);

//        list1.add(100);

        List<String>list2 = List.copyOf(arrayList1);
        System.out.println(list2);

//        System.out.println("ArrayList = " + arrayList1);
//        List<String>list = arrayList1.subList(1,4);
//        System.out.println ("SubList = " +list);
//        list.add("Fedor");
//        System.out.println("SubList = " +list);
//        System.out.println("ArrayList = " +arrayList1);
//        arrayList1.add("Sveta");
//        System.out.println("ArrayList = " +arrayList1);
//        System.out.println("SubList = " +list);
//        Object [] array = arrayList1.toArray();
//        String[]array2 = arrayList1.toArray(new String[0]);
//
//        for (String s:array2) {
//            System.out.print(s + " ");
//        }





//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Zaur");
//        arrayList2.add("Ivan");
//        arrayList2.add("Gena");
//
//        System.out.println(arrayList1.containsAll(arrayList2));
//        System.out.println(arrayList1);
    }
}
