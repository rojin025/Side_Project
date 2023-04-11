package Side_Project.Challenge_Exs.Challengees_1.Challengees_1_with_constructor_chaining;

public class Main {
    public static void main(String[] args) {


        //Default Constructor using Channing.
//        Account defaultAcocunt = new Account();
//        System.out.println("Default's Account Number :- "+ defaultAcocunt.getAccountNumber());
//

        //Using Construciton Channing to Pass Construction with 3 argument.

        Account timsAccount = new Account("Tim Cooks","Timcooks@email.com",415123123);
        System.out.println("Tim Cooks Default Account Number is - "+ timsAccount.getAccountNumber());
        System.out.println("Tim Cooks Default Account Balance is - "+ timsAccount.getAccountBalance());

        //Using Construciton Channing to Pass Construction with 5 argument.
        //Account ramsAccount = new Account(123,1000,"Ram@Email.com","Ram Shree",123456789);
//        System.out.println("Ram's Account Number :- "+ ramsAccount.getAccountNumber());
//        System.out.println("Ram's Account Balance :- "+ ramsAccount.getAccountBalance());

//        //Depost methods
//        ramsAccount.depositFund(10000);
//        System.out.println("Ram's Account Balance updated to "+ ramsAccount.getAccountBalance());
//
//        //WithDraw Methods
//        ramsAccount.withdrawFund(4000);
//        ramsAccount.withdrawFund(7001);
    }
}
