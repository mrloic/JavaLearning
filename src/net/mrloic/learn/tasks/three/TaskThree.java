package net.mrloic.learn.tasks.three;

/*
Вариант 9
Разработать модуль для описания системы Ателье мод. Описать следующие классы: Заказ
(фамилия клиента, вид изделия, дата заказа, срочность), легка одежда (сложность) и верхняя
одежда (подкладка, количество примерок). Создать консольное приложение для вывода данных
объектов.
*/

import java.time.LocalDate;

public class TaskThree {
    public static void StartThree()
    {


        // Создаем объекты заказов
        LocalDate orderDate1 = LocalDate.now(); // Текущая дата
        Order order1 = new Order("Иванов", "легкая одежда", orderDate1, true);

        LocalDate orderDate2 = LocalDate.now(); // Текущая дата
        Order order2 = new Order("Петров", "верхняя одежда", orderDate2, false);

        // Создаем объекты легкой одежды
        LightClothing lightClothing1 = new LightClothing("Сидоров", "рубашка", orderDate1, false, "сложный");

        // Создаем объекты верхней одежды
        Outerwear outerwear1 = new Outerwear("Смирнов", "пальто", orderDate2, true, "шерсть", 2);

        // Выводим информацию о заказах
        System.out.println("Информация о заказе 1:");
        order1.printInfo();

        System.out.println("\nИнформация о заказе 2:");
        order2.printInfo();

        // Выводим информацию о легкой одежде
        System.out.println("\nИнформация о легкой одежде 1:");
        lightClothing1.printInfo();

        // Выводим информацию о верхней одежде
        System.out.println("\nИнформация о верхней одежде 1:");
        outerwear1.printInfo();

    }

}
