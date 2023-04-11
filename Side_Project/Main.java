package Side_Project;

public class Main {
    public static void main(String[] args) {

         Car car = new Car();//Car is class , car is object variable.

         //Cannot change make and model value in main because of "private" class type.
//         car.make ="BMW";
//         car.model = "M3";

          //We can do this : private access class.
//        System.out.println("Make = " + car.make);

        //Printing Default Field Variables.
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        System.out.println("Color = " + car.getColor());
        System.out.println("Convertible = " + car.isConvertible());
        System.out.println("Door = " + car.getDoor());

        //Using Setter methord to set values to attributes
        car.setMake("BMW");
        car.setModel("M3");
        car.setColor("Red");
        car.setConvertible(true);
        car.setDoor(4);

        //Printing New Field Variables.
        System.out.println("Printing New Field Variables.");
        System.out.println("Make = " + car.getMake());
        System.out.println("Model = " + car.getModel());
        System.out.println("Color = " + car.getColor());
        System.out.println("Convertible = " + car.isConvertible());
        System.out.println("Door = " + car.getDoor());


        // Printing all the properties of car.
         car.describeCar();
    }
}
