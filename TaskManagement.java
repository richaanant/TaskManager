import java.util.ArrayList;
public class TaskManagement {
    private ArrayList<Task> tasks = new ArrayList<>();

    public TaskManagement() {
        tasks = new ArrayList<>();
    }

    // If not found, than adds all the atributes of tasks that were not found which will print "Task added successfully"
    // If found, print all the atributes of tasks that were found which will print "Task did not added, it is already found"
    public String addTask (Task task) {
        for (Task t: tasks)  {
            if ((task.getTitle() != null && t.getTitle().equals(task.getTitle())) && (task.getDate() != null && t.getDate().equals(task.getDate())) && (t.getFinished() == task.getFinished()) && (task.getDeadlines() != null && t.getDeadlines().equals(task.getDeadlines())) && (t.getPriority() == task.getPriority())) {
                return "Task did not added, it is already found";
            }
           
        }

        tasks.add(task);
        return "Task added successfully";
      
        }
    

    // if all atributes are found, then it will be removed which will print "Task is removed successfully"
    // if it is not found, than print "Task is not removed successfully"
    public String removeTask (Task task) {
        for (Task t: tasks) {
            if (task.getTitle() != null && t.getTitle().equals(task.getTitle()) && task.getDate() != null && t.getDate().equals(task.getDate()) && t.getFinished() == task.getFinished() && task.getDeadlines() != null &&  t.getDeadlines().equals(task.getDeadlines()) && t.getPriority() == task.getPriority()) {
                tasks.remove(t);
                return "Task is removed successfully";
            }
        }
            return "Task is not removed successfully";
       }
        // changes the atributes of the task to a new value which will print "Task is modified successfully" ;
        // if it did not change, than print "Task is not modified successfully"
        public String modifyTask(Task task) {
            boolean isModified = false;
            for (Task t: tasks) { 
                    if (task.getTitle() != null && !t.getTitle().equals(task.getTitle())) {
                        t.setTitle(task.getTitle()); 
                        isModified = true;
                        break;
                    }
                    if (task.getDate() != null && !t.getDate().equals(task.getDate())) {
                        t.setDate(task.getDate());
                        isModified = true;
                        break;
                    }

                    if (t.getFinished() != task.getFinished()) {
                        t.setFinished(task.getFinished());
                        isModified = true;
                        break;
                    }

                    if (task.getDeadlines() != null && !t.getDeadlines().equals(task.getDeadlines())) {
                        t.setDeadlines(task.getDeadlines());
                        isModified = true;
                        break;
                    }

                   if (t.getPriority() != task.getPriority()) {
                        t.setPriority(task.getPriority());
                        isModified = true;
                        break;
                }
            }
            if (isModified) {
                return "Task is modified successfully";
            }
            else {
                return "Task is not modified successfully";

            }
        }


        // Categorizes based on the range of the priority of importance of the task
        // Priority has to be in the ranges of -1 to 1
        public String categorizeTask(Task task) {
            for (Task t : tasks) {
                if (t.getPriority() >= -1 && t.getPriority() <= 1  && task.getTitle() != null && t.getTitle().equals(task.getTitle()) && task.getDate() != null && t.getDate().equals(task.getDate()) && t.getFinished() == task.getFinished() && task.getDeadlines() != null &&  t.getDeadlines().equals(task.getDeadlines())){
                    return "Priority " + task.getPriority() + " Title " + task.getTitle() + " Date " + task.getDate()
                            + " Finished " + task.getFinished() + " Deadline " + task.getDeadlines();
                }

            }
            return "Error, out of range bounds";
        }
        
        // Reccurs a Task what needs to be done weekly
        public String recurringTask(Task task) {
            for (Task t : tasks) {
                if (task.getTitle() != null && t.getTitle().equals(task.getTitle()) && task.getDate() != null
                        && t.getDate().equals(task.getDate()) && t.getFinished() == task.getFinished()
                        && task.getDeadlines() != null && t.getDeadlines().equals(task.getDeadlines())) {
                    return " Weekly Task " + " Title " + task.getTitle() + " Date " + task.getDate()
                            + " Finished " + task.getFinished() + " Deadline " + task.getDeadlines();
                }
            }
            return "Task could not be recurred";
       
        } 
        
        // Print all the details of the task list
        public void printDetails() {
            if (tasks.isEmpty()) {
                System.out.println("No tasks found");
            }
            else {
                for (Task t: tasks) {
                    System.out.println(t.getTitle());
                    System.out.println(t.getDate());
                    System.out.println(t.getFinished());
                    System.out.println(t.getDeadlines());
                    System.out.println(t.getPriority());
                    System.out.println("-------------------------");
                }
            }

    }
}
        

