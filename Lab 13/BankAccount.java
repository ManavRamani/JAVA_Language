import java.util.Scanner;
class Bank_Account_Info {
    private int accountNo;
    private String userName;
    private String email;
    private String accountType;
    private double accountBalance=5000;

    public Bank_Account_Info(int accountNo, String userName, String email, String accountType) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
    }

    // Desiplay Detail : 
    public void displayAccountDetails() {
        System.out.println("\n\tAccount Number : " + accountNo);
        System.out.println("\tUser Name : " + userName);
        System.out.println("\tEmail : " + email);
        System.out.println("\tAccount Type : " + accountType);
        System.out.println("\tAccount Balance : " + accountBalance + "\n");
    }

    // Desopite Amount 
    public void DepositeAmount(double amount) {
        accountBalance+=amount;
        System.out.println("\n\tAccount Balance : " + accountBalance + "\n");
    }

    // Withdraw Amount 
    public void WithdrawAmount(double amount) {
        double temp = accountBalance-amount;
        try{
            if(temp>5000){
                accountBalance=temp;
            }else{
                throw new Exception();
            }
        }
        catch(Exception e){
            System.out.println("\n\tYou can't Withdraw.!!!!");
        }finally{
            System.out.println("\n\tAccount Balance : " + accountBalance+"\n");
            System.out.println("\tThanks For Visit........................... ");
        }        
    }

    public void TotalAmount() {
        System.out.println("\n\tAccount Total Balance is : " + accountBalance+"\n");
    }
}

class BankAccount {
    public static void main(String[] args) 
    {
        Scanner done = new Scanner(System.in);
        double amt;
        boolean isTrue = true;
        
        System.out.print("Enter Account Number : ");
        int acc_id=done.nextInt();
        
        System.out.print("Enter Your Name : \n");
        String acc_name=done.next();

        System.out.print("Enter Your Email : \n");
        String email=done.next();
        
        System.out.print("Enter Account type : \n");
        String acc_type=done.next();


        Bank_Account_Info account = new Bank_Account_Info(acc_id, acc_name, email,acc_type);
        
        account.displayAccountDetails();
        
        while(isTrue)
        {
            System.out.print("\t1 : View Account Info, \n\t2 : Deposite Amount,\n\t3 : Withdraw Amount,\n\t4 : Total Amount,\n\t5 : Exit.\n\tEnter Your Option : ");
            int op = done.nextInt();
            switch (op) 
            {
                case 1:
                    account.displayAccountDetails();
                    break;
                case 2:
                    System.out.println("\tEnter Deposite Amount : ");
                    amt = done.nextDouble();
                    if(amt>0){
                        account.DepositeAmount(amt);
                    }
                    else{
                        System.out.println("\tPlease Enter Valid Amount!!!!!!");
                    }
                    break;
                case 3:
                    System.out.print("\tEnter Withdraw Amount : ");
                    amt = done.nextDouble();
                    account.WithdrawAmount(amt);
                    break;
                case 4:
                    account.TotalAmount();
                    break;
                case 5:
                    isTrue=false;
                    break;
                default:
                    System.out.println("\tPlease Enter Valid Option.!!!!!!");
            }
        }
    }
}