package Collections.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
        set.remove("Zaur");
//        set.add(null);
        System.out.println(set.size());
        for (String s:set) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(set.contains("Marina"));
    }
}
