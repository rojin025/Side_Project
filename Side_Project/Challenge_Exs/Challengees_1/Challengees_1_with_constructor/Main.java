package Side_Project.Challenge_Exs.Challengees_1.Challengees_1_with_constructor;

public class Main {
    public static void main(String[] args) {
        Account ramsAccount = new Account(123,1000,"Ram@Email.com","Ram Shree",123456789);

        System.out.println("Ram's Account Number :- "+ ramsAccount.getAccountNumber());
        System.out.println("Ram's Account Balance :- "+ ramsAccount.getAccountBalance());

        //Depost methods
        ramsAccount.depositFund(10000);
        System.out.println("Ram's Account Balance updated to "+ ramsAccount.getAccountBalance());

        //WithDraw Methods
        ramsAccount.withdrawFund(4000);
        ramsAccount.withdrawFund(7001);
    }
}
