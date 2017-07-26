import static java.lang.System.out;
import java.util.Scanner;

public class GroceryLis
{
    public static void main(String[] arg)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1? ");
        String firstItem;
        firstItem = keyboard.nextLine();
        out.println("");
        out.print("Item 2? ");
        String secondItem;
        secondItem = keyboard.nextLine();
        out.println("");
        out.print("Item 3? ");
        String thirdItem;
        thirdItem = keyboard.nextLine();
        out.println("");
        out.println("Now, please enter the quantity of each item.");
        out.print("How many " + firstItem + "? ");
        int firstItemCount;
        firstItemCount = keyboard.nextInt();
        out.println("");
        out.print("How many " + secondItem + "? ");
        int secondItemCount;
        secondItemCount = keyboard.nextInt();
        out.println("");
        out.print("How many " + thirdItem + "? ");
        int thirdItemCount;
        thirdItemCount = keyboard.nextInt();
        out.println("");
        out.println("Now, please enter the price of each item.");
        out.print("How much does one " + firstItem + " cost? ");
        float firstItemCost;
        firstItemCost = keyboard.nextFloat();
        out.println("");
        out.print("How much does one " + secondItem + " cost? ");
        float secondItemCost;
        secondItemCost = keyboard.nextFloat();
        out.println("");
        out.print("How much does one " + thirdItem + " cost? ");
        float thirdItemCost;
        thirdItemCost = keyboard.nextFloat();
        out.println("");
        out.println("Calculating your grocery bill.");
        float firstItemTotal;
        firstItemTotal = firstItemCount * firstItemCost;
        float secondItemTotal;
        secondItemTotal = secondItemCount * secondItemCost;
        float thirdItemTotal;
        thirdItemTotal = thirdItemCount * thirdItemCost;
        float groceryTotal;
        groceryTotal = firstItemTotal + secondItemTotal + thirdItemTotal;
        out.println("Your total cost is " + groceryTotal + ".");
        
        
        
       
        
        
        
        
    }
}    
        