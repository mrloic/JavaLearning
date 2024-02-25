package net.mrloic.learn.tasks.four;

import net.mrloic.learn.tasks.three.Order;

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
    public String get_complexity() {
        return complexity;
    }

    public void set_complexity(String complexity) {
        this.complexity = complexity;
    }
}
