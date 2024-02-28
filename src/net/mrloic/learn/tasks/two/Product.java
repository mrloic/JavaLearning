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

public class Product
{
    private int receiptNumber; //номер квитанции
    private LocalDate dateOfReceiptOfTheOrder; //дата получения заказа
    private int dueDate; //срок выполнения(в днях)
    private String productName; //название изделия
    private String fabric; //ткань
    private double costOfTheProduct; //стоимость изделия
    private String categoryOfComplexity; //категория сложности
    private boolean urgency; //срочность

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    // Конструктор без параметров
    public Product()
    {
        this.receiptNumber = 0;
        this.dateOfReceiptOfTheOrder = LocalDate.now();
        this.dueDate = 0;
        this.productName = "";
        this.fabric = "";
        this.costOfTheProduct = 0.0;
        this.categoryOfComplexity = "";
        this.urgency = false;
    }

    // Конструктор с параметрами
    public Product(int receiptNumber, LocalDate dateOfReceiptOfTheOrder, int dueDate,
                   String productName, String fabric, double costOfTheProduct,
                   String categoryOfComplexity, boolean urgency)
    {
        this.receiptNumber = receiptNumber;
        this.dateOfReceiptOfTheOrder = dateOfReceiptOfTheOrder;
        this.dueDate = dueDate;
        this.productName = productName;
        this.fabric = fabric;
        this.costOfTheProduct = costOfTheProduct;
        this.categoryOfComplexity = categoryOfComplexity;
        this.urgency = urgency;
    }

    // Геттеры и сеттеры для всех полей
    public int getReceiptNumber()
    {
        return receiptNumber;
    }

    public void setReceiptNumber(int receiptNumber)
    {
        this.receiptNumber = receiptNumber;
    }

    public LocalDate getDateOfReceiptOfTheOrder()
    {
        return dateOfReceiptOfTheOrder;
    }

    public void setDateOfReceiptOfTheOrder(LocalDate dateOfReceiptOfTheOrder)
    {
        this.dateOfReceiptOfTheOrder = dateOfReceiptOfTheOrder;
    }

    public int getDueDate()
    {
        return dueDate;
    }

    public void setDueDate(int dueDate)
    {
        this.dueDate = dueDate;
    }

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getFabric()
    {
        return fabric;
    }

    public void setFabric(String fabric)
    {
        this.fabric = fabric;
    }

    public double getCostOfTheProduct()
    {
        return costOfTheProduct;
    }

    public void setCostOfTheProduct(double costOfTheProduct)
    {
        this.costOfTheProduct = costOfTheProduct;
    }

    public String getCategoryOfComplexity()
    {
        return categoryOfComplexity;
    }

    public void setCategoryOfComplexity(String categoryOfComplexity)
    {
        this.categoryOfComplexity = categoryOfComplexity;
    }

    public boolean isUrgency()
    {
        return urgency;
    }

    public void setUrgency(boolean urgency)
    {
        this.urgency = urgency;
    }

    // Вычисляемое поле: стоимость пошива
    public double getCostOfTailoring()
    {
        double cost = costOfTheProduct;

        // Учитываем сложность
        if (categoryOfComplexity.equals("complex"))
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
    public LocalDate getDateOfCompletionOfTheOrder()
    {
        LocalDate completionDate = dateOfReceiptOfTheOrder.plusDays(dueDate);

        // Если заказ срочный, уменьшаем срок вдвое
        if (urgency)
        {
            completionDate = completionDate.minusDays(dueDate / 2);
        }

        return completionDate;
    }

    public void printInfo() {
        System.out.println("Номер квитанции: " + this.getReceiptNumber());
        System.out.println("Дата получения: " + this.getDateOfReceiptOfTheOrder().format(formatter));
        System.out.println("Срок выполнения: " + this.getDueDate());
        System.out.println("Название изделия: " + this.getProductName());
        System.out.println("Ткань: " + this.getFabric());
        System.out.println("Стоимость продукта: " + this.getCostOfTheProduct());
        System.out.println("Категория сложности: " + this.getCategoryOfComplexity());
        System.out.println("Срочность: " + this.isUrgency());
        System.out.println("Стоимость пошива: " + this.getCostOfTailoring());
        System.out.println("Дата завершения: " + this.getDateOfCompletionOfTheOrder().format(formatter));
    }
}