package Collections.list_interface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(-3);
//        list.add(8);
//        list.add(12);
//        list.add(-8);
//        list.add(0);
//        list.add(5);
//        list.add(10);
//        list.add(1);
//        list.add(150);
//        list.add(-30);
//        list.add(19);
//        Collections.sort(list);
//        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);
//        Collections.shuffle(list);
//        System.out.println(list);
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee(2,"Zaur","Trigulov",1000);
        Employee emp2 = new Employee(5,"Ivan","Sidorov",750);
        Employee emp3 = new Employee(1,"Leonid","Jeron",800);
        Employee emp4 = new Employee(4,"Oleg","Nijak",800);
        Employee emp5 = new Employee(3,"Nikolay","Jeron",800);
        Employee emp6 = new Employee(6,"Alexander","Burgnoi",800);
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        Collections.sort(employeeList);
        System.out.println(employeeList);
        int index2 = Collections.binarySearch(employeeList, emp4);
        System.out.println(index2);

            int[]array = {-3,8,12,0,5,-8,10,1,150,-30,19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index3 = Arrays.binarySearch(array, 150);
        System.out.println(index3);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}' + "\n";
    }

    @Override
    public int compareTo(Employee e) {
        int res = this.id-e.id;
        if(res == 0){
            res  = this.name.compareTo(e.name);
        }
        return res;
    }
}
