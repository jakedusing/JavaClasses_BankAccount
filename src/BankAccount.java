public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void despositFunds(double funds) {
        accountBalance += funds;
        System.out.println("Successfully deposited " + funds + ", New account balance: " + accountBalance);
    }

    public void withdrawnFunds(double funds) {
        if (funds > accountBalance) {
            System.out.println("Amount attempting to withdraw is higher than available balance");
            return;
        } else {
            accountBalance -= funds;
            System.out.println("Successfully withdrew: " + funds + ", New account balance: " + accountBalance);
        }
    }
}
