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
        if (status == null) {
            return false;
        }
        this.status = status;
        return true;
    }


    public boolean isOverdue() {
        if (status != Status.FINISHED && dueDate.toInstant().isBefore(new Date().toInstant())) {
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TeamMember getAssignee() {
        return assignee;
    }

    public void setAssignee(TeamMember assignee) {
        this.assignee = assignee;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Date getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Date assignDate) {
        this.assignDate = assignDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
