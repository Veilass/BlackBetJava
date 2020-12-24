package nested_class.local_inner_class;

public class LocalInner2 {
    public static void main(String[] args) {
        class Addition implements Math2{
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Addition a = new Addition();
        System.out.println(a.doOperation(5,5));
    }
}


interface Math2{
    int doOperation(int a, int b);
}