package br.ce.lgoeten.tasks.functional;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTest {

    @Test
    public void testAmbiente() {
        System.setProperty("webdriver.chrome.driver", "C:\\ferramentas\\seleniumdrive\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://www.google.com");
    }
}
