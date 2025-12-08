import java.util.*;

public class Dailyplanner {

    // Arrays to store tasks
    String[] dates = new String[200];
    String[] tasks = new String[200];
    int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dailyplanner planner = new Dailyplanner();

        planner.menu(sc);
    }

    //           MENU

    public void menu(Scanner sc) {
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n DAILY PLANNER ");
            System.out.println("1. Add task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Clear input buffer

            switch (choice) {
                case 1:
                    addTask(sc);
                    break;
                case 2:
                    viewTask();
                    break;
                case 3:
                    removeTask(sc);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    //       ADD TASK

    public void addTask(Scanner sc) {
        System.out.println("\n ADD TASK ");

        System.out.print("Enter date (YYYY-MM-DD): ");
        dates[count] = sc.nextLine();

        System.out.print("Enter task description: ");
        tasks[count] = sc.nextLine();

        count++;

        System.out.println("Task added successfully!");
    }
    //       VIEW TASKS

    public void viewTask() {
        System.out.println("\n ALL TASKS");

        if (count == 0) {
            System.out.println("No tasks available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + dates[i] + " - " + tasks[i]);
        }
    }

    //      REMOVE TASK

    public void removeTask(Scanner sc) {
        System.out.println("\n REMOVE TASK ");

        if (count == 0) {
            System.out.println("No tasks to remove!");
            return;
        }

        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        System.out.print("Enter task description: ");
        String desc = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (dates[i].equals(date) && tasks[i].equalsIgnoreCase(desc)) {

                // Shift elements left

                for (int j = i; j < count - 1; j++) {
                    dates[j] = dates[j + 1];
                    tasks[j] = tasks[j + 1];
                }

                count--;
                System.out.println("Task removed successfully!");
                return;
            }
        }

        System.out.println("Task not found.");
    }
}
