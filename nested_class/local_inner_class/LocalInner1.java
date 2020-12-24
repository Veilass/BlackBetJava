package nested_class.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(20,2);
    }
}

class Math{
//    private int a = 10;

    public void getResult(final int dividend,final int divider){
        class Division{
            public int getPrivate(){
                return dividend/divider;
            }

            public int getRemainder(){
//                System.out.println(a);
                return dividend%divider;
            }
        }

        Division division = new Division();
        System.out.print("Dividend = " + dividend);
        System.out.println("; Divider = " + divider);
        System.out.print("Divider = " + division.getPrivate());
        System.out.println("; Divider = " + division.getRemainder());
    }
}
