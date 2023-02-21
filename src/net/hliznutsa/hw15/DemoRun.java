package net.hliznutsa.hw15;

import static net.hliznutsa.hw15.Point.pointDistance;
import static net.hliznutsa.hw15.Point.pointDistanceZero;

public class DemoRun {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point firstPoint = new Point(11, -7);
        Point secondPoint = new Point(5, -6);

//        firstPoint.setX();
//        firstPoint.setY();
//        secondPoint.setX();
//        secondPoint.setY();

        System.out.println(firstPoint);
        System.out.println(secondPoint);
        System.out.println("Расстояние между точками: " + pointDistance(firstPoint.getX(), firstPoint.getY(), secondPoint.getX(), secondPoint.getY()));
        System.out.println("Расстояние от 0 к первой точке: " + pointDistanceZero(firstPoint.getX(), firstPoint.getY()));
        System.out.println("Расстояние от 0 к второй точке : " + pointDistanceZero(secondPoint.getX(), secondPoint.getY()));
        System.out.println("Координаты точек равны: " + firstPoint.equals(secondPoint));

        Point cloneFirstPoint = firstPoint.clone();
        System.out.println("Первая точка и её клон равны: " + firstPoint.equals(cloneFirstPoint));
    }
}
