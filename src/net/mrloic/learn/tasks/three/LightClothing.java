package net.mrloic.learn.tasks.three;

import java.time.LocalDate;

/*
Вариант 9
Разработать модуль для описания системы Ателье мод. Описать следующие классы: Заказ
(фамилия клиента, вид изделия, дата заказа, срочность), легка одежда (сложность) и верхняя
одежда (подкладка, количество примерок). Создать консольное приложение для вывода данных
объектов.
*/

public class LightClothing extends Order
{
    private String complexity;

    public LightClothing(String clientSurname, String itemType, LocalDate orderDate, boolean urgent, String complexity) {
        super(clientSurname, itemType, orderDate, urgent);
        this.complexity = complexity;
    }

    // Getter and Setter for complexity
    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    public void printInfo() {
        System.out.println("Фамилия клиента: " + this.getClientSurname());
        System.out.println("Вид изделия: " + this.getItemType());
        System.out.println("Дата заказа: " + this.getOrderDate().format(formatter));
        System.out.println("Срочность: " + this.isUrgent());
        System.out.println("Сложность: " + this.getComplexity());
    }
}
