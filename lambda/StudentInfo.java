package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Zaur", 'm',22,3,8.3);
        Student st2 = new Student("Nikolay", 'm',28,4,7.6);
        Student st3 = new Student("Elena", 'f',19,1,8.9);
        Student st4 = new Student("Petr", 'm',25,3,7.7);
        Student st5 = new Student("Marina", 'f',24,5,9.1);
        ArrayList<Student>students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();

//        info.testStudents(students,(Student s) -> { return s.avgGrade > 8; });
//        System.out.println("-----------------------------------------------------");
//        info.testStudents(students, (student -> {return student.avgGrade > 5;}));
//        System.out.println("-----------------------------------------------------");
//        Predicate<Student> p1 = student -> student.avgGrade > 8.1;
//        Predicate<Student> p2 = student -> student.sex == 'm';
//        info.testStudents(students, p1.negate());
//        System.out.println("----------------------------------");
//        info.testStudents(students, p -> { return p.age < 25; });
//        System.out.println("----------------------------------");
//        info.testStudents(students, (Student p) -> {
//            return p.age > 20 && p.avgGrade < 9.3 && p.sex == 'f';
//        });


        Function<Student, Double>f = student -> student.avgGrade;
        double res = avgOfSmth(students, stud -> (double)stud.age);
        System.out.println(res);

    }
    private static double avgOfSmth(List<Student>list, Function<Student,Double>f){
        double res = 0;
        for (Student st: list){
            res +=f.apply(st);
        }
        res = res/list.size();
        return res;
    }
}


//interface StudentCheks{
//    boolean check(Student s);
//}

//class CheckOverGrade implements StudentCheks{
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }
//}