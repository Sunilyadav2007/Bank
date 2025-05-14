class BankCustomer {
  
    private String customerName;
    private String accountNumber;
    private int customerAge;


    public BankCustomer(String customerName, String accountNumber, int customerAge) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.customerAge = customerAge;
    }

    
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + customerName + " AccountNumber: " + accountNumber + "  Customer Age: " + customerAge);
      
    }

   
    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Sujan", "1234567890", 20);
        customer.displayCustomerDetails();
    }
}
