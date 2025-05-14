class TransactionHistory {
  
    private String transactionID;
    private String senderName;
    private String receiverName;
    private String status;
    private String date; 

    public TransactionHistory(String transactionID, String senderName, String receiverName, String status, String date) {
        this.transactionID = transactionID;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.status = status;
        this.date = date;
    }

  
    public void displayTransactionDetails() {
        System.out.println("Transaction ID: " + transactionID);
        System.out.println("Sender Name: " + senderName);
        System.out.println("Receiver Name: " + receiverName);
        System.out.println("Status: " + status);
        System.out.println("Date: " + date);
    }

 
    public static void main(String[] args) {
       
        TransactionHistory transaction = new TransactionHistory("TXN12345", "Alice Johnson", "Bob Smith", "Successful", "14-05-2025");
        transaction.displayTransactionDetails();
    }
}
