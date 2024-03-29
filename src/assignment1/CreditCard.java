package assignment1;

public class CreditCard {
    private String customer; // name of the customer (e.g., ”John Bowman”)
    private String bank; // name of the bank (e.g., ”California Savings”)
    private String account; // account identifier (e.g., ”5391 0375 9387 5309”)
    private int limit; // credit limit (measured in dollars)
    protected double balance; // current balance (measured in dollars)

    // Constructors
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }

    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0); // use a balance of zero as default
    }

    // Accessor methods
    public String getCustomer() { return customer; }
    public String getBank() { return bank; }
    public String getAccount() { return account; }
    public int getLimit() { return limit; }
    public double getBalance() { return balance; }

    // Update methods
    public boolean charge(double price) {
        if (price + balance > limit)
            return false; // refuse the charge
        balance += price; // update the balance
        return true; // announce the good news
    }

    public void makePayment(double amount) {
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Customer = " + customer +
                "\nBank = " + bank +
                "\nAccount = " + account +
                "\nBalance = " + balance +
                "\nLimit = " + limit;
    }

    // Main method
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("John Bowman", "California Federal", "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("John Bowman", "California Finance", "5391 0375 9387 5309", 2500, 300);

        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3 * val);
            wallet[1].charge(2 * val);
            wallet[2].charge(val);
        }

        for (CreditCard card : wallet) {
            System.out.println(card.toString()); // using toString method
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = " + card.getBalance());
            }
        }
    }
}
