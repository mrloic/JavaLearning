package net.mrloic.learn.tasks.four;

/*
Вариант 9
Разработать модуль для описания системы Ателье мод. Описать следующие классы: Заказ
(фамилия клиента, вид изделия, дата заказа, срочность), легка одежда (сложность) и верхняя
одежда (подкладка, количество примерок). Создать консольное приложение для вывода данных
объектов.
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TaskFour {
    public static void StartFour()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Создаем список заказов
        List<Order> orders = new ArrayList<>();

        // Добавляем несколько заказов в список
        orders.add(new Order("Иванов", "легкая одежда", LocalDate.now(), true));
        orders.add(new Order("Петров", "верхняя одежда", LocalDate.of(2024, 2, 20), false));
        orders.add(new Order("Сидоров", "рубашка", LocalDate.of(2024, 2, 25), true));

        // Поиск заказов по фамилии клиента
        String search_surname = "Иванов";
        System.out.println("Результаты поиска по фамилии клиента " + search_surname + ":");
        for (Order order : orders) {
            if (order.search_by_client_surname(search_surname)) {
                order.print_info();
                System.out.println();
            }
        }

        // Поиск заказов по дате заказа
        LocalDate search_date = LocalDate.now(); // Поиск по текущей дате
        System.out.println("Результаты поиска по дате заказа " + search_date.format(formatter) + ":");
        for (Order order : orders) {
            if (order.search_by_order_date(search_date)) {
                order.print_info();
                System.out.println();
            }
        }

    }

}
