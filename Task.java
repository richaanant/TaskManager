public class Task {
    // fields and attributes for task class
    String title;
    String date;
    Boolean isFinished;
    String deadlines;
    int priority;

    // Constructor for Task Class (edited)
    public Task (String title, String date, Boolean isFinished, String deadlines, int priority) {
        this.title = title;
        this.date = date;
        this.isFinished = isFinished;
        this.deadlines = deadlines;
        this.priority = priority;
    }
    // returns title
    public String getTitle() {
        return this.title;
    }


    // changes title
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    // returns date
    public String getDate() {
        return this.date;
    }

    // changes date
    public void setDate(String newDate) {
        this.date = newDate;
    }

    // returns a boolean value whether it it is finished or no
    public boolean getFinished() {
        return this.isFinished;
    }  

    // changes a boolean value 
    public void setFinished(boolean newFinished) {
        this.isFinished = newFinished;
    }

    // returns deadlines
    public String getDeadlines() {
        return this.deadlines;
    }

    // changes deadlines
    public void setDeadlines(String newDeadlines) {
        this.deadlines = newDeadlines;
    }

    // returns priority
    public int getPriority() {
        return this.priority;
    }

    // changes priority
    public void setPriority(int newPriority) {
        this.priority = newPriority;
    }
    

}
