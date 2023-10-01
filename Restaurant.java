import java.util.Random; //import random method

public class Restaurant { //create class called Restaurant

    public static void main(String[] args){ //main method

    //Array of menu items
    String[] menuItems = { 
        "Nachos", "Mozzarella Sticks", "Wings", "Fries", "Hummus", "Grilled Chicken", "Steak",
        "Fish and Chips", "Spaghetti", "Salad", "Ice Cream", "Brownies", "Cookies", "Cake", "Pie"};
    
    //Array of menu price
    double[] itemPrice = {
        10.00, 8.99, 12.99, 6.00, 6.00, 14.99, 18.99, 16.99, 14.99, 12.00, 5.00, 6.00, 4.99, 6.00, 6.00
    };

    
    double totalSales = 0.00; //variable for total sales
    int[] orders = new int[15]; // array of orders

    Random random = new Random(); //making new instance of Random class to make random orders


    //For loop to take orders up to 20 orders
    for (int orderNumber = 1; orderNumber <= 20; orderNumber++) {
        System.out.println("\nHello! Can I please take your Order? Order #" + orderNumber + "\n"); //Asks for oder and prints order number

        System.out.println("Menu: ");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i]);
        }


        int itemNumber = random.nextInt(menuItems.length); //generates a random menu item


       
        orders[itemNumber]++; // records the order
        totalSales += itemPrice[itemNumber]; //updates the total sale

        System.out.println("\nOrder: " + menuItems[itemNumber]); //prints order item
}

        // Display the summary
        System.out.println("\nOrder Summary:");
        System.out.println("Total money made: $" + String.format("%.2f", totalSales)); //prints total sales $$

        // percentage of sales
        System.out.println("\nPercentage of sales for each item:"); 
        for (int i = 0; i < menuItems.length; i++) {
            double percentage = (orders[i] / 20.00) * 100.00; // Dividing each ordered item by total orders(20) then multiplying by 100 to get percent ordered
            System.out.println(menuItems[i] + ": " + percentage + "%");
        }

        // List of items ordered with how many time they were ordered
        System.out.println("\nList of items ordered with the number of times they’re ordered:");
        for (int i = 0; i < menuItems.length; i++) {    
            System.out.println(menuItems[i] + ": " + orders[i] + " times"); //indexing through every menu and printing how many times it was ordered
        }
    }

}



