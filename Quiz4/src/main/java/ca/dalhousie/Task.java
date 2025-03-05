package ca.dalhousie;

import java.util.Date;

public class Task {
    private int id;
    private String title;
    private String description;
    private TeamMember assignee;
    private Status status;
    private Date assignDate;
    private Date dueDate;


    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public boolean assignTo(TeamMember teamMember) {
        if (teamMember == null) {
            return false;
        }
        this.assignee = teamMember;
        return true;
    }

    public boolean updateStatus(Status status) {
        return true;
    }
}
