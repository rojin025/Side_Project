package Side_Project.Challenge_Exs.Challengees_2_Sum_Calculator;

public class SimpleCalculator {
    //The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
    private double firstNumber, secondNumber;

    //GetAddition Method
    public double getAdditionResult(){return firstNumber+secondNumber;}
    public double getSubtractionResult(){return firstNumber-secondNumber;}
    public double getMultiplicationResult(){return firstNumber*secondNumber;}
    public double getDivisionResult(){
        if(secondNumber == 0)
            return 0.00;
        else
            return (firstNumber/secondNumber);
    }

    //Getter Method
    public double getFirstNumber(){return firstNumber;}
    public double getSecondNumber(){return secondNumber;}

    //Setter Method
    public void setFirstNumber(double firstNumber){this.firstNumber = firstNumber;}
    public void setSecondNumber(double secondNumber){this.secondNumber = secondNumber;}

}
