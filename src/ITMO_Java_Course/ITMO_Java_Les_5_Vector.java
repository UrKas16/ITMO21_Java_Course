package ITMO_Java_Course;

import java.util.Arrays;

public class ITMO_Java_Les_5_Vector {
    private double x;
    private double z;
    private double y;

    public ITMO_Java_Les_5_Vector(double x, double y, double z) { //конструктор класса, принимает параметры точек
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Задание вычислить длинну вектора
    public double lenVector() {
        double lenVector = Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
        return lenVector;
    }

    // Скалярное произведение векторов
    public static double scalyarVector(ITMO_Java_Les_5_Vector vec, ITMO_Java_Les_5_Vector vec1) {
        double scalyarVector = vec.x * vec1.x + vec.y * vec1.y + vec.z * vec1.z;
        return scalyarVector;
    }

    // Векторное произведение с другим вектором
    public static ITMO_Java_Les_5_Vector multVector(ITMO_Java_Les_5_Vector vec, ITMO_Java_Les_5_Vector vec1) {
        double newX = vec.y * vec1.z - vec.z * vec1.y;
        double newY = vec.z * vec1.x - vec.x * vec1.z;
        double newZ = vec.x * vec1.y - vec.y * vec1.x;

        ITMO_Java_Les_5_Vector newVector = new ITMO_Java_Les_5_Vector(newX, newY, newZ);

        return newVector;
    }

    // cos угла векторов
    public static double cosVector(ITMO_Java_Les_5_Vector vec, ITMO_Java_Les_5_Vector vec1) {
        double scalyarVector = scalyarVector(vec, vec1);
        double lenVector = Math.abs(vec.lenVector());
        double lenVector1 = Math.abs(vec1.lenVector());

        return Math.cos(Math.toDegrees(scalyarVector / (lenVector * lenVector1)));
        //return scalyarVector / (lenVector * lenVector1);
    }

    // сложение векторов
    public static ITMO_Java_Les_5_Vector addVector(ITMO_Java_Les_5_Vector vec, ITMO_Java_Les_5_Vector vec1) {
        double newX = vec.x + vec1.x;
        double newY = vec.y + vec1.y;
        double newZ = vec.z + vec1.z;

        ITMO_Java_Les_5_Vector newVector = new ITMO_Java_Les_5_Vector(newX, newY, newZ);

        return newVector;
    }

    // вычетание векторов
    public static ITMO_Java_Les_5_Vector subVector(ITMO_Java_Les_5_Vector vec, ITMO_Java_Les_5_Vector vec1) {
        double newX = vec.x - vec1.x;
        double newY = vec.y - vec1.y;
        double newZ = vec.z - vec1.z;

        ITMO_Java_Les_5_Vector newVector = new ITMO_Java_Les_5_Vector(newX, newY, newZ);

        return newVector;
    }

    // статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N
    public static ITMO_Java_Les_5_Vector[] randomVector(int n) {
        ITMO_Java_Les_5_Vector[] rndVector = new ITMO_Java_Les_5_Vector[n];
        for (int i = 0; i < n; i++) {
            rndVector[i] = new ITMO_Java_Les_5_Vector(Math.random(), Math.random(), Math.random());
        }
        return rndVector;
    }


    public static void main(String[] args) {
        ITMO_Java_Les_5_Vector vector = new ITMO_Java_Les_5_Vector(-15, 3, 45);
        ITMO_Java_Les_5_Vector vector1 = new ITMO_Java_Les_5_Vector(32, 4, -8);

        ITMO_Java_Les_5_Vector newVector[] = randomVector(3);
        //double cosVec = cosVector(vector, vector1);


        //double len = vector.lenVector();
        System.out.println(Arrays.toString(newVector));
    }
}

