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

public class TaskTwo {
    public static void StartTwo() {
        // Создаем объекты с использованием конструкторов
        Product product1 = new Product(); //конструктор без параметров
        Product product2 = new Product(1234, LocalDate.of(2024, 2, 25), 10,
                "Shirt", "Cotton", 50.0, "simple", true); //конструктор общего вида

        // Устанавливаем значения полей через сеттеры
        product1.setReceipt_number(5678);
        product1.setDate_of_receipt_of_the_order(LocalDate.of(2024, 2, 20));
        product1.setDue_date(15);
        product1.setProduct_name("Dress");
        product1.setFabric("Silk");
        product1.setCost_of_the_product(100.0);
        product1.setCategory_of_complexity("complex");
        product1.setUrgency(false);

        // Выводим значения полей объектов на экран
        System.out.println("Product 1:");
        System.out.println("Receipt Number: " + product1.getReceipt_number());
        System.out.println("Date of Receipt: " + product1.getDate_of_receipt_of_the_order());
        System.out.println("Due Date: " + product1.getDue_date());
        System.out.println("Product Name: " + product1.getProduct_name());
        System.out.println("Fabric: " + product1.getFabric());
        System.out.println("Cost of the Product: " + product1.getCost_of_the_product());
        System.out.println("Category of Complexity: " + product1.getCategory_of_complexity());
        System.out.println("Urgency: " + product1.isUrgency());
        System.out.println("Cost of Tailoring: " + product1.getCost_of_tailoring());
        System.out.println("Date of Completion: " + product1.getDate_of_completion_of_the_order());

        System.out.println();

        System.out.println("Product 2:");
        System.out.println("Receipt Number: " + product2.getReceipt_number());
        System.out.println("Date of Receipt: " + product2.getDate_of_receipt_of_the_order());
        System.out.println("Due Date: " + product2.getDue_date());
        System.out.println("Product Name: " + product2.getProduct_name());
        System.out.println("Fabric: " + product2.getFabric());
        System.out.println("Cost of the Product: " + product2.getCost_of_the_product());
        System.out.println("Category of Complexity: " + product2.getCategory_of_complexity());
        System.out.println("Urgency: " + product2.isUrgency());
        System.out.println("Cost of Tailoring: " + product2.getCost_of_tailoring());
        System.out.println("Date of Completion: " + product2.getDate_of_completion_of_the_order());
    }
}

