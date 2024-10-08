import java.time.LocalDate;

public class Expense {
    private String description;
    private double amount;
    private LocalDate date;

    public Expense(String description, double amount, LocalDate date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return String.format("%s - $%.2f (%s)", description, amount, date.toString());
    }
}
