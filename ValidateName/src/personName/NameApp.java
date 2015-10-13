package personName;
import java.util.Scanner;

import personName.ValidateName;


public class NameApp {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            String name = ValidateName.getString(
                sc, "Enter your Name: ");
            int age = ValidateName.getInt(
                sc, "Enter your Age:     ", 1, 100);
            double height = ValidateName.getDouble(
            		sc, "Enter your Height in inches:	",36,92);
            double weight = ValidateName.getDouble(
            		sc, "Enter your Weight in pounds:	",80,400);
            double decimal = ValidateName.getDouble(
            		sc, "Enter your Favorite Decimal:	",0,1);
            
            //Jimmy Johns is just a sandwich
            
            // see if the user wants to continue
            choice = ValidateName.getString(
                sc, "Another assignment? (y/n): ");
            System.out.println();
        }
  }

}
