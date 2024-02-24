package net.mrloic.learn.tasks.two;

/*
Описать заданный класс в отдельном модуле. Все поля класса – закрытые.
Вычисляемые поля оказаны курсивом. Создать 2 конструктора для класса, конструктор без
параметров и конструктор общего вида. Обеспечить доступ к полям через свойства. В
свойствах выполнить проверку на корректность вводимых данных.
В консольном приложении ввести данные в объекты различными способами и
вывести значение введенных полей на экран.
*/

/*
Вариант № 9
Класс изделие в ателье мод. Поля: номер квитанции, дата получения заказа, срок
выполнения, название изделия, ткань, стоимость изделия, категория сложности, срочность,
стоимость пошива (с учетом сложности и срочности), дата выполнения заказа (при
срочном заказе срок уменьшается в 2 раза).
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TaskTwo {
    public static void StartTwo() {

        // Создаем объекты с использованием конструкторов
        Product product1 = new Product(); //конструктор без параметров
        Product product2 = new Product(1234, LocalDate.of(2024, 2, 25), 10,
                "Рубашка", "Хлопок", 50.0, "simple", true); //конструктор общего вида

        // Устанавливаем значения полей через сеттеры
        product1.setReceipt_number(5678);
        product1.setDate_of_receipt_of_the_order(LocalDate.of(2024, 2, 20));
        product1.setDue_date(15);
        product1.setProduct_name("Платье");
        product1.setFabric("Шелк");
        product1.setCost_of_the_product(100.0);
        product1.setCategory_of_complexity("complex");
        product1.setUrgency(false);

        // Выводим значения полей объектов на экран
        System.out.println("Изделие 1:");
        System.out.println("Номер квитанции: " + product1.getReceipt_number());
        System.out.println("Дата получения: " + product1.getDate_of_receipt_of_the_order().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Срок выполнения: " + product1.getDue_date());
        System.out.println("Название изделия: " + product1.getProduct_name());
        System.out.println("Ткань: " + product1.getFabric());
        System.out.println("Стоимость продукта: " + product1.getCost_of_the_product());
        System.out.println("Категория сложности: " + product1.getCategory_of_complexity());
        System.out.println("Срочность: " + product1.isUrgency());
        System.out.println("Стоимость пошива: " + product1.getCost_of_tailoring());
        System.out.println("Дата завершения: " + product1.getDate_of_completion_of_the_order().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

        System.out.println();

        System.out.println("Изделие 2:");
        System.out.println("Номер квитанции: " + product2.getReceipt_number());
        System.out.println("Дата получения: " + product2.getDate_of_receipt_of_the_order().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Срок выполнения: " + product2.getDue_date());
        System.out.println("Название изделия: " + product2.getProduct_name());
        System.out.println("Ткань: " + product2.getFabric());
        System.out.println("Стоимость продукта: " + product2.getCost_of_the_product());
        System.out.println("Категория сложности: " + product2.getCategory_of_complexity());
        System.out.println("Срочность: " + product2.isUrgency());
        System.out.println("Стоимость пошива: " + product2.getCost_of_tailoring());
        System.out.println("Дата завершения: " + product2.getDate_of_completion_of_the_order().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}

