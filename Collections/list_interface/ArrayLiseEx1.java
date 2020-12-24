package Collections.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiseEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Oleg");
        System.out.println(arrayList1);

        ArrayList<String>arrayList2 = new ArrayList<>(200);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");
        List<String> arrayList3 = new ArrayList<>();
        ArrayList<String>arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList4);
        System.out.println(arrayList1==arrayList4);
    }
}
