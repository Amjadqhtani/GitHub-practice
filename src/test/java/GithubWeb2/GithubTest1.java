package GithubWeb2;


import Base.BaseClass2;
import Pages.Loginpage2;
import Pages.Homepage2;
import io.qameta.allure.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class GithubTest1 extends BaseClass2 {
    @Test
    @Epic("docs flow")
   // @Feature("docs feature")
    @Story("user shall view docs")
    @Owner("amjad")
    @Severity(SeverityLevel.CRITICAL)
    public void LoginMethod() throws InterruptedException {
        Loginpage2 loginpage = new Loginpage2(driver);
        loginpage.openUrl();
        loginpage.usernameField();
        loginpage.passwordField();
        loginpage.loginBtn();
        Thread.sleep(5000);
    }

    @Test(testName = "TS-002")
    public void HomeMethod() throws InterruptedException {
        Homepage2 homepage = new Homepage2(driver);
        LoginMethod();
        homepage.OpenAvatar();
        Thread.sleep(5000);
        homepage.Repositories();
        homepage.NewRepository();
        homepage.RepositoryName();
        Thread.sleep(5000);
        homepage.CreateBtn();
        Thread.sleep(5000);
    }

}
