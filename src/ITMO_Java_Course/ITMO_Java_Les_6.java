package ITMO_Java_Course;

import java.time.LocalDate;
import java.util.Locale;


public class ITMO_Java_Les_6 {
    public static void main(String[] args) {
        Study std = new Study("Изучение Java - это просто!");

        System.out.println(std.printCourse());

        House house = new House();
        House house1 = new House();

        house.buildHouse(5,1958, "sweet home");
        house1.buildHouse(19, 2005, "some house");

        House.printHouse(house);
        House.printHouse(house1);

        int year = house.countOfYear();
        System.out.println(year);


    }
}

class Study {

    private String course;

    public Study(String course){
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class House{
    private int numOfFloor;
    private int yearBuild;
    private String nameOfHouse;

    public void buildHouse(int numOfFloor, int yearBuild, String nameOfHouse){
        this.numOfFloor = numOfFloor;
        this.yearBuild = yearBuild;
        this.nameOfHouse = nameOfHouse;
    }

    public static void printHouse(House house){
        System.out.println(house.toString());
    }

    public int countOfYear(){
        LocalDate yearNow = LocalDate.now();
        int countOfYear = yearNow.getYear() - this.yearBuild;
        return countOfYear;
    }

    @Override
    public String toString() {
        return "House: Колво этажей - " + numOfFloor + ", Год постройки - " + yearBuild + ", Имя дома - " + nameOfHouse;
    }



}


