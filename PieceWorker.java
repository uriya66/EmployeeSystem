
public class PieceWorker extends Employee {
    private int items;
    private final int itemPrice = 30;

    // constructor
    public PieceWorker(String firstname, String lastName, String socialSecurityNumber, DateOfBirth date, int items) {
        super(firstname, lastName, socialSecurityNumber, date);

        if (items < 0){
            throw new IllegalArgumentException("items must be >= 0");
        }
        this.items = items;
    }

    // return items
    public int getItems()
    {
        return this.items;
    }

    //calculate earnings by number of items double price per item 
    @Override
    public double earnings() {
        return getItems() * itemPrice + GetBirthdayBonus();
    }

    public String toString() {
        return String.format("piece employee: %s%n%s: %s%s; %s: %s",
                super.toString(), "created", getItems(), " items", "item's price", itemPrice);
    }
}
