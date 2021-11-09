package ITMO_Java_Course;

public class ITMO_Java_Les_7_class_Car_Track {
    public static void main(String[] args) {
        Car car = new Car();
        car.outPut();
        Truck truck = new Truck(15000, "Volvo", 'B', 120, 8, 15000);
        truck.outPut();

    }
}

class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;


    public void outPut () {
        System.out.println("Вес " + model + " составляет " + weight + "кг.");
        System.out.println("Цвет машины - " + color + " и её скорость - " + speed);
    }

    public Car (int weight, String model, char color, float speed) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public Car () {

    }
}

class Truck extends Car {
    public int wheelCount;
    public int maxWeight;

    public Truck(int weight, String model, char color, float speed, int wheelCount, int maxWeight) {
        super(weight, model, color, speed);
        this.wheelCount = wheelCount;
        this.maxWeight = maxWeight;
    }

    public void newWheels(int newCount) {
        this.wheelCount = newCount;
        System.out.println("У фуры " + this.wheelCount + " колес.");
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("У фуры " + wheelCount + " колес. Максимальная разрешенная масса " + maxWeight + " кг.");
    }
}


