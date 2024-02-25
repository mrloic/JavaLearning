package net.mrloic.learn.tasks.three;

/*
Вариант 9
Разработать модуль для описания системы Ателье мод. Описать следующие классы: Заказ
(фамилия клиента, вид изделия, дата заказа, срочность), легка одежда (сложность) и верхняя
одежда (подкладка, количество примерок). Создать консольное приложение для вывода данных
объектов.
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class TaskThree {
    public static void StartThree()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Создаем объекты заказов
        LocalDate order_date_1 = LocalDate.now(); // Текущая дата
        Order order_1 = new Order("Иванов", "легкая одежда", order_date_1, true);

        LocalDate order_date_2 = LocalDate.now(); // Текущая дата
        Order order_2 = new Order("Петров", "верхняя одежда", order_date_2, false);

        // Создаем объекты легкой одежды
        LightClothing light_clothing_1 = new LightClothing("Сидоров", "рубашка", order_date_1, false, "сложный");

        // Создаем объекты верхней одежды
        Outerwear outerwear_1 = new Outerwear("Смирнов", "пальто", order_date_2, true, "шерсть", 2);

        // Выводим информацию о заказах
        System.out.println("Информация о заказе 1:");
        System.out.println("Фамилия клиента: " + order_1.get_client_surname());
        System.out.println("Вид изделия: " + order_1.get_item_type());
        System.out.println("Дата заказа: " + order_1.get_order_date().format(formatter));
        System.out.println("Срочность: " + order_1.is_urgent());

        System.out.println("\nИнформация о заказе 2:");
        System.out.println("Фамилия клиента: " + order_2.get_client_surname());
        System.out.println("Вид изделия: " + order_2.get_item_type());
        System.out.println("Дата заказа: " + order_2.get_order_date().format(formatter));
        System.out.println("Срочность: " + order_2.is_urgent());

        // Выводим информацию о легкой одежде
        System.out.println("\nИнформация о легкой одежде 1:");
        System.out.println("Фамилия клиента: " + light_clothing_1.get_client_surname());
        System.out.println("Вид изделия: " + light_clothing_1.get_item_type());
        System.out.println("Дата заказа: " + light_clothing_1.get_order_date().format(formatter));
        System.out.println("Срочность: " + light_clothing_1.is_urgent());
        System.out.println("Сложность: " + light_clothing_1.get_complexity());

        // Выводим информацию о верхней одежде
        System.out.println("\nИнформация о верхней одежде 1:");
        System.out.println("Фамилия клиента: " + outerwear_1.get_client_surname());
        System.out.println("Вид изделия: " + outerwear_1.get_item_type());
        System.out.println("Дата заказа: " + outerwear_1.get_order_date().format(formatter));
        System.out.println("Срочность: " + outerwear_1.is_urgent());
        System.out.println("Подкладка: " + outerwear_1.get_lining());
        System.out.println("Количество примерок: " + outerwear_1.get_fitting_count());

    }

}
