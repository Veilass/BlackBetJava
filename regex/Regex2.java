package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCHABCH";
//        Pattern pattern1 = Pattern.compile("ABC");
//        String s1 = "abcd abce abc5abcgabch ";
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]");

//        String s1 = "abcd abce abc5abcgabch ";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");// ^ - отрицание

//        String s1 = "abcd abce abc5abcgabch ";
//        Pattern pattern1 = Pattern.compile("abc(e|5)"); // | - знак или

//        String s1 = "abcd abce abc5abcgabch ";
//        Pattern pattern1 = Pattern.compile("abc."); / . - любой символ

//        String s1 = "abcd abce abc5abcgabch";
//        Pattern pattern1 = Pattern.compile("abc5abcgabch$"); // $ - конец строки

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\d"); //  \d - одна цифра от 0 до 9

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w"); // \w - все буквы и цифры

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w+"); + - соотв. 1 или большему кол.повторений

//        String s1 = "abcd!?abce====abc5 ++abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\w"); // \\W - символы и пробелы

//        String s1 = "poka abc Zaur home cinema lego";
//        Pattern pattern1 = Pattern.compile("\\w{4}"); // {n} - количество повторений n

//        String s1 = "poka    abc         Zaur home cinema   legoabctras";
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w");  // {\t\n\r\f} \s - вывод пробелов

//        String s1 = "poka abc Zaur home cinema 2legoabc64tras!!!!!!!!!!!!";
//        Pattern pattern1 = Pattern.compile("\\D{2,}");

//        String s1 = "ABCABABDA";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}");

//        String s1 = "DABCABABDABABABABCABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}"); // DABABABABABABAB

//        String s1 = "DABCABABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)?"); // ? - соответствует 0 или 1 повторению

//        String s1 = "DABCABABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)*"); // * -  соответствует 0 или 1 и более повторений

//        String s1 = "abcd abce abc5abcgabc";
//        Pattern pattern1 = Pattern.compile("\\Aabce"); // A - начало строки

//        String s1 = "abcd abce abc5abcgabh";
//        Pattern pattern1 = Pattern.compile("abh\\Z"); // Z - конец строки

        String s1 = "abcd abce abc5abcgabh";
        Pattern pattern1 = Pattern.compile("[abcd] [efgh3-8]");

        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()){
            System.out.println("Postition: " + matcher.start() + " " + matcher.group());
        }
    }
}
