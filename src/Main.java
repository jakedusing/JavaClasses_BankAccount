public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setCustomerName("Jake D");
        bankAccount.setEmail("jake@gmail.com");
        System.out.println(bankAccount.getCustomerName());
        bankAccount.setAccountBalance(5000.98);
        System.out.println(bankAccount.getAccountBalance());
        bankAccount.withdrawnFunds(0.98);
        bankAccount.despositFunds(400.24);
        bankAccount.withdrawnFunds(5500);
        System.out.println(bankAccount.getAccountBalance());
    }
}