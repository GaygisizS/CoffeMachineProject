import java.util.Scanner;
public class CoffeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coffee turkishCoffe = new Coffee("TurkishCoffe");
        Coffee filtercoffee = new Coffee("Filter coffee ");
        Coffee espresso = new Coffee("Espresso");
        // tell the user to choose the coffee
        System.out.println("Which coffee would you like?");
        System.out.println("1. " + turkishCoffe.getName());
        System.out.println("2. " + filtercoffee .getName());
        System.out.println("3. " + espresso.getName());
        int choice = scanner.nextInt();
        scanner.nextLine(); // Dummy kod.
        Coffee selectedCoffee = null;
        switch (choice) {
            case 1:
                selectedCoffee = turkishCoffe;
                break;
            case 2:
                selectedCoffee = filtercoffee ;
                break;
            case 3:
                selectedCoffee = espresso;
                break;
            default:
                System.out.println("Invalid Selection");
                scanner.close();
        }
        // Creating an order
        Order order = new Order(selectedCoffee);
        //Add milk
        System.out.println("Would you like milk in your coffee? (Yes/No): ");
        String milkReply = scanner.nextLine();
        if (milkReply.equalsIgnoreCase("Yes")) {
            order.setWithMilk(true);
        }
        //Add sugar
        System.out.println("Would you like to add sugar? (Yes/No): ");
        String sugarReply = scanner.nextLine();
        if (sugarReply.equalsIgnoreCase("Yes")) {
            order.setWithSugar(true);
            System.out.println("How many cubes of sugar? ");
            int setAmountOfSugar = scanner.nextInt();
            scanner.nextLine();
            order.setAmountOfSugar(setAmountOfSugar);
        }
        //Size of coffee
        System.out.println("What size you want?  (Large Size/Medium Size/Small Size");
        String replySize = scanner.nextLine();
        order.setSize(replySize);
        order.prepare();
        scanner.close();
    }
}