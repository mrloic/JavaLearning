package net.mrloic.learn.tasks.three;

import java.time.LocalDate;


public class Outerwear extends Order
{
    private String lining;
    private int fitting_count;

    public Outerwear(String clientSurname, String itemType, LocalDate orderDate, boolean urgent, String lining, int fitting_count) {
        super(clientSurname, itemType, orderDate, urgent);
        this.lining = lining;
        this.fitting_count = fitting_count;
    }

    // Getters and Setters
    public String get_lining() {
        return lining;
    }

    public void set_lining(String lining) {
        this.lining = lining;
    }

    public int get_fitting_count() {
        return fitting_count;
    }

    public void set_fitting_count(int fitting_count) {
        this.fitting_count = fitting_count;
    }
}
