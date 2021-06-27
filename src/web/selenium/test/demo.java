package web.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Demo {

    public static void main (String [] args) throws InterruptedException {

        // Chrome web-driver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaki\\IdeaProjects\\SeleniumTesting\\webbrowser\\chromedriver.exe");


        // Web URL
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.gmail.com");
        driver.manage().window().maximize();

        // Task 01: enter email id
        driver.findElement(By.id("identifierId")).sendKeys("shakila110127@gmail.com");
        Thread.sleep(2000);

        // Task 02: Click 'Next'
        driver.findElement(By.className("VfPpkd-vQzf8d")).click();
        Thread.sleep(2000);

        // Test case 01
        String at = driver.getTitle();
        String et = "gmail";
        driver.close();

        if (at.equalsIgnoreCase(et)) {
            System.out.println("Test successful!");
        } else {
            System.out.println("Test failure :(");
        }

    }

}