public class Main {
    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount();
       // BankAccount bankAccount = new BankAccount(12345, 1000.00, "Jake D", "jake@gmail.com", 123456789);
      //  bankAccount.setCustomerName("Jake D");
      //  bankAccount.setEmail("jake@gmail.com");
        System.out.println(bankAccount.getCustomerName());
      //  bankAccount.setAccountBalance(5000.98);
        System.out.println(bankAccount.getAccountBalance());
        bankAccount.withdrawnFunds(0.98);
        bankAccount.despositFunds(400.24);
        bankAccount.withdrawnFunds(5500);
        System.out.println(bankAccount.getAccountBalance());

        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullname = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName());

        Customer customer = new Customer("Jake", 1000, "jake@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        Customer secondCustomer = new Customer();
        System.out.println(secondCustomer.getName());
        System.out.println(secondCustomer.getCreditLimit());
    }
}