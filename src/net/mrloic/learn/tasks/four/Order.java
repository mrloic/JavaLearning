package net.mrloic.learn.tasks.four;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order
{
    private String client_surname; //фамилия клиента
    private String item_type; //вид изделия
    private LocalDate order_date; //дата заказа
    private boolean urgent; //срочность

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

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

    // Виртуальный метод поиска по фамилии клиента
    public boolean search_by_client_surname(String surname) {
        return this.client_surname.equals(surname);
    }

    // Виртуальный метод поиска по дате заказа
    public boolean search_by_order_date(LocalDate date) {
        return this.order_date.equals(date);
    }

    // Вывод информации по всем полям
    public void print_info()
    {
        System.out.println("Фамилия клиента: " + this.client_surname);
        System.out.println("Вид изделия: " + this.item_type);
        System.out.println("Дата заказа: " + this.order_date.format(formatter));
        System.out.println("Срочность: " + this.urgent);
    }

}
