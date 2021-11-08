package ITMO_Java_Course;

import java.time.LocalDate;


public class ITMO_Java_Les_6 {
    public static void main(String[] args) {
/*
        Study std = new Study("Изучение Java - это просто!");

        System.out.println(std.printCourse());

        House house = new House();
        House house1 = new House();

        house.buildHouse(5, 1958, "sweet home");
        house1.buildHouse(19, 2005, "some house");

        House.printHouse(house);
        House.printHouse(house1);

        int year = house.countOfYear();
        System.out.println(year);

        Tree tree = new Tree();
        Tree tree1 = new Tree(5, true, "Береза");
        Tree tree2 = new Tree(10, "Сосна");

        System.out.println(tree.toString());
        System.out.println(tree1.toString());
        System.out.println(tree2.toString());
        System.out.println();

        */

        Airplane plane = new Airplane(100, 0, 300);
        Airplane.Wing wing = plane.new Wing(15);
        Airplane plane1 = new Airplane(500, wing, 800);

        System.out.println(plane.toString());
        System.out.println(plane1.toString());




    }
}

class Study {

    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class House {
    private int numOfFloor;
    private int yearBuild;
    private String nameOfHouse;

    public void buildHouse(int numOfFloor, int yearBuild, String nameOfHouse) {
        this.numOfFloor = numOfFloor;
        this.yearBuild = yearBuild;
        this.nameOfHouse = nameOfHouse;
    }

    public static void printHouse(House house) {
        System.out.println(house.toString());
    }

    public int countOfYear() {
        LocalDate yearNow = LocalDate.now();
        int countOfYear = yearNow.getYear() - this.yearBuild;
        return countOfYear;
    }

    @Override
    public String toString() {
        return "House: Колво этажей - " + numOfFloor + ", Год постройки - " + yearBuild + ", Имя дома - " + nameOfHouse;
    }


}

class Tree {
    private int ageOfTree;
    private boolean aliveTree;
    private String nameOfTree;

    public Tree() {
        System.out.println("Сработал пустой конструктор без параметров!");
    }

    public Tree(int ageOfTree, String nameOfTree) {
        this.ageOfTree = ageOfTree;
        this.nameOfTree = nameOfTree;
    }

    public Tree(int ageOfTree, boolean aliveTree, String nameOfTree) {
        this.ageOfTree = ageOfTree;
        this.nameOfTree = nameOfTree;
        this.aliveTree = aliveTree;
    }

    @Override
    public String toString() {
        return "Tree: Колво лет - " + ageOfTree + ", Живое или нет - " + aliveTree + ", Имя - " + nameOfTree;
    }


}

class Airplane {
    private int weightPlane;
    private int weightWing;
    private int longPlane;


    public Airplane(int weightPlane, int weightWing, int longPlane) {
        Wing wing = new Wing(weightWing);
        this.weightPlane = weightPlane;
        this.weightWing = wing.weightWing();
        this.longPlane = longPlane;
    }
    public Airplane(int weightPlane, Wing wing, int longPlane) {
        this.weightPlane = weightPlane;
        this.weightWing= wing.weightWing();
        this.longPlane = longPlane;
    }

    @Override
    public String toString() {
        return "Вес самолета - " + weightPlane + ", Вес крыла - " + weightWing + ", Длина самолета - " + longPlane;
    }


    class Wing {
        private int weight;

        public Wing(int weight) {
            this.weight = weight;
        }

        public int weightWing() {
            return this.weight;
        }

        String printWing() {
            String str = "Вес крыла составляет - " + this.weight + " кг.";
            return str;
        }
    }
}


