package Side_Project.Challenge_Exs.Challenge_3_ConstructorChanning;

public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    //Default
    public Customer(){
        this("Default Name","Default Email");
    }


    //With 2 parameter
    public Customer(String name,String email){
        this(name, 1000.00, email);
    }

    //with all
    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }




    //getter
    public String getName(){return name;}
    public Double getCreditLimit(){return creditLimit;}

    public String getEmail() {
        return email;
    }
}
