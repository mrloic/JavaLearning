package net.mrloic.learn.tasks.four;

import net.mrloic.learn.tasks.three.Order;

import java.time.LocalDate;

/*
Вариант 9
В модуль для описания системы Ателье мод добавить виртуальные методы
поиска по фамилии клиента и дате заказа. Для найденных объектов
выводить информацию по всем полям.
*/


public class LightClothing extends Order
{
    private String complexity;

    public LightClothing(String clientSurname, String itemType, LocalDate orderDate, boolean urgent, String complexity) {
        super(clientSurname, itemType, orderDate, urgent);
        this.complexity = complexity;
    }

    // Getter and Setter for complexity
    public String get_complexity() {
        return complexity;
    }

    public void set_complexity(String complexity) {
        this.complexity = complexity;
    }
}
