import java.util.*;

public class Dailyplanner {

    String[] dates = new String[100];
    String[] tasks = new String[100];
    int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dailyplanner planner = new Dailyplanner();

        planner.menu(sc);
    }

    public void menu(Scanner sc) {
        int choice = 0;

        while (choice != 3) {
            System.out.println("\n--- DAILY PLANNER ---");
            System.out.println("1. Add task");
            System.out.println("2. View all tasks");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    addTask(sc);
                    break;
                case 2:
                    viewTask();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public void addTask(Scanner sc) {
        System.out.print("Enter date (YYYY-MM-DD): ");
        dates[count] = sc.nextLine();

        System.out.print("Enter task description: ");
        tasks[count] = sc.nextLine();

        count++;

        System.out.println("Task added!");
    }

    public void viewTask() {
        if (count == 0) {
            System.out.println("No tasks yet!");
            return;
        }

        System.out.println("\n--- ALL TASKS ---");
        for (int i = 0; i < count; i++) {
            System.out.println(dates[i] + ": " + tasks[i]);
        }
    }
}
