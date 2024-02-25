package net.mrloic.learn.tasks.four;

import net.mrloic.learn.tasks.three.Order;

import java.time.LocalDate;

/*
Вариант 9
В модуль для описания системы Ателье мод добавить виртуальные методы
поиска по фамилии клиента и дате заказа. Для найденных объектов
выводить информацию по всем полям.
*/


public class Outerwear extends Order
{
    private String lining;
    private int fitting_count;

    public Outerwear(String clientSurname, String itemType, LocalDate orderDate, boolean urgent, String lining, int fitting_count) {
        super(clientSurname, itemType, orderDate, urgent);
        this.lining = lining;
        this.fitting_count = fitting_count;
    }

    // Getters and Setters
    public String get_lining() {
        return lining;
    }

    public void set_lining(String lining) {
        this.lining = lining;
    }

    public int get_fitting_count() {
        return fitting_count;
    }

    public void set_fitting_count(int fitting_count) {
        this.fitting_count = fitting_count;
    }
}
