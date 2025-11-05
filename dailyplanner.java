// import java.io.*;
// import java.util.*
// import java.time.LocalDate;






// public class Dailyplanner {
//     String[] dates = new String{100};
//     String[] tasks = new String[100];
//     int count = 0;
    
// }
// //import java.util.Scanner;
// //public class dailyplanner {
// public static  void main (String []args) {
//     new Dailyplanner().run();
// }
//     void() {
//         loadtasks();
//         Scanner scanner = new Scanner(System.in);
//         int choice = 0;

//         // main menu loop
//         while (choice != 5) {
//             System.out.println("Welcome to Task Manager created by Wally, Oluwadamilre, and Denzel!. How are you!?");
//             System.out.println("1. View Tasks");
//             System.out.println("2. Add Task");
//             System.out.println("3. Delete Task");
//             System.out.println("4. Generate Report");
//             System.out.println("5. Exit");
//             System.out.print("Enter choice: ");

//             if (in.hasNextInt()) {
//                 choice = in.nextInt();
//                 in.nextLine(); // clear
//             } else {
//                 System.out.println("Please enter a number.");
//                 in.nextLine();
//                 continue;
//             }

//             if (choice == 1) viewTasks(in);
//             else if (choice == 2) addTask(in);
//             else if (choice == 3) deleteTask(in);
//             else if (choice == 4) generateReport();
//             else if (choice == 5) saveTasks();
//             else System.out.println("Invalid choice.");
//         }

//         System.out.println("Goodbye!");
//         in.close();
//     }

//     void loadTasks() {
//         try {
//             File f = new File("tasks.txt");
//             if (!f.exists()) {
//                 System.out.println("No task file found, starting fresh.");
//                 return;
//             }

//             Scanner file = new Scanner(f);
//             while (file.hasNextLine() && count < 100) {
//                 String line = file.nextLine();
//                 String[] parts = line.split(",", 2);
//                 if (parts.length == 2) {
//                     dates[count] = parts[0];
//                     tasks[count] = parts[1];
//                     count++;
//                 }
//             }
//             file.close();
//             System.out.println(count + " tasks loaded.");
//         } catch (Exception e) {
//             System.out.println("Error loading tasks (maybe file missing?)");
//         }
//     }

//     void saveTasks() {
//         try {
//             PrintWriter out = new PrintWriter("tasks.txt");
//             for (int i = 0; i < count; i++) {
//                 out.println(dates[i] + "," + tasks[i]);
//             }
//             out.close();
//             System.out.println("Tasks saved!");
//         } catch (Exception e) {
//             System.out.println("couldn't save file lol");
//         }
//     }

//     void viewTasks(Scanner in) {
//         System.out.print("Enter date (YYYY-MM-DD): ");
//         String d = in.nextLine();
//         boolean found = false;
//         for (int i = 0; i < count; i++) {
//             if (dates[i].equals(d)) {
//                 System.out.println("- " + tasks[i]);
//                 found = true;
//             }
//         }
//         if (!found) System.out.println("No tasks on that day.");
//     }

//     void addTask(Scanner in) {
//         if (count >= 100) {
//             System.out.println("Task list full :(");
//             return;
//         }
//         System.out.print("Date (YYYY-MM-DD): ");
//         dates[count] = in.nextLine();
//         System.out.print("Task: ");
//         tasks[count] = in.nextLine();
//         count++;
//         System.out.println("Added!");
//     }

//     void deleteTask(Scanner in) {
//         System.out.print("Enter part of task to delete: ");
//         String key = in.nextLine().toLowerCase();
//         boolean deleted = false;
//         for (int i = 0; i < count; i++) {
//             if (tasks[i].toLowerCase().contains(key)) {
//                 // shift left
//                 for (int j = i; j < count - 1; j++) {
//                     dates[j] = dates[j + 1];
//                     tasks[j] = tasks[j + 1];
//                 }
//                 count--;
//                 System.out.println("Task deleted!");
//                 deleted = true;
//                 break;
//             }
//         }
//         if (!deleted) System.out.println("Couldn't find it...");
//     }

//     void generateReport() {
//         try {
//             PrintWriter out = new PrintWriter("planner_report.txt");
//             String today = LocalDate.now().toString();

//             out.println("ALL TASKS:");
//             for (int i = 0; i < count; i++) {
//                 out.println(dates[i] + " - " + tasks[i]);
//             }

//             out.println("\nOVERDUE TASKS:");
//             for (int i = 0; i < count; i++) {
//                 if (dates[i].compareTo(today) < 0) {
//                     out.println("[OVERDUE] " + dates[i] + " - " + tasks[i]);
//                 }
//             }

//             out.close();
//             System.out.println("Report generated (planner_report.txt)");
//         } catch (Exception e) {
//             System.out.println("something went wrong writing report");
//         }
//     }
// }






//     }


// // display menu




// // prompt user to give type in tasks that need to be fufilled throughout the day 

// // store information and list the tasks for that specific including, day of the week, month, 



