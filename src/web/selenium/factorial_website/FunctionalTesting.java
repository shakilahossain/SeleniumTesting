package web.selenium.factorial_website;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FunctionalTesting {

	public static void main (String [] args) throws InterruptedException {

		// Chrome web-driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shaki\\IdeaProjects\\SeleniumTesting\\webbrowser\\chromedriver.exe");

		// Web URL
		WebDriver driver = new ChromeDriver();
		driver.get("https://qainterview.pythonanywhere.com/");
		driver.manage().window().maximize();


		/* **************************************************
		 * Task 01: Positive Small Integer Input
		 * **************************************************/

		//Get three small random positive integers input in the range (0, 20)
		for (int i=0; i<2; i++) {
			System.out.println("TEST NUMBER (POSITIVE INTEGER): " + i);

			//Reload the web-page
			driver.navigate().refresh();

			int usr_input_int = RandomGenerator.getRandomNumberInRange(0, 20);
			String usr_input = String.valueOf(usr_input_int);
			System.out.println("SELECTED INPUT: " + usr_input);

			//Get the functional output from the website
			driver.findElement(By.id("number")).sendKeys(usr_input);  		//input an integer '5'
			Thread.sleep(100);

			driver.findElement(By.id("getFactorial")).click();   			//click 'Calculate' button
			Thread.sleep(100);

			String cur_output_st = driver.findElement(By.id("resultDiv")).getText();	//get the current output text

			//Print current output
			if (cur_output_st.isEmpty()) {
				System.out.println("CURRENT OUTPUT: " + "null");
			} else {
				System.out.println("CURRENT OUTPUT: " + cur_output_st);
			}

			//Calculating factorial for given input
			long fract_restul = FactorialGenerator.calculateFactorial(Integer.parseInt(usr_input));

			//Expected output
			String ex_output_st = String.join(" ", "The factorial of", usr_input, "is:", String.valueOf(fract_restul));
			System.out.println("EXPECTED OUTPUT: " + ex_output_st);

			//Testing the expected output
			if (cur_output_st.equalsIgnoreCase(ex_output_st)) {
				System.out.println("Test successful!");
			} else {
				System.out.println("Test failure");
			}

			//Clear input field
			driver.findElement(By.id("number")).clear();

			System.out.println();

		}

		/* **************************************************
		 * Task 02: Positive Large Integer Input
		 * **************************************************/

		//Get three large random positive integers input in the range (0, 20)
		for (int i=0; i<2; i++) {
			System.out.println("TEST NUMBER (LARGE POSITIVE INTEGER): " + i);

			//Reload the web-page
			driver.navigate().refresh();

			int usr_input_int = RandomGenerator.getRandomNumberInRange(500, 1000);
			String usr_input = String.valueOf(usr_input_int);
			System.out.println("SELECTED INPUT: " + usr_input);

			//Get the functional output from the website
			driver.findElement(By.id("number")).sendKeys(usr_input);  		//input an integer '5'
			Thread.sleep(100);

			driver.findElement(By.id("getFactorial")).click();   			//click 'Calculate' button
			Thread.sleep(100);

			String cur_output_st = driver.findElement(By.id("resultDiv")).getText();	//get the current output text

			//Print current output
			if (cur_output_st.isEmpty()) {
				System.out.println("CURRENT OUTPUT: " + "null");
			} else {
				System.out.println("CURRENT OUTPUT: " + cur_output_st);
			}

			//Expected output
			String ex_output_st = String.join(" ", "The factorial of", usr_input, "is: Infinity");
			System.out.println("EXPECTED OUTPUT: " + ex_output_st);

			//Testing the expected output
			if (cur_output_st.equalsIgnoreCase(ex_output_st)) {
				System.out.println("Test successful!");
			} else {
				System.out.println("Test failure");
			}

			//Clear input field
			driver.findElement(By.id("number")).clear();

			System.out.println();

		}




		/* ************************************************
		 * Task 03: Negative Integer Input
		 * ************************************************/

		//Get three small random positive integers input in the range (0, 20)
		for (int i=0; i<2; i++) {
			System.out.println("TEST NUMBER (NEGATIVE INTEGER): " + i);

			//Reload the web-page
			driver.navigate().refresh();

			int usr_input_int = RandomGenerator.getRandomNumberInRange(0, 20);
			String usr_input = "-" + String.valueOf(usr_input_int);
			System.out.println("SELECTED INPUT: " + usr_input);

			//Get the functional output from the website
			driver.findElement(By.id("number")).sendKeys(usr_input);  		//input an integer '5'
			Thread.sleep(100);

			driver.findElement(By.id("getFactorial")).click();   			//click 'Calculate' button
			Thread.sleep(100);

			String cur_output_st = driver.findElement(By.id("resultDiv")).getText();	//get the current output text

			//Print current output
			if (cur_output_st.isEmpty()) {
				System.out.println("CURRENT OUTPUT: " + "null");
			} else {
				System.out.println("CURRENT OUTPUT: " + cur_output_st);
			}


			//Expected output
			String ex_output_st = "Please enter a positive integer";
			System.out.println("EXPECTED OUTPUT: " + ex_output_st);

			//Testing the expected output
			if (cur_output_st.equalsIgnoreCase(ex_output_st)) {
				System.out.println("Test successful!");
			} else {
				System.out.println("Test failure");
			}

			//Clear input field
			driver.findElement(By.id("number")).clear();
			System.out.println();
		}

		/* ***********************************************
		 * Task 04: Positive Fraction Input 
		 * ***********************************************/
		for (int j=0; j<2; j++) {

			System.out.println("TEST NUMBER (POSITIVE FRACTION): " + j);

			//Reload the web-page
			driver.navigate().refresh();

			//Get a random positive fraction
			Random r = new Random();
			double usr_input_float = 0 + r.nextDouble() * (20 - 0);
			String usr_input = String.valueOf(usr_input_float);
			System.out.println("SELECTED INPUT: " + usr_input);

			//Get the functional output from the website
			driver.findElement(By.id("number")).sendKeys(usr_input);  		//input an integer '5'
			Thread.sleep(100);

			driver.findElement(By.id("getFactorial")).click();   			//click 'Calculate' button
			Thread.sleep(100);

			String cur_output_st = driver.findElement(By.id("resultDiv")).getText();	//get the current output text

			//Print current output
			if (cur_output_st.isEmpty()) {
				System.out.println("CURRENT OUTPUT: " + "null");
			} else {
				System.out.println("CURRENT OUTPUT: " + cur_output_st);
			}


			//Expected output
			String ex_output_st = "Please enter an integer";
			System.out.println("EXPECTED OUTPUT: " + ex_output_st);

			//Testing the expected output
			if (cur_output_st.equalsIgnoreCase(ex_output_st)) {
				System.out.println("Test successful!");
			} else {
				System.out.println("Test failure :(");
			}

			//Clear input field
			driver.findElement(By.id("number")).clear();

			System.out.println();

		}


		/* ***********************************************
		 * Task 05: Negative Fraction Input 
		 * ***********************************************/
		for (int j=0; j<2; j++) {

			System.out.println("TEST NUMBER (NEGATIVE FRACTION): " + j);

			//Reload the web-page
			driver.navigate().refresh();

			//Get a random positive fraction
			Random r = new Random();
			double usr_input_float = 0 + r.nextDouble() * (20 - 0);
			String usr_input = "-" + String.valueOf(usr_input_float);
			System.out.println("SELECTED INPUT: " + usr_input);

			//Get the functional output from the website
			driver.findElement(By.id("number")).sendKeys(usr_input);  		//input an integer '5'
			Thread.sleep(100);

			driver.findElement(By.id("getFactorial")).click();   			//click 'Calculate' button
			Thread.sleep(100);

			String cur_output_st = driver.findElement(By.id("resultDiv")).getText();	//get the current output text

			//Print current output
			if (cur_output_st.isEmpty()) {
				System.out.println("CURRENT OUTPUT: " + "null");
			} else {
				System.out.println("CURRENT OUTPUT: " + cur_output_st);
			}

			//Expected output
			String ex_output_st = "Please enter an integer";
			System.out.println("EXPECTED OUTPUT: " + ex_output_st);

			//Testing the expected output
			if (cur_output_st.equalsIgnoreCase(ex_output_st)) {
				System.out.println("Test successful!");
			} else {
				System.out.println("Test failure :(");
			}

			//Clear input field
			driver.findElement(By.id("number")).clear();
			System.out.println();
		}



		/* ***********************************************
		 * Task 06: Random String Input 
		 * ***********************************************/

		System.out.println("TEST NUMBER (RANDOM STRING INPUT): " );

		//Reload the web-page
		driver.navigate().refresh();

		//Generating a random string
		int leftLimit = 1; // letter 'a'
		int rightLimit = 5; // letter 'z'
		int targetStringLength = 3;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) 
					(random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}

		String usr_input = buffer.toString();
		System.out.println("SELECTED INPUT: " + usr_input);

		//Get the functional output from the website
		driver.findElement(By.id("number")).sendKeys(usr_input);  		// input an integer '5'
		Thread.sleep(100);

		driver.findElement(By.id("getFactorial")).click();   			// click 'Calculate' button
		Thread.sleep(100);

		String cur_output_st = driver.findElement(By.id("resultDiv")).getText();	// get the current output text

		//Print current output
		if (cur_output_st.isEmpty()) {
			System.out.println("CURRENT OUTPUT: " + "null");
		} else {
			System.out.println("CURRENT OUTPUT: " + cur_output_st);
		}


		//Expected output
		String ex_output_st = "Please enter an integer";
		System.out.println("EXPECTED OUTPUT: " + ex_output_st);

		//Testing the expected output
		if (cur_output_st.equalsIgnoreCase(ex_output_st)) {
			System.out.println("Test successful!");
		} else {
			System.out.println("Test failure :(");
		}

		//Clear input field
		driver.findElement(By.id("number")).clear();


		driver.close();

	}
}
