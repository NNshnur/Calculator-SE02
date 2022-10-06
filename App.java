import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {

    static final Scanner inputScanner = new Scanner(System.in);


    private static String getString(String prompt) {
    System.out.println(prompt);
        return inputScanner.nextLine();
    }
    
    private static double getDouble(String prompt) {
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }

    private static void showMenu() {
     
        List <String> menu = new ArrayList<>();
        menu.add (" addtion");
        menu.add (" subtraction");
        menu.add (" multiplication");
        menu.add (" division");
        menu.add (" exit");

        for (String x : menu) {
            System.out.println(x);
        }

    
        }

    public static void main(String [] args) {
        System.out.println("What would you  like to do?");
        Calculator calculator = new Calculator();

        // String anw = App.getString("What would you  like to do?");
        
        App.showMenu();

        String userInput =  inputScanner.nextLine();

        if(userInput.equals("addition")) {
            double num1 = getDouble("Enter your first number: ");
            double  num2 = getDouble("Enter your second number: ");
            System.out.println("Result : " + calculator.add(num1, num2));
        } if (userInput.equals("subtraction")) {
            double num1 = getDouble("Enter your first number: ");
            double  num2 = getDouble("Enter your second number: ");
            System.out.println("Result : " + calculator.subtract(num1, num2));
        } if (userInput.equals("multiplication")) {
            double num1 = getDouble("Enter your first number: ");
            double  num2 = getDouble("Enter your second number: ");
            System.out.println("Result : " + calculator.multiply(num1, num2));
        } if (userInput.equals("division")) {
            double num1 = getDouble("Enter your first number: ");
            double  num2 = getDouble("Enter your second number: ");
        
            if (num2 != 0) {
                System.out.println("Result : " + calculator.divide(num1, num2));
                
            } else {
                System.out.println("You can't devide by zero");
            }
            
    } if (userInput.equals("exit")) {
        System.out.println("Goodbye");
        return;

    }
    String anw2 = App.getString("Would you like to do another calculations? y/n");
    
    String userAnw =  inputScanner.nextLine();
    if(userAnw.equals("y")){
        App.main(args);
    } else{
        System.out.println("Goodbye");
    }
    }
    
    }



