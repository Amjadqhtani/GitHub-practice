package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectPaths2.Githubpath2.*;

public class Githubpage2 {
    WebDriver driver = null;

    public Githubpage2(WebDriver driver) {
        this.driver = driver;

    }

    public void openUrlgit() {
        driver.get("https://github.com/");


    }
    public void sigin() {
        WebElement sigin = driver.findElement(SignIn);
        sigin.click();
        //driver.navigate().back();
    }
    public void Opendocs() {
        WebElement getDocs = driver.findElement(Docs);
        //getDocs.sendKeys(Keys.END);
        getDocs.click();
        driver.navigate().back();

    }
    public void Community() {
        WebElement getCommunity = driver.findElement(CommunityBtn);
        getCommunity.click();
        driver.navigate().back();
    }
    public void ProfessionalServices() {
        WebElement Ser = driver.findElement(ProSer);
        Ser.click();
    }
    public void productpar() {
        WebElement productbtn = driver.findElement(product);
        productbtn.click();
    }
    public void peckeges() {
        WebElement packege = driver.findElement(insideproduct);
        packege.click();
    }
    public void scrollup() {
        JavascriptExecutor Scroll = (JavascriptExecutor) driver;
        Scroll.executeScript("window.scrollTo(0,600);");
    }



}
