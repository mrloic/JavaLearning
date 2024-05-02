package net.mrloic.learn.tasks.two;

// Описать заданный класс в отдельном модуле. Все поля класса – закрытые.
// Вычисляемые поля помечены кавычками. Создать 2 конструктора для класса, конструктор без
// параметров и конструктор общего вида. Обеспечить доступ к полям через свойства. В
// свойствах выполнить проверку на корректность вводимых данных.
// В консольном приложении ввести данные в объекты различными способами и
// вывести значение введенных полей на экран.
//
// Вариант № 9
// Класс изделие в ателье мод. Поля: номер квитанции, дата получения заказа, срок
// выполнения(в днях), название изделия, ткань, стоимость изделия, категория сложности, срочность,
// "стоимость пошива" (с учетом сложности и срочности), "дата выполнения заказа" (при
// срочном заказе срок уменьшается в 2 раза).


import java.time.LocalDate;

public class TaskTwo
{
    public static void StartTwo()
    {

        // Создаем объекты с использованием конструкторов

        //конструктор без параметров
        Product product1 = new Product();

        //конструктор общего вида
        Product product2 = new Product(1234, LocalDate.of(2024, 2, 25), 10,
                                       "Рубашка", "Хлопок", 50.0,
                                       "simple", true);

        // Устанавливаем значения полей через сеттеры
        product1.setReceiptNumber(5678);
        product1.setDateOfReceiptOfTheOrder(LocalDate.of(2024, 2, 20));
        product1.setDueDate(15);
        product1.setProductName("Платье");
        product1.setFabric("Шелк");
        product1.setCostOfTheProduct(100.0);
        product1.setCategoryOfComplexity("complex");
        product1.setUrgency(false);

        // Выводим значения полей объектов на экран
        System.out.println("Изделие 1:");
        product1.printInfo();

        System.out.println();

        System.out.println("Изделие 2:");
        product2.printInfo();
    }
}