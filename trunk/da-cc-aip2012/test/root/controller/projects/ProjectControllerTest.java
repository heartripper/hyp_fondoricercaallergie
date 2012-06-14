package root.controller.projects;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class ProjectControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/projects/project");
        ProjectController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/projects/project.jsp"));
    }
}