package Side_Project.Challenge_Exs.Challenge_3_ConstructorChanning;

public class Test {
    public static void main(String[] args) {
        Customer defaultCustomer = new Customer();
        Customer ram = new Customer("Ram Baral", "rambaral@yahoo.com");
        Customer bikram = new Customer("Bikram Gurung",100000,"bikramgurng@icloud.com");

        System.out.println("Default");
        System.out.println("Default Customer name : " + defaultCustomer.getName() + ", Credit limit is " + defaultCustomer.getCreditLimit() + " and Email Address is " + defaultCustomer.getEmail());

        System.out.println("Rams Accout with 2 parameters:");
        System.out.println("Ram Account info : " + ram.getName() + ", Credit limit is " + ram.getCreditLimit() + " and Email Address is " + ram.getEmail());

        System.out.println("Bikram Accout with all parameters:");
        System.out.println("Bikrams Account info : " + bikram.getName() + ", Credit limit is " + bikram.getCreditLimit() + " and Email Address is " + bikram.getEmail());
    }
}
