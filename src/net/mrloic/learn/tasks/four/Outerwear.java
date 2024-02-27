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
    private int fittingCount;

    public Outerwear(String clientSurname, String itemType, LocalDate orderDate, boolean urgent, String lining, int fittingCount) {
        super(clientSurname, itemType, orderDate, urgent);
        this.lining = lining;
        this.fittingCount = fittingCount;
    }

    // Getters and Setters
    public String getLining() {
        return lining;
    }

    public void setLining(String lining) {
        this.lining = lining;
    }

    public int getFittingCount() {
        return fittingCount;
    }

    public void setFittingCount(int fittingCount) {
        this.fittingCount = fittingCount;
    }
}
