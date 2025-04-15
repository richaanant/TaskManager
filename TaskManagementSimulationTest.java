public class TaskManagementSimulationTest {
    public static void main(String[] args) {
        // This file is mostly about test cases
        TaskManagement taskManagement = new TaskManagement();

        // Create Task Objects
        Task task1 = new Task("ITSC 1213 Problem Set", "February 18th", true, "February 25th", 1);
        Task task2 = new Task("Go to the Gym", "February 19th", true, "February 19th", 0);

        System.out.println("############################");
        System.out.println("TEST: Adding Tasks");
        String taskAdded = taskManagement.addTask(task1);
        String taskAdded2 = taskManagement.addTask(task2);

        if (!taskAdded.equals("Task did not added, it is already found")
                && !taskAdded2.equals("Task did not added, it is already found")) {
            System.out.println(" Test Passed: Task  successfully added! " + taskAdded + ", " + taskAdded2);
        } else {
            System.out.println("Test Failed - Tasks is not added correctly");
        }

        // Test: Remove Task to the Management System
        System.out.println("############################");
        System.out.println("TEST: Removing Tasks");
        String taskRemoved = taskManagement.removeTask(task1);
        String taskRemoved2 = taskManagement.removeTask(task2);

        if (!taskRemoved.equals("Task is not removed") && !taskRemoved2.equals("Task is is not removed")) {
            System.out.println(" Test Passed: Task successfully removed! " + taskRemoved + ", " + taskRemoved2);
        } else {
            System.out.println("Test Failed - Tasks is not removed correctly");
        }

        taskManagement.addTask(task1);
        taskManagement.addTask(task2);

        // Test: Modifying Task to the Management System
        System.out.println("############################");
        System.out.println("TEST: Modifying Tasks");
        String taskModify = taskManagement.modifyTask(task1);
        String taskModify2 = taskManagement.modifyTask(task2);

        if (!taskModify.equals("Task is not modified successfully")
                && !taskModify2.equals("Task is not modified successfully")) {
            System.out.println(" Test Passed: Task successfully  modified! " + taskModify + ", " + taskModify2);
        } else {
            System.out.println("Test Failed - Tasks is not modified correctly");
        }

        // Test: Categorizing Task to the Management System
        System.out.println("############################");
        System.out.println("TEST: Categorizing Tasks");
        String taskCategorize = taskManagement.categorizeTask(task1);
        String taskCategorize2 = taskManagement.categorizeTask(task2);

        if (!taskCategorize.equals("Errors, out of range bounds")
                && !taskCategorize2.equals("Errors, out of range bounds")) {
            System.out
                    .println(" Test Passed: Task successfully categorize! " + taskCategorize + ", " + taskCategorize2);
        } else {
            System.out.println("Test Failed - Tasks is not categorize correctly");
        }

           // Test: Recurring Task to the Management System
        System.out.println("############################");
        System.out.println("TEST: Reccurring Tasks");
        String taskRecurring = taskManagement.recurringTask(task1);
        String taskRecurring2 = taskManagement.recurringTask(task2);

        if (!taskRecurring.equals("Task could not be recurred")
        && !taskCategorize2.equals("Task could not be recurred")) {
    System.out
            .println(" Test Passed: Task successfully categorize! " + taskRecurring + ", " + taskRecurring2);
} else {
    System.out.println("Test Failed - Tasks is not recurred correctly");
}


    }
    

}
    





        
   
