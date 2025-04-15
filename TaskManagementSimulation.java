import java.util.Scanner;
public class TaskManagementSimulation {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    TaskManagement taskManagement = new TaskManagement();
    while (true) {
        System.out.println("\n########################################################");
        System.out.println("Task Management System Simulation");
        System.out.println("Menu Options");
        System.out.println("1. Add task");
        System.out.println("2. Remove a task");
        System.out.println("3. Modify a Task");
        System.out.println("4. Categorize Task");
        System.out.println("5. Recurring Task");
        System.out.println("6. Display Task");
        System.out.println("7. Exit");
        System.out.print("Enter a choice ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            System.out.println("Add a title name");
            String title = scanner.nextLine();
            System.out.println("Add a date");
            String date = scanner.nextLine();
            System.out.println("Add that whether that you finished the task or not finished");
            boolean finished = scanner.nextBoolean();
            scanner.nextLine();
            System.out.println("Add a deadline");
            String deadline = scanner.nextLine();
            System.out.println("Add a priority");
            int categorize = scanner.nextInt();
            Task task = new Task (title, date, finished, deadline, categorize);
            System.out.println(taskManagement.addTask(task));

        } 

        else if (choice == 2) {
            System.out.println("Enter a title to remove");
            String removetitle = scanner.nextLine();
            System.out.println("Enter date to remove");
            String removedate = scanner.nextLine();
            System.out.println("Enter to indicate that the task is finished or not finished");
            boolean removefinished = scanner.nextBoolean();
            scanner.nextLine();
            System.out.println("Enter deadline to remove");
            String removedeadline = scanner.nextLine();
            System.out.println("Enter priority to remove");
            int removepriority = scanner.nextInt();
            Task Remove = new Task (removetitle, removedate, removefinished, removedeadline, removepriority);
            System.out.println(taskManagement.removeTask(Remove));


        }

        else if (choice == 3) {
            System.out.println("Enter modified title");
            String modifytitle = scanner.nextLine();
            System.out.println("Enter modified date");
            String modifydate = scanner.nextLine();
            System.out.println("Enter modified finished or not finished");
            boolean modifyfinished = scanner.nextBoolean();
            scanner.nextLine();
            System.out.println("Enter modified deadline");
            String modifydeadline = scanner.nextLine();
            System.out.println("Enter modified priority");
            int modifypriority = scanner.nextInt();
            Task Modify = new Task (modifytitle, modifydate, modifyfinished,modifydeadline,modifypriority);
            System.out.println(taskManagement.modifyTask(Modify));
        }
        
        else if (choice == 4) {
            System.out.println("Enter categorize title");
            String categorizetitle = scanner.nextLine();
            System.out.println("Enter categorize date");
            String categorizedate = scanner.nextLine();
            System.out.println("Enter categorize finished or not finished");
            boolean categorizefinished = scanner.nextBoolean();
            scanner.nextLine();
            System.out.println("Enter categorize deadline");
            String categorizedeadline = scanner.nextLine();
            System.out.println("Enter priority");
            int priority = scanner.nextInt();
            Task Categorize = new Task(categorizetitle, categorizedate, categorizefinished, categorizedeadline,
                    priority);
            System.out.println(taskManagement.categorizeTask(Categorize));
        }
        
        else if (choice == 5) {
            System.out.println("Enter recurring title");
            String recurringtitle = scanner.nextLine();
            System.out.println("Enter recurring date");
            String recurringdate = scanner.nextLine();
            System.out.println("Enter recurring finished or not finished");
            boolean recurringfinished = scanner.nextBoolean();
            scanner.nextLine();
            System.out.println("Enter recurring deadline");
            String recurringdeadline = scanner.nextLine();
            System.out.println("Enter recurring priority");
            int recurringpriority = scanner.nextInt();
            Task Recurring = new Task(recurringtitle, recurringdate, recurringfinished, recurringdeadline,
                    recurringpriority);
            System.out.println(taskManagement.recurringTask(Recurring));
        }
        else if (choice == 6) {
            taskManagement.printDetails();
        }
        else if (choice == 7) {
            System.out.println("Exiting the program");
            scanner.close();
            break;
        }
        else {
            System.out.println("Invalid Choice, Please try again");
        }

    }
  }
}

