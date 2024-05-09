package net.mrloic.learn.tasks.three;

/*
Вариант 9
//Разработать модуль для описания системы Ателье мод. Описать следующие классы: Заказ
//(фамилия клиента, вид изделия, дата заказа, срочность), легка одежда (сложность) и верхняя
//одежда (подкладка, количество примерок). Создать консольное приложение для вывода данных
//объектов.
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

    public void printInfo() {
        System.out.println("Фамилия клиента: " + this.getClientSurname());
        System.out.println("Вид изделия: " + this.getItemType());
        System.out.println("Дата заказа: " + this.getOrderDate().format(formatter));
        System.out.println("Срочность: " + this.isUrgent());
    }

}
