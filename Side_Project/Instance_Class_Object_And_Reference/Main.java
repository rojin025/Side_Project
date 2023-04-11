package Side_Project.Instance_Class_Object_And_Reference;

public class Main {
    public static void main(String[] args) {
        /**
         * Here "myHouse" is a Variable with Reference Pointing to Object "House" with color Red
         */
        //House myHouse = new House("Red");//
        House house = new House();
        System.out.println("\nMy Default House : "+ house);//Prints the Reference memory location
        System.out.println("\nMy Default House Color : "+ house.getColor());//Default Color

        /**
         * Here "myHouse" is a Variable with Reference Pointing to Object "House" with color Red
         */
        House myHouse = new House("Red");//??

        House ramHouse = myHouse;//Copies Rojin's House Color Idea. Shamelessly.
        House sureshHouse = new House("Pink");//What???? Pink Seriously???

        System.out.println("\nOutPut :");
        System.out.println(myHouse);//Print's Memory Location.
        System.out.println("My House Color is : " + myHouse.getColor());//Calls getter methord in House Class and Print out House Color.
        System.out.println("Ram copying Rojin's Address Location Reference: " + ramHouse.getColor());

        System.out.println("Suresh House Color is : " + sureshHouse.getColor());// Calls a getter Function and prints out "Pink" Color.

        sureshHouse.setColor("Blue");//Using setter Function to set Color of Variable "Suresh House" to "Blue".
        System.out.println("\nSuresh House Updated Color to " + sureshHouse.getColor() +"." );//Getter to print Blue.



    }
}
