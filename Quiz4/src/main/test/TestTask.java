import ca.dalhousie.Status;
import ca.dalhousie.Task;
import ca.dalhousie.TeamMember;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class TestTask {


    @Test
    public void testAssignTo_success() {
        TeamMember teamMember = new TeamMember(1, "Mihir", "mihirdpatel@dal.ca");
        Task task = new Task(1, "quiz4 task", "temp description");
        assertTrue(task.assignTo(teamMember));
    }

    @Test
    public void testAssignTo_fail() {
        TeamMember teamMember = null;
        Task task = new Task(1, "quiz4 task", "temp description");
        assertFalse(task.assignTo(teamMember));
    }

    @Test
    public void testUpdateStatus_success() {
        Task task = new Task(1, "quiz4 task", "temp description");
        assertTrue(task.updateStatus(Status.IN_PROGRESS));
    }

    @Test
    public void testUpdateStatus_fail() {
        Task task = new Task(1, "quiz4 task", "temp description");
        assertFalse(task.updateStatus(null));
    }

    @Test
    public void testIsOverdue_true() {
        Task task = new Task(1, "quiz4 task", "temp description");
        task.setDueDate(new Date());
        assertTrue(task.isOverdue());
    }

    @Test
    public void testIsOverdue_false() {
        Task task = new Task(1, "quiz4 task", "temp description");
        task.setDueDate(new Date());
        assertFalse(task.isOverdue());
    }

}
