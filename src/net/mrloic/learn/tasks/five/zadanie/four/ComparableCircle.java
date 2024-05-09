package net.mrloic.learn.tasks.five.zadanie.four;


public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int compareTo(ComparableCircle other) {
        double diff = this.getArea() - other.getArea();
        if (diff > 0) {
            return 1;
        } else if (diff < 0) {
            return -1;
        }
        return 0;
    }

}

abstract class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public abstract double getArea();
}

class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

