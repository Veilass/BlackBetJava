package comparation;

import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Car car1 = new Car("blue","BMW m5",11573764,2.2,170);
        Car car2 = new Car("white","Toyota camry",11571224,1.7,150);
        Car car3 = new Car("blue","Mercedes am55",11355516,2.0,160);
        Car car4 = new Car("blue","Lada vesta",11315701,1.6,155);
        Car car5 = new Car("blue","Audi a5",11947403,1.5,140);
        List<Car>cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        System.out.println("Cars before: \n " + cars);
        Collections.sort(cars);
        System.out.println("Cars serial_sort: \n " + cars);
        Collections.sort(cars, new modelCompare());
        System.out.println("Cars model_sort: \n " + cars);
        Collections.sort(cars, new engineCompare());
        System.out.println("Cars engine_sort: \n " + cars);

    }
}

class Car implements Comparable<Car>{
    String color,carModel;
    int serialNumber;
    double engine,avgSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", carModel='" + carModel + '\'' +
                ", serialNumber=" + serialNumber +
                ", engine=" + engine +
                ", avgSpeed=" + avgSpeed +
                "}\n";
    }

    public Car(String color, String carModel, int serialNumber, double engine, double avgSpeed) {
        this.color = color;
        this.carModel = carModel;
        this.serialNumber = serialNumber;
        this.engine = engine;
        this.avgSpeed = avgSpeed;


    }

    @Override
    public int compareTo(Car o) {
        return this.serialNumber-o.serialNumber;
    }
}

class modelCompare implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
        return o1.carModel.compareTo(o2.carModel);
    }
}

class engineCompare implements Comparator<Car>{

    @Override
    public int compare(Car o1, Car o2) {
      if(o1.engine == o2.engine){
          return 0;
      }else if(o1.engine > o2.engine){
          return 1;
      }else
          return -1;
    }
}
