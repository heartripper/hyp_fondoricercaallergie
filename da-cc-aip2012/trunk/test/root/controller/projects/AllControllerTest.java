package root.controller.projects;

import org.slim3.tester.ControllerTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AllControllerTest extends ControllerTestCase {

    @Test
    public void run() throws Exception {
        tester.start("/projects/all");
        AllController controller = tester.getController();
        assertThat(controller, is(notNullValue()));
        assertThat(tester.isRedirect(), is(false));
        assertThat(tester.getDestinationPath(), is("/projects/all.jsp"));
    }
}