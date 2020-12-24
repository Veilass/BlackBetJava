package lambda;
import java.util.ArrayList;
import java.util.function.Supplier;

class Car{
    String model,color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}'+ "\n";
    }
}
