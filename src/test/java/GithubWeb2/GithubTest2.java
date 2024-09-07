package GithubWeb2;

import Base.BaseClass2;
import Base.BaseClass2;
import Pages.Githubpage2;
import Pages.Loginpage2;
import org.testng.annotations.Test;

public class GithubTest2 extends BaseClass2 {
    @Test
    public void GithubMethod() throws InterruptedException {
        Githubpage2 Github = new Githubpage2(driver);
        Github.openUrlgit();
        Github.sigin();
        Loginpage2 login = new Loginpage2(driver);
        login.usernameField();
        login.passwordField();
        Thread.sleep(3000);
        //Github.openUrlgit();
        Github.Opendocs();
        Thread.sleep(2000);
        Github.Community();
        Thread.sleep(2000);
        Github.ProfessionalServices();
        Thread.sleep(2000);
        Github.productpar();
        Thread.sleep(2000);
        Github.peckeges();
        Thread.sleep(2000);
        Github.scrollup();
        Thread.sleep(3000);


        //Loginpage2 login = new Loginpage2(driver);
        //login.usernameField();
        //login.passwordField();
        //login.loginBtn();
    }
}
