package net.mrloic.learn.tasks.four;

import net.mrloic.learn.tasks.three.Order;

import java.time.LocalDate;


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
