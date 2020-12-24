package Generics;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        String s = "Privet";
        Pair <String, String> pair1 = new Pair<>("Scr.link:",s);
        System.out.println(pair1.getValue1() + pair1.getValue2());

        Pair <Integer, Double> pair2 = new Pair<>(156,3.14);
        System.out.println(pair2.getValue1() + " " + pair2.getValue2());

        Pair<Integer, Integer> pair3 = new Pair<>(25,25);
        System.out.println(pair3.getValue1()+ " " +pair3.getValue2());


    }

}

class Pair<V1, V2> {
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1(){
        return value1;
    }

    public V2 getValue2(){
        return value2;
    }
}

class OuthPair<V> {
    private V value1;
    private V value2;

    public V abc(V value){
        return value;
    }

    public OuthPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }
}