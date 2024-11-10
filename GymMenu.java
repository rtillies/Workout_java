import java.util.Scanner;
import javax.swing.JOptionPane;

public class GymMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        showMainMenu();
        int choice = getChoice(input);
        processChoice(choice);
    }

    public static void showMainMenu() {
        System.out.println("Main Menu");
        System.out.println(" 0: Quit Program");
        System.out.println(" 1: Add Customer");
        System.out.println(" 2: Find Customer");
        // System.out.println("Main");
        // System.out.println("Main");
        // System.out.println("Main");
        // System.out.println("Main");
        // System.out.println("Main");


    }

    public static int getChoice(Scanner input) {
        System.out.print("Enter choice: ");
        return input.nextInt();
    }

    public static void processChoice(int choice) {
        String input;
        switch (choice) {
            case 0:
                System.out.println("Thanks for using the program!");
                System.exit(choice);
                break;
            case 1:
                createCustomer();
                break;
            default:
                System.err.println("Not an option");

                break;
        }
    }

    public static Customer createCustomer() {
        String input;
        String name = JOptionPane.showInputDialog("Enter customer name");
        input = JOptionPane.showInputDialog("Enter customer height (in inches)");
        double height = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter customer weight (in pounds)");
        double weight = Double.parseDouble(input);
        Customer customer = new Customer(name, height, weight);
        String message = String.format("Customer created: %n %s [%d]", customer.getName(), customer.getID());
        JOptionPane.showMessageDialog(null, message);
        return customer;
    }
}