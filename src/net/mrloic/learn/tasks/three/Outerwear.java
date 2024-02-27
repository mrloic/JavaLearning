package net.mrloic.learn.tasks.three;

import java.time.LocalDate;

/*
Вариант 9
Разработать модуль для описания системы Ателье мод. Описать следующие классы: Заказ
(фамилия клиента, вид изделия, дата заказа, срочность), легка одежда (сложность) и верхняя
одежда (подкладка, количество примерок). Создать консольное приложение для вывода данных
объектов.
*/

public class Outerwear extends Order
{
    private String lining;
    private int fittingCount;

    public Outerwear(String clientSurname, String itemType, LocalDate orderDate, boolean urgent, String lining, int fittingCount) {
        super(clientSurname, itemType, orderDate, urgent);
        this.lining = lining;
        this.fittingCount = fittingCount;
    }

    // Getters and Setters
    public String getLining() {
        return lining;
    }

    public void setLining(String lining) {
        this.lining = lining;
    }

    public int getFittingCount() {
        return fittingCount;
    }

    public void setFittingCount(int fittingCount) {
        this.fittingCount = fittingCount;
    }

    public void printInfo() {
        System.out.println("Фамилия клиента: " + this.getClientSurname());
        System.out.println("Вид изделия: " + this.getItemType());
        System.out.println("Дата заказа: " + this.getOrderDate().format(formatter));
        System.out.println("Срочность: " + this.isUrgent());
        System.out.println("Подкладка: " + this.getLining());
        System.out.println("Количество примерок: " + this.getFittingCount());
    }

}
