
import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {

    private final ArrayList<String> todoList = new ArrayList<>();

    // add item
    public void addItem(String item) {
        todoList.add(item);
        System.out.println("Added: " + item);
    }

    // remove item
    public void removeItem(int index) {
        if (index < 0 || index >= todoList.size()) {
            System.out.println("Invalid list!");
        } else {
            String removedItem = todoList.remove(index);
            System.out.println("Removed: " + removedItem);
        }
    }

    // view item 
    public void viewItems() {
        if (todoList.isEmpty()) {
            System.out.println("Your todo list is empty");
        } else {
            System.out.println("Your todo list is here: ");
            for (int i = 0; i < todoList.size(); i++) {
                System.out.println((i + 1) + ". " + todoList.get(i));
            }
        }
    }

    // main method
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        ToDoList myList = new ToDoList();
        boolean exit = false;

        while(!exit){
            System.out.println("1. Add item.");
            System.out.println("2. remove item.");
            System.out.println("3. view items.");
            System.out.println("4. exit.");
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1 -> {
                    System.out.println("Enter a item to add: ");
                    String item = scanner.nextLine();
                    myList.addItem(item);
                }
                case 2 -> {
                    System.out.println("Enter the index to item the remove: ");
                    int index = scanner.nextInt();
                    myList.removeItem(index-1);
                }

                case 3 -> myList.viewItems();
                case 4 -> {
                    exit = true;
                    System.out.println("Exiting...");
                }
                default -> System.out.println("Invalid option. Please try again....");  
            }
            
        }
    }



}
