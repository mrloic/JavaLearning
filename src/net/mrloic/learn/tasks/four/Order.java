package net.mrloic.learn.tasks.four;

/*
Вариант 9
В модуль для описания системы Ателье мод добавить виртуальные методы
поиска по фамилии клиента и дате заказа. Для найденных объектов
выводить информацию по всем полям.
*/


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order
{
    private String clientSurname; //фамилия клиента
    private String itemType; //вид изделия
    private LocalDate orderDate; //дата заказа
    private boolean urgent; //срочность

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Order(String clientSurname, String itemType, LocalDate orderDate, boolean urgent)
    {
        this.clientSurname = clientSurname;
        this.itemType = itemType;
        this.orderDate = orderDate;
        this.urgent = urgent;
    }

    // Геттеры и сеттеры для всех полей
    public String getClientSurname()
    {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname)
    {
        this.clientSurname = clientSurname;
    }

    public String getItemType()
    {
        return itemType;
    }

    public void setItemType(String itemType)
    {
        this.itemType = itemType;
    }

    public LocalDate getOrderDate()
    {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate)
    {
        this.orderDate = orderDate;
    }

    public boolean isUrgent()
    {
        return urgent;
    }

    public void setUrgent(boolean urgent)
    {
        this.urgent = urgent;
    }

    // Виртуальный метод поиска по фамилии клиента
    public boolean searchByClientSurname(String surname) {
        return this.clientSurname.equals(surname);
    }

    // Виртуальный метод поиска по дате заказа
    public boolean searchByOrderDate(LocalDate date) {
        return this.orderDate.equals(date);
    }

    // Вывод информации по всем полям
    public void printInfo()
    {
        System.out.println("Фамилия клиента: " + this.clientSurname);
        System.out.println("Вид изделия: " + this.itemType);
        System.out.println("Дата заказа: " + this.orderDate.format(formatter));
        System.out.println("Срочность: " + this.urgent);
    }

}
