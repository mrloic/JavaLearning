package net.mrloic.learn.tasks.four;

/*
Вариант 9
В модуль для описания системы Ателье мод добавить виртуальные методы
поиска по фамилии клиента и дате заказа. Для найденных объектов
выводить информацию по всем полям.
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
            if (order.searchByClientSurname(search_surname)) {
                order.printInfo();
                System.out.println();
            }
        }

        // Поиск заказов по дате заказа
        LocalDate search_date = LocalDate.now(); // Поиск по текущей дате
        System.out.println("Результаты поиска по дате заказа " + search_date.format(formatter) + ":");
        for (Order order : orders) {
            if (order.searchByOrderDate(search_date)) {
                order.printInfo();
                System.out.println();
            }
        }

    }

}
