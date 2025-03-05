import ca.dalhousie.Status;
import ca.dalhousie.Task;
import ca.dalhousie.TeamMember;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class TestTask {

    private TeamMember teamMember;
    private Task task;

    @BeforeEach
    public void setup() {
        teamMember = new TeamMember(1, "Mihir", "mihirdpatel@dal.ca");
        task = new Task(1, "quiz4 task", "temp description");
    }

    @Test
    public void testAssignTo_success() {
        assertTrue(task.assignTo(teamMember));
    }

    @Test
    public void testAssignTo_fail() {
        teamMember = null;
        assertFalse(task.assignTo(teamMember));
    }

    @Test
    public void testUpdateStatus_success() {
        assertTrue(task.updateStatus(Status.IN_PROGRESS));
    }

    @Test
    public void testUpdateStatus_fail() {
        assertFalse(task.updateStatus(null));
    }

}
