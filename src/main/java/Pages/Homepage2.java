package Pages;
import static ObjectPaths2.HomeObject2.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage2 {

    WebDriver driver = null;

    public Homepage2(WebDriver driver) {

        this.driver = driver;
    }

    public void OpenAvatar() {
        WebElement Avatar = driver.findElement(avatar);
        Avatar.click();
    }

    public void Repositories() {
        WebElement Repository = driver.findElement(yourRepositories);
        Repository.click();
    }
    public void NewRepository() {
        WebElement New = driver.findElement(newRepository);
        New.click();
    }

    public void RepositoryName() {
        WebElement name = driver.findElement(repositoryName);
        name.sendKeys("Testautomation2");
    }

    public void CreateBtn() throws InterruptedException {
        WebElement Create = driver.findElement(createBtn);
        Thread.sleep(3000);
        Create.click();
    }

}
