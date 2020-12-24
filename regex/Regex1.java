package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48" +
                " email: vivanov@mail.ru, Postcode: 28291, Phone: +123456789;" +
                "Petrova Mariya, Russia, Saint Petersburg, Dostoevskogo street, 25, Flat 103" +
                " email: masha@mail.ru, Postcode: 14892, Phone: +987654321;" +
                "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21" +
                " email: chuck@gmail.com, Postcode: USA23, Phone: +583021573.;";

//        Pattern pattern = Pattern.compile("\\w+");
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b"); // \b - соответствует грацинице чисел
//        Pattern pattern = Pattern.compile("\\+\\d{9}");
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");

        Matcher matcher = pattern.matcher(s);
        while (matcher.find()){
            System.out.println(matcher.group());
        }

    }
}
