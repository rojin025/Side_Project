package Side_Project;

public class Car {

    //Default values to these attribute;
    private String model = "Corolla";
    private String make = "Toyota";
    private String color = "Gray";
    private int door = 4;
    private boolean isConvertible = false;

    //Getters to retrieves the values from private class and Setters to sets the values of a private field.
    //Purpose to control and protect access to private field.
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoor() {
        return door;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setDoor(int door){
        this.door = door;
    }

    public void setConvertible(boolean isConvertible){
        this.isConvertible = isConvertible;
    }
    public void describeCar (){
        //Templates - so we can use them.
        System.out.println(door + " - Door\t" +
                        color + " " +
                        make + " " +
                        model + " " +
                        (isConvertible ? "Convertible" : "Not Convertible")
        );
    }


}
