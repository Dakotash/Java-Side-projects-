package Calculator_Project;
import java.util.Scanner;

public class Calc 
{
    /**
     * 
     */
   static Scanner userInput = new Scanner(System.in);
   static String operator;
   static String[] numbers;
   

public static void main(String[] args) {

    
   
} 

public static String getEquation(){

    System.out.println("Please enter your equation with two numbers");
    String equation = userInput.nextLine();
    
    return equation;
}



public static void formatEquation(String equation){
if(equation.contains("+")){
numbers = equation.split("+");
operator = "+";
}
else if(equation.contains("-")){
numbers = equation.split("-");
operator = "-";
}
else if(equation.contains("*")){
numbers = equation.split("*");
operator = "*";
}
else if(equation.contains("/")){
numbers = equation.split("/");
operator = "/";
}
else{
    System.out.println("Invalid operator");
}

}

    


}