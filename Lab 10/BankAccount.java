class Bank_Account_Info {
    private int accountNo;
    private String userName;
    private String email;
    private String accountType;
    private double accountBalance;

    public Bank_Account_Info(int accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void displayAccountDetails() {
        System.out.println("\n\tAccount Number : " + accountNo);
        System.out.println("\tUser Name : " + userName);
        System.out.println("\tEmail : " + email);
        System.out.println("\tAccount Type : " + accountType);
        System.out.println("\tAccount Balance : " + accountBalance);
    }
}

class BankAccount {
    public static void main(String[] args) {
        Bank_Account_Info account = new Bank_Account_Info(143, "Manav Ramnai", "manavpatel13402003@gmail.com",
                "Current", 999936.36);
        account.displayAccountDetails();
    }
}