package Collections.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx2 {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(8);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(3);
        hashSet2.add(5);
        hashSet2.add(8);

        HashSet<Integer> union = new HashSet<>(hashSet);
        union.addAll(hashSet2);
        System.out.println(union);

        HashSet<Integer> intersect = new HashSet<>(hashSet);
        intersect.retainAll(hashSet2);
        System.out.println(intersect);

        HashSet<Integer> subtract = new HashSet<>(hashSet);
        subtract.removeAll(hashSet2);
        System.out.println(subtract);
    }
}
