package Side_Project.Challenge_Exs.Challengees_1.Challengees_1_with_constructor;

public class Account {
    private int accountNumber;
    private int accountBalance;
    private String  name;
    private String  email;
    private int  phoneNumber;

    //Default to constructor
    public Account(){
        System.out.println("This is Default Constructor!!");
    }

    public Account(int accountNumber, int accountBalance,String name, String customerEmail,int customerPhoneNumber){
        System.out.println("Account Constructor with 5 parameters called.");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.name = name;
        email = customerEmail;//Parameter name is different then Instance Variable so no use of this.
        phoneNumber = customerPhoneNumber ;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNUmber(){
        return phoneNumber;
    }

    public String getEmail(){return email;}

    public void setAccountNumber(int accountNumber){this.accountNumber = accountNumber;}
    public void setAccountBalance(int accountBalance){this.accountBalance = accountBalance;}
    public void setName(String name){this.name = name;}
    public void setPhoneNumber(int phoneNumber){this.phoneNumber = phoneNumber;}
    public void setEmail(String email){this.email = email;}

    public void depositFund(int deposit){
        if (deposit>0)
            accountBalance+=deposit;
    }

    public void withdrawFund(int withdraw){
        if (accountBalance-withdraw > 0) {
            accountBalance -= withdraw;
            System.out.println("Withdraw - " + withdraw + " Remaining Balance = " + accountBalance);
        } else {
            System.out.println("Insuficent fund, Your Account Balance is "+ accountBalance);
        }
    }
}
