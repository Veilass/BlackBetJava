package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectEx2 {
    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException,
            IllegalAccessException, InvocationTargetException, InstantiationException {
        Class employeeClass = Class.forName("Reflection.Employee");

//        Employee employee = (Employee)employeeClass.newInstance();
//        System.out.println(employee);

        Constructor<Employee> constructor1 = employeeClass .getConstructor();
         Employee obj1 = constructor1.newInstance();

         Constructor constructor2 = employeeClass.getConstructor(int.class,
                 String.class, String.class);
         Object obj2 = constructor2.newInstance(5,"Zaur","IT");
        System.out.println(obj2);
        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(obj2, 15000);
        System.out.println(obj2);
    }
}
