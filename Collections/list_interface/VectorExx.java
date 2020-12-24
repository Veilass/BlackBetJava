package Collections.list_interface;

import java.util.Stack;
import java.util.Vector;

public class VectorExx {
        public static void main(String[] args) {
            Vector<String> vector = new Vector<>();
            vector.add("Zaur");
            vector.add("Misha");
            vector.add("Oleg");
            vector.add("Masha");
            System.out.println(vector);
            System.out.println(vector.get(1));
        }
}
