import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] groceriesList = new String[3];
        int itemsCount = 0;
        boolean isDone = false;


        while (!isDone && (itemsCount < groceriesList.length)) {
            itemsCount++;
            System.out.println("Add item to list (" + itemsCount + "/" + groceriesList.length + "): \n (enter 'done' to exit)");

            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("done")) {
                System.out.println("Done...");
                isDone = true;
            } else {
                groceriesList[itemsCount - 1] = item;
            }
        }
        while (!isDone) {
            System.out.println("Your groceries' list is full. Would you like to replace an item? (y/n)");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                printGroceries(groceriesList);
                System.out.println("Enter a number: ");
                int indexToReplace = scanner.nextInt() - 1;
                scanner.nextLine();
                System.out.println("New item:");
                String name = scanner.nextLine();
                String replacedItem = groceriesList[indexToReplace];
                groceriesList[indexToReplace] = name;
                System.out.println(replacedItem + " was replaced with " + name);
                printGroceries(groceriesList);
                scanner.nextLine();
            } else System.out.println("Done...");
            isDone = true;

        }
    }

    private static void printGroceries(String[] groceriesList) {
        for (int i = 0; i < groceriesList.length; i++) {
            System.out.println(i + 1 + ". " + groceriesList[i]);

        }
    }

}