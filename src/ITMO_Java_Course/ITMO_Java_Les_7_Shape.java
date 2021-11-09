package ITMO_Java_Course;

import java.util.ArrayList;

public class ITMO_Java_Les_7_Shape {
    private double volume;

    public ITMO_Java_Les_7_Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}

class SolidOfRevolution extends ITMO_Java_Les_7_Shape {
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Ball extends SolidOfRevolution {
    public Ball(double radius) {
        super(Math.PI * Math.pow(radius, 3) * 4 / 3, radius);
    }
}

class Cylinder extends SolidOfRevolution {

    private final double height;

    public Cylinder(double radius, double height) {
        super(Math.PI * radius * radius * height, radius);
        this.height = height;
    }
}

class Pyramid extends ITMO_Java_Les_7_Shape{
    private double height;
    private double s;

    public Pyramid(double height, double s) {
        super(height * s * 4 / 3);
        this.height = height;
        this.s = s;
    }
}


class Box extends ITMO_Java_Les_7_Shape {
    private final ArrayList<ITMO_Java_Les_7_Shape> shapes = new ArrayList<>();
    private double available;

    public Box(double available) {
        super(available);
        this.available = available;
    }

    public boolean add(ITMO_Java_Les_7_Shape shape) {
        if (available >= shape.getVolume()) {
            shapes.add(shape);
            available -= shape.getVolume();
            return true;
        } else {
            return false;
        }
    }
}

class Main {

    public static void main(String[] args) {
        Ball ball = new Ball(8.5);
        Cylinder cylinder = new Cylinder(4, 5);
        Pyramid pyramid = new Pyramid(10, 10);

        Box box = new Box(1000);

        System.out.println(box.add(ball));
        System.out.println(box.add(cylinder));
        System.out.println(box.add(pyramid));
    }
}

