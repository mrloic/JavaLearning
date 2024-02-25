package net.mrloic.learn.tasks.two;

/*
Описать заданный класс в отдельном модуле. Все поля класса – закрытые.
Вычисляемые поля помечены кавычками. Создать 2 конструктора для класса, конструктор без
параметров и конструктор общего вида. Обеспечить доступ к полям через свойства. В
свойствах выполнить проверку на корректность вводимых данных.
В консольном приложении ввести данные в объекты различными способами и
вывести значение введенных полей на экран.

Вариант № 9
Класс изделие в ателье мод. Поля: номер квитанции, дата получения заказа, срок
выполнения(в днях), название изделия, ткань, стоимость изделия, категория сложности, срочность,
"стоимость пошива" (с учетом сложности и срочности), "дата выполнения заказа" (при
срочном заказе срок уменьшается в 2 раза).
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaskTwo
{
    public static void StartTwo()
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Создаем объекты с использованием конструкторов

        //конструктор без параметров
        Product product1 = new Product();

        //конструктор общего вида
        Product product2 = new Product(1234, LocalDate.of(2024, 2, 25), 10,
                                       "Рубашка", "Хлопок", 50.0,
                                       "simple", true);

        // Устанавливаем значения полей через сеттеры
        product1.set_receipt_number(5678);
        product1.set_date_of_receipt_of_the_order(LocalDate.of(2024, 2, 20));
        product1.set_due_date(15);
        product1.set_product_name("Платье");
        product1.set_fabric("Шелк");
        product1.set_cost_of_the_product(100.0);
        product1.set_category_of_complexity("complex");
        product1.set_urgency(false);

        // Выводим значения полей объектов на экран
        System.out.println("Изделие 1:");
        System.out.println("Номер квитанции: " + product1.get_receipt_number());
        System.out.println("Дата получения: " + product1.get_date_of_receipt_of_the_order().format(formatter));
        System.out.println("Срок выполнения: " + product1.get_due_date());
        System.out.println("Название изделия: " + product1.get_product_name());
        System.out.println("Ткань: " + product1.get_fabric());
        System.out.println("Стоимость продукта: " + product1.get_cost_of_the_product());
        System.out.println("Категория сложности: " + product1.get_category_of_complexity());
        System.out.println("Срочность: " + product1.is_urgency());
        System.out.println("Стоимость пошива: " + product1.get_cost_of_tailoring());
        System.out.println("Дата завершения: " + product1.get_date_of_completion_of_the_order().format(formatter));

        System.out.println();

        System.out.println("Изделие 2:");
        System.out.println("Номер квитанции: " + product2.get_receipt_number());
        System.out.println("Дата получения: " + product2.get_date_of_receipt_of_the_order().format(formatter));
        System.out.println("Срок выполнения: " + product2.get_due_date());
        System.out.println("Название изделия: " + product2.get_product_name());
        System.out.println("Ткань: " + product2.get_fabric());
        System.out.println("Стоимость продукта: " + product2.get_cost_of_the_product());
        System.out.println("Категория сложности: " + product2.get_category_of_complexity());
        System.out.println("Срочность: " + product2.is_urgency());
        System.out.println("Стоимость пошива: " + product2.get_cost_of_tailoring());
        System.out.println("Дата завершения: " + product2.get_date_of_completion_of_the_order().format(formatter));
    }
}

