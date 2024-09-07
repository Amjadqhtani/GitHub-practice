package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectPaths2.LoginObject2.*;
import static ObjectPaths2.LoginObject2.password;

public class Loginpage2 {
    WebDriver driver = null;

    public Loginpage2(WebDriver driver) {
        this.driver = driver;

    }

    public void openUrl() {
        driver.get("https://github.com/login");
    }

    public void usernameField() {
        WebElement userName = driver.findElement(username);
        userName.sendKeys("aamjad.0101@gmail.com");

    }

    public void passwordField() {
        WebElement Password = driver.findElement(password);
        Password.sendKeys("*****");
        driver.navigate().back();

    }

    public void loginBtn() {
        WebElement loginbtn = driver.findElement(loginButton);
        loginbtn.click();
    }

}

