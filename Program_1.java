import java.util.*;
class Program_1
{

    public static void main(String[] args) {

    	double a,b,result; // Declaring a variables 
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number value:");
        a = s.nextDouble(); // taking values from user...
        System.out.print("Enter second number value:");
        b = s.nextDouble();

        System.out.print("Enter any operator (+, -, *, /): ");
        String opr = s.next();// taking operation

        switch(opr) // using switch case to create Calculator
        {
            case "+":
            	result = a + b;
                break;    // condition for addition

            case "-":
            	result =a - b; 
                break; // condition for subtraction

            case "*":
            	result = a * b;
                break; // condition for Multiplication

            case "/":
            	result = a / b;
                break; // condition for Division

                default: 
                System.out.printf("You have entered wrong operator or value");
                return;
        }

        System.out.println(a+" "+opr+" "+b+": "+result);
    }
}
