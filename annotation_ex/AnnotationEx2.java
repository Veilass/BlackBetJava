package annotation_ex;

import lambda.Student;

import java.lang.annotation.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.lang.Comparable;

public class AnnotationEx2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("annotation_ex.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Xiaomi class: " +
                sm1.OS() + ", " + sm1.yearOfCompanyCreation());
        System.out.println("======================================");
        Class appleClass = Class.forName("annotation_ex.Apple");
        Annotation annotation2 = appleClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from Apple class: " +
                sm2.OS() + ", " + sm2.yearOfCompanyCreation());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default  "Android";
    int yearOfCompanyCreation() default 2010;
}

@SmartPhone
class Xiaomi{
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Apple{
    String model;
    double price;
}
