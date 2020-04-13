package by.company.app;

import by.company.app.pages.LoginPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Autowired
    private LoginPage loginPage;

    @Test
    void login() {
        System.out.println("");
    }

}
