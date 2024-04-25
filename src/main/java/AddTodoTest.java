// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import java.util.*;

public class AddTodoTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        //driver.quit();
    }
    @Test
    public void addTodo() throws InterruptedException {
        driver.get("https://todomvc.com/examples/react/dist/");
        driver.manage().window().setSize(new Dimension(550, 693));
        Thread.sleep(500);
        driver.findElement(By.id("todo-input")).click();
        Thread.sleep(500);
        driver.findElement(By.id("todo-input")).sendKeys("exampleToDo");
        Thread.sleep(500);
        driver.findElement(By.id("todo-input")).sendKeys(Keys.ENTER);
        Thread.sleep(500);
    }
}
