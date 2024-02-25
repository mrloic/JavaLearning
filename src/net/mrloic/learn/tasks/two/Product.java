package net.mrloic.learn.tasks.two;

/*
Описать заданный класс в отдельном модуле. Все поля класса – закрытые.
Вычисляемые поля оказаны курсивом. Создать 2 конструктора для класса, конструктор без
параметров и конструктор общего вида. Обеспечить доступ к полям через свойства. В
свойствах выполнить проверку на корректность вводимых данных.
В консольном приложении ввести данные в объекты различными способами и
вывести значение введенных полей на экран.

Вариант № 9
Класс изделие в ателье мод. Поля: номер квитанции, дата получения заказа, срок
выполнения(в днях), название изделия, ткань, стоимость изделия, категория сложности, срочность,
стоимость пошива (с учетом сложности и срочности), дата выполнения заказа (при
срочном заказе срок уменьшается в 2 раза).
*/

import java.time.LocalDate;

public class Product
{
    private int receipt_number; //номер квитанции
    private LocalDate date_of_receipt_of_the_order; //дата получения заказа
    private int due_date; //срок выполнения(в днях)
    private String product_name; //название изделия
    private String fabric; //ткань
    private double cost_of_the_product; //стоимость изделия
    private String category_of_complexity; //категория сложности
    private boolean urgency; //срочность

    // Конструктор без параметров
    public Product()
    {
        this.receipt_number = 0;
        this.date_of_receipt_of_the_order = LocalDate.now();
        this.due_date = 0;
        this.product_name = "";
        this.fabric = "";
        this.cost_of_the_product = 0.0;
        this.category_of_complexity = "";
        this.urgency = false;
    }

    // Конструктор с параметрами
    public Product(int receipt_number, LocalDate date_of_receipt_of_the_order, int due_date,
                   String product_name, String fabric, double cost_of_the_product,
                   String category_of_complexity, boolean urgency)
    {
        this.receipt_number = receipt_number;
        this.date_of_receipt_of_the_order = date_of_receipt_of_the_order;
        this.due_date = due_date;
        this.product_name = product_name;
        this.fabric = fabric;
        this.cost_of_the_product = cost_of_the_product;
        this.category_of_complexity = category_of_complexity;
        this.urgency = urgency;
    }

    // Геттеры и сеттеры для всех полей
    public int get_receipt_number()
    {
        return receipt_number;
    }

    public void set_receipt_number(int receipt_number)
    {
        this.receipt_number = receipt_number;
    }

    public LocalDate get_date_of_receipt_of_the_order()
    {
        return date_of_receipt_of_the_order;
    }

    public void set_date_of_receipt_of_the_order(LocalDate date_of_receipt_of_the_order)
    {
        this.date_of_receipt_of_the_order = date_of_receipt_of_the_order;
    }

    public int get_due_date()
    {
        return due_date;
    }

    public void set_due_date(int due_date)
    {
        this.due_date = due_date;
    }

    public String get_product_name()
    {
        return product_name;
    }

    public void set_product_name(String product_name)
    {
        this.product_name = product_name;
    }

    public String get_fabric()
    {
        return fabric;
    }

    public void set_fabric(String fabric)
    {
        this.fabric = fabric;
    }

    public double get_cost_of_the_product()
    {
        return cost_of_the_product;
    }

    public void set_cost_of_the_product(double cost_of_the_product)
    {
        this.cost_of_the_product = cost_of_the_product;
    }

    public String get_category_of_complexity()
    {
        return category_of_complexity;
    }

    public void set_category_of_complexity(String category_of_complexity)
    {
        this.category_of_complexity = category_of_complexity;
    }

    public boolean is_urgency()
    {
        return urgency;
    }

    public void set_urgency(boolean urgency)
    {
        this.urgency = urgency;
    }

    // Вычисляемое поле: стоимость пошива
    public double get_cost_of_tailoring()
    {
        double cost = cost_of_the_product;

        // Учитываем сложность
        if (category_of_complexity.equals("complex"))
        {
            cost *= 1.5; // Например, увеличиваем на 50%
        }

        // Учитываем срочность
        if (urgency)
        {
            cost *= 1.2; // Например, увеличиваем на 20%
        }

        return cost;
    }

    // Вычисляемое поле: дата завершения заказа
    public LocalDate get_date_of_completion_of_the_order()
    {
        LocalDate completionDate = date_of_receipt_of_the_order.plusDays(due_date);

        // Если заказ срочный, уменьшаем срок вдвое
        if (urgency)
        {
            completionDate = completionDate.minusDays(due_date / 2);
        }

        return completionDate;
    }
}