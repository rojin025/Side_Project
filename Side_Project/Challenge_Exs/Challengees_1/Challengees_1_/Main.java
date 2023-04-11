package Side_Project.Challenge_Exs.Challengees_1.Challengees_1_;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        //Setting Fields values
        account.setAccountNumber(123);
        account.setAccountBalance(100);
        account.setEmail("Ram@emal.com");
        account.setName("Ram Shree");
        account.setPhoneNumber(123456789);

        //Depost methods
        account.depositFund(10000);
        System.out.println(account.getAccountBalance());

        //WithDraw Methods
        account.withdrawFund(4000);
        account.withdrawFund(6001);
    }
}
