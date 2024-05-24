package Transaction.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BenCreTra {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.frontend.q2pay.co.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("Q75");
		driver.findElement(By.xpath("//input[@name='password'   ]")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//button[@id='button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[normalize-space()='Transactions'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1s50f5r'])[1]")).click();
		Thread.sleep(2000);
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0, 300)","");
		Thread.sleep(4000);
		
		js1.executeScript("window.scrollBy(0,-300)","");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@class='createAc hover:bg-custom-cardHover']")).click();
		Thread.sleep(4000);
		
	//Select account
		driver.findElement(By.xpath("//button[normalize-space()='Select an existing account']")).click();
		Thread.sleep(4000);
		
		js1.executeScript("window.scrollBy(0, -300)","");
		Thread.sleep(4000);
		
		
		//Click on search button
	driver.findElement(By.xpath("(//button[@class='smallInputIcon'])[1]")).click();
	Thread.sleep(4000);
		
		//Enter search details
	driver.findElement(By.xpath("(//input[@placeholder='Enter beneficiary account details'])[1]")).sendKeys("I T C ");
		
		//Select search account
		driver.findElement(By.xpath("//div[@class='group p-4 flex flex-col group gap-2 drop-shadow-xl rounded-3xl hover:bg-custom-cardHover bg-custom-card overflow-hidden cursor-pointer']")).click();
		
		// Select scrolll
	  //WebElement scrolling = driver.findElement(By.xpath("(//div[@class='group p-4 flex flex-col group gap-2 drop-shadow-xl rounded-3xl hover:bg-custom-cardHover bg-custom-card overflow-hidden cursor-pointer'])[8]"));
	 // Thread.sleep(4000);
	  //Actions actions = new Actions(driver);
	  //actions.scrollToElement(scrolling).perform();
		
		
		//click on category
		driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
		Thread.sleep(2000);
		
	// click on next arrow button
		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary custom css-1l48i9t'])[1]")).click();
		Thread.sleep(2000);
		
	// enter amount
		driver.findElement(By.xpath("(//input[@id='standard-basic'])[1]")).sendKeys("123");
		Thread.sleep(2000);
		

		//driver.findElement(By.xpath("(//div[@class='MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-formControl MuiInputBase-sizeSmall MuiInputBase-multiline css-1gv5z4s'])[1](//textarea[@id=':r1:'])[1]")).sendKeys("Akash testing");
		//Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//input[@id=':re:'])[1]")).sendKeys("123");
		//Thread.sleep(2000);
		
		
		//Click on next arrow
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		Thread.sleep(2000);
		
	// click on  owner account
		driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary select_owner_butt css-1ujsas3'])[1]")).click();
		Thread.sleep(2000);
		
	// Select owner account
		
		driver.findElement(By.xpath("//div[@class='bank_display_div_no']")).click();
		Thread.sleep(2000);

		// Select RTGS method
		//driver.findElement(By.xpath("(//div[@class='settleType_neft_imps_rfgs_container_inner settleType_rfgs_inner'])[1]")).click();
		//Thread.sleep(2000);
		
		
		
		
	// Click on previous button
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		Thread.sleep(2000);
		
		// Click on next button
		driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
		Thread.sleep(2000);
		
		//Select IMPS method
			driver.findElement(By.xpath("//div[@class='settleType_neft_imps_rfgs_container']//div[1]")).click();
			Thread.sleep(2000);
			
			
		//click on owner next button
		driver.findElement(By.xpath("//div[@class='stepper_Div']//button[2]")).click();
		Thread.sleep(2000);
		
		// click on create button.
		driver.findElement(By.xpath("//div[@class='stepper_Div']//button[2]")).click();
		Thread.sleep(2000);
	
		
		

		Thread.sleep(5000);//wait for 5 secs before quit
		driver.close();
		driver.quit();
		
	
	}

}


	
