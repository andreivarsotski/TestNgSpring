package by.company.app;

import by.company.app.runner.TestNGWithSpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration({"/domain.xml"})
@SpringBootTest(classes = TestNGWithSpringApplication.class)
public class BaseTest extends AbstractTestNGSpringContextTests {
}
