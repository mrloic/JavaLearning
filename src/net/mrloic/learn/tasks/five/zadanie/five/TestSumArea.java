package net.mrloic.learn.tasks.five.zadanie.five;

public class TestSumArea {
    public static void testSumArea() {
        // Создание массива из четырех геометрических объектов
        GeometricObject[] shapes = new GeometricObject[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Circle(3);
        shapes[2] = new Rectangle(4, 6);
        shapes[3] = new Rectangle(2, 8);

        // Вычисление общей площади геометрических объектов
        double totalArea = sumArea(shapes);
        System.out.println("Общая площадь: " + totalArea);

    }

    public static double sumArea(GeometricObject[] a) {
        double sum = 0;
        for (GeometricObject shape : a) {
            sum += shape.getArea();
        }
        return sum;
    }

}
