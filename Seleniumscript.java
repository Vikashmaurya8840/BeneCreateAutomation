package expentra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscript {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.frontend.q2pay.co.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("Q75");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//button[@id='button']")).click();
	
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Accounts']")).click();
			Thread.sleep(6000);
		    driver.findElement(By.xpath("//div[text()='Beneficiary Accounts']")).click();
			Thread.sleep(6000);
		    driver.findElement(By.xpath("//div[@class='createAc']")).click();
		    
		    Thread.sleep(6000);
		    //1.Enter pan number
		    driver.findElement(By.xpath("//input[@id='panid']")).sendKeys("GYKPM8023D");
		    
		  //Click on account associated account card.
		     Thread.sleep(2000);
		      driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
		      
		      //Archive the account
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("(//button[normalize-space()='Archive Account'])[1]")).click();
		      
		      
		      //Confirm archive
		      driver.findElement(By.xpath("(//button[normalize-space()='Confirm'])[1]")).click();
		    
		    //Click on un-archive account card.
		     // Thread.sleep(2000);
		     // driver.findElement(By.xpath("//button[@id='ee8ca734-a5c1-4f5f-a8b5-1d21994297dc']")).click();
		      
		      //Click on un-archive button
		     // Thread.sleep(2000);
		     // driver.findElement(By.xpath("(//button[normalize-space()='Unarchive account'])[1]")).click(); 
		      
		      //Click on confirm un-qarchive pop-up
		     // Thread.sleep(2000);
		    //  driver.findElement(By.xpath("(//button[normalize-space()='Confirm'])[1]")).click(); 
		      
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("(//span[@class='plus_Add'])[1]")).click();
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[normalize-space()='Next']")).click();
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(" (//input[@id='outlined-size-small'])[1]")).sendKeys("53105101006");
		    
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("(//input[@id='outlined-size-small'])[2]")).sendKeys("SCBL0036025");
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@style='color: rgb(254, 254, 254); background: 0% 0% no-repeat padding-box padding-box rgb(113, 133, 168); opacity: 1;']")).click();
		  
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeMedium MuiButton-textSizeMedium MuiButton-colorPrimary bank_ass_next css-1ujsas3']")).click();
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath(" //input[@id='outlined-size-small-contact_no'] ")).sendKeys("3373777373");
		    
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@id='outlined-size-small-email_id'] ")).sendKeys("ALAS@gmail.com");
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//div[@class='stepper_Div']//button[2]")).click();
		    
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[normalize-space()='Create']")).click();
		 
		
			

		

			Thread.sleep(5000);//wait for 5 secs before quit
			driver.close();
			driver.quit();
			
		


		
	}

}
