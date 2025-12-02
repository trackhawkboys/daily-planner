import java.io.*;
import java.time.LocalDateTime;
import java.util.*;

// import java.time.LocalDate;






public class Dailyplanner {
    // String[] dates = new String[100];
    // String[] tasks = new String[100];
    int count = 0;
    

//import java.util.Scanner;
//public class dailyplanner {
public static  void main (String []args) {
      Scanner scando = new Scanner(System.in);
        //LocalDateTime currentDateTime = LocalDateTime.now();

    Dailyplanner planner = new Dailyplanner();      //object creation
    
    System.out.println("Enter username:");
    String username = scando.nextLine();
    System.out.println("Enter password:");

    planner.loadTask(scando); //calling method on object
     planner.addTask(scando);
     planner.viewTask();
     int userchoice = scando.nextInt();
}
    public void loadTask(Scanner scando)  {
        int choice = 0;
    
    
        while (choice != 3) {
        System.out.println(" Welcome to your dailyplanner");
        System.out.println(" 1. Add task");
        System.out.println("2. View all tasks");
        System.out.println("3. Exit program");
        //prompt user to enter choice 
        System.out.println("Select your choice! (1-3)");
        //break;
        choice = scando.nextInt();
        scando.nextLine();

        
        switch (choice) {

        case 1:
            addTask(scando);
            break;
            
        case 2:
            viewTask();
            break;

        case 3:
            System.out.println("Goodbye!");
            break;

        default:
            System.out.println("Invalid choice, select again.");
            break;    




    }}}

    public void addTask(Scanner scando) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);
        System.out.println("Stay Productive Man, Add a Task for Today!:");
        String addedtasks = scando.nextLine();
        System.out.println("Task description:");
        String tasksdescription = scando.nextLine();
        scando.nextLine();
    
    
    
    
    }



    public void viewTask() {


    
    
    
    }}





// // display menu




// // prompt user to give type in tasks that need to be fufilled throughout the day 

// // store information and list the tasks for that specific including, day of the week, month, 



