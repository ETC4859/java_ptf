package ru.stqa.pft.sandbox;


public class MyFirstProgram {

  public static void main(String[] args) {

    Point p1 = new Point(0, 0);

    Point p2 = new Point(3, 4);

    double l = p1.distance(p2);

    System.out.println("Расстояние между двумя точками = " + l);

  }
}