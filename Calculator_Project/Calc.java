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
String userStringEquation = getEquation();

formatEquation(userStringEquation);
    
   
} 

public static String getEquation(){

    System.out.println("Please enter your equation with two numbers");
    String equation = userInput.nextLine();
    
    return equation;
}



public static void formatEquation(String equation){
if(equation.contains("+")){
numbers = equation.split("\\+");
operator = "+";
int answer = Integer.valueOf(numbers[0]) + Integer.valueOf(numbers[1]);
System.out.println(answer);
}

else if(equation.contains("-")){
numbers = equation.split("-");
operator = "-";
int answer = Integer.valueOf(numbers[0]) - Integer.valueOf(numbers[1]);
System.out.println(answer);
}

else if(equation.contains("*")){
numbers = equation.split("\\*");
operator = "*";
int answer = Integer.valueOf(numbers[0]) * Integer.valueOf(numbers[1]);
System.out.println(answer);
}

else if(equation.contains("/")){
numbers = equation.split("/");
operator = "/";
int answer = Integer.valueOf(numbers[0]) / Integer.valueOf(numbers[1]);
System.out.println(answer);
}

else{
    System.out.println("Invalid operator");
}

}

    


}