package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("Maria");
        list.add("Leonid");
        System.out.println("Pered " +list);
        Collections.sort(list);
        System.out.println("Posle " +list);
     }
}

class Compare {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Ivan");
        list.add("Maria");
        System.out.println("Before sorted: " + list);
        Collections.sort(list);
        System.out.println("After sorted: " + list);
    }
}
