package Side_Project.Instance_Class_Object_And_Reference;

public class House {

    private String color;//Instance Variable

    //Default Constuctor
    public House (){
        color = "Default Color";
    }


    //Creating Instrutor to Assign Values to House Object.
    public House (String color){
        this.color = color;
    }

    //Getter
    public String getColor(){
        return color;
    }

    //Setter
    public void setColor(String color){
        this.color = color;
    }



}
