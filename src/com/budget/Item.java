package budget;

public class Item {
    private String label;
    private double amount;

    public Item(String _label, double _amount) {
        this.label = _label;
        this.amount = _amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public String toString() {
        return String.format("%s, $.2f", label, amount);
    }
}
