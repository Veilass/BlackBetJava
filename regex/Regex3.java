package regex;

import java.util.regex.Pattern;

public class Regex3 {

    void checkIp(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        //   25[0-5]     |   2[0-4]\d    |    [01]?\d?\d        (\.)
        //   250-255        200 - 249          0 - 199          .
        System.out.println(ip + " is OK? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
//        0-255.0-255.0-255.0-255.0-255.
        String ip1 = "255.38.192.99";
        String ip2 = "265.152.192.1";
        Regex3 r3 = new Regex3();
        r3.checkIp(ip1);
        r3.checkIp(ip2);
    }
}
