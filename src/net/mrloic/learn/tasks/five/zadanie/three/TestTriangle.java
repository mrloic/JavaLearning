package net.mrloic.learn.tasks.five.zadanie.three;

import java.util.Scanner;

public class TestTriangle {
    public static void testTriangle() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону 1 треугольника:");
        double side1 = scanner.nextDouble();

        System.out.print("Введите сторону 2 треугольника:");
        double side2 = scanner.nextDouble();

        System.out.print("Введите сторону 3 треугольника:");
        double side3 = scanner.nextDouble();

        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            System.out.println("Вы ввели не существующий треугольник");
            return;
        }

        scanner.nextLine(); // Consume the newline character

        System.out.print("Введите цвет треугольника:");
        String color = scanner.nextLine();

        System.out.print("Введите true/false, в зависимости от того будет ли заполнен треугольник:");
        boolean filled = scanner.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Цвет: " + triangle.getColor());
        System.out.println("Заливка: " + triangle.isFilled());
    }
}
