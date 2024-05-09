package net.mrloic.learn.tasks.five.zadanie.four;

public class UseComparable {
    public static void circle() {
        ComparableCircle circle1 = new ComparableCircle(5);
        ComparableCircle circle2 = new ComparableCircle(7);
        Rectangle rectangle = new Rectangle(4, 6);

        // Сравнение двух кругов
        ComparableCircle largestCircle = circle1.compareTo(circle2) > 0 ? circle1 : circle2;
        System.out.println("Наибольший круг: радиус = " + largestCircle.radius + ", площадь = " + largestCircle.getArea());

        // Сравнение круга и прямоугольника
        double circleArea = largestCircle.getArea();
        double rectangleArea = rectangle.getArea();
        if (circleArea > rectangleArea) {
            System.out.println("Круг больше прямоугольника");
        } else if (circleArea < rectangleArea) {
            System.out.println("Прямоугольник больше круга");
        } else {
            System.out.println("Площади круга и прямоугольника равны");
        }
    }
}
