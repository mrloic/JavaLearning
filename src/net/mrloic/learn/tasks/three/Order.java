package net.mrloic.learn.tasks.three;

/*
Вариант 9
Разработать модуль для описания системы Ателье мод. Описать следующие классы: Заказ
(фамилия клиента, вид изделия, дата заказа, срочность), легка одежда (сложность) и верхняя
одежда (подкладка, количество примерок). Создать консольное приложение для вывода данных
объектов.
*/

import java.time.LocalDate;
public class Order
{
    private String client_surname; //фамилия клиента
    private String item_type; //вид изделия
    private LocalDate order_date; //дата заказа
    private boolean urgent; //срочность

    public Order(String client_surname, String item_type, LocalDate order_date, boolean urgent)
    {
        this.client_surname = client_surname;
        this.item_type = item_type;
        this.order_date = order_date;
        this.urgent = urgent;
    }

    // Геттеры и сеттеры для всех полей
    public String get_client_surname()
    {
        return client_surname;
    }

    public void set_client_surname(String client_surname)
    {
        this.client_surname = client_surname;
    }

    public String get_item_type()
    {
        return item_type;
    }

    public void set_item_type(String item_type)
    {
        this.item_type = item_type;
    }

    public LocalDate get_order_date()
    {
        return order_date;
    }

    public void set_order_date(LocalDate order_date)
    {
        this.order_date = order_date;
    }

    public boolean is_urgent()
    {
        return urgent;
    }
    public void set_urgent(boolean urgent)
    {
        this.urgent = urgent;
    }

}
