package web.selenium.factorial_website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UITesting {

    public static void main(String[] args) throws InterruptedException {


// Chrome web-driver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaki\\IdeaProjects\\SeleniumTesting\\webbrowser\\chromedriver.exe");

        //Web URL
        WebDriver driver = new ChromeDriver();
        driver.get("https://qainterview.pythonanywhere.com/");
        driver.manage().window().maximize();


        //Checking the website title name
        System.out.println("CHECKING WEBSITE TITLE:");
        String expectedTitle = "Factorial";
        String curTitle = driver.getTitle();

        //Comparing the actual title with the expected title text
        if (curTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("The Title Value Is  Expected, ie : " + curTitle);
        } else {
            System.out.println("The Title Value Is  Not Expected, ie : " + curTitle);
        }
        Thread.sleep(100);


        //Checking the website header
        System.out.println("\nCHECKING WEBSITE HEADER:");
        String expectedHeading = "The greatest factorial calculator!"; //initialize the expected website header
        String heading= driver.findElement(By.xpath("//div[1]/div[1]/div/h1")).getText();  //Getting the actual header

        //Comparing the actual header with the expected header text
        if (heading.equalsIgnoreCase(expectedHeading)) {
            System.out.println("The Header Value Is  Expected, ie : " + heading);
        } else {
            System.out.println("The Header Value Is  Not Expected, ie : " + heading);
        }
        Thread.sleep(100);


        //Checking the input field
        System.out.println("\nCHECKING INPUT FIELD:");
        WebElement inputfield = driver.findElement(By.id("number")); //Initializing the element
        String placeholderVal = inputfield.getAttribute("placeholder"); //Getting the value of the placeholder
        String expectedVal = "Enter an integer"; //Initializing the expected placeholder text

        //Comparing the actual placeholder text with the expected placeholder text
        if(placeholderVal.equalsIgnoreCase(expectedVal))
            System.out.println("The placeholder value is expected, ie : "+ placeholderVal);
        else
            System.out.println("The placeholder value is not correct --- " + placeholderVal);
        Thread.sleep(100);


        //Checking the calculate button
        System.out.println("\nCHECKING CALCULATE BUTTON:");
        Boolean Display = driver.findElement(By.xpath("//*[@id=\"getFactorial\"]")).isDisplayed();

        //To print the value
        if (Display=true)
        {
            String button = driver.findElement(By.xpath("//*[@id=\"getFactorial\"]")).getText();
            System.out.println("The Button is exist and its name is : " +button);
        }
        else
            System.out.println("Calculate Button is not exist");
        Thread.sleep(100);


        //Checking with a positive integer
        System.out.println("\nCHECKING OUTPUT FOR A POSITIVE INTEGER INPUT:");
        driver.findElement(By.id("number")).sendKeys("5");  // input an integer '5'
        Thread.sleep(100);
        driver.findElement(By.id("getFactorial")).click();   // click 'Calculate' button
        Thread.sleep(100);
        String at =driver.findElement(By.id("resultDiv")).getText(); //Taking the result of factorial
        String et = "The factorial of 5 is: 120";

        //Checking the function is working or not
        if (at.equalsIgnoreCase(et)) {
            System.out.println("Checking with positive integer is successful!");
        } else {
            System.out.println("Checking with positive integer is not successful!");
        }
        Thread.sleep(100);


        //Checking with a float number or any string
        System.out.println("\nCHECKING FOR A FRACTIONAL NUMBER INPUT:");
        driver.findElement(By.id("number")).clear();
        driver.findElement(By.id("number")).sendKeys("5.5");  // input an integer '5'
        Thread.sleep(100);
        driver.findElement(By.id("getFactorial")).click();   // click 'Calculate' button
        Thread.sleep(100);
        String acresult =driver.findElement(By.id("resultDiv")).getText(); //Taking the result of factorial
        String exresult = "Please enter an integer";


        //Checking the function is working or not
        if (acresult.equalsIgnoreCase(exresult)) {
            System.out.println("Checking with float or any string number is successful!");
        } else {
            System.out.println("Checking with float number or any string  is not successful!");
        }
        Thread.sleep(100);
        driver.close();
    }
}