package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class transactionapproval {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Selenium webdriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.frontend.q2pay.co.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("Q76");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		
		driver.findElement(By.xpath("//button[@id='button']")).click();
		Thread.sleep(2000);

		//driver.findElement(By.xpath("(//button[normalize-space()='Transactions'])[1]")).click();
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1s50f5r'])[1]")).click();
		//Thread.sleep(3000);
		//---------------------------------------------craete transaction approval flow from details page ------------------------------------
		
		driver.findElement(By.xpath("(//button[normalize-space()='Transactions'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1s50f5r'])[1]")).click();
		Thread.sleep(2000);
		
		//Click on view all
		driver.findElement(By.xpath("//div[@class='BeneTxn_ViewallPage hover:bg-custom-cardHover']")).click();
		Thread.sleep(2000);
		
		//Click on All button
		driver.findElement(By.xpath("(//button[normalize-space()='All'])[1]")).click();
		Thread.sleep(2000);
		
		// Click on pending account
		driver.findElement(By.xpath("(//div[normalize-space()='Pending'])[1]")).click();
		Thread.sleep(2000);
		
		//Click on pending card.
		driver.findElement(By.xpath("(//div[@class='beneTxn_view_all_user'])[1]")).click();
		Thread.sleep(2000);
		
		// Click on approve button.
		driver.findElement(By.xpath("(//div[@class='approveImg cursor-pointer flex flex-col justify-center bg-[#69b76f] opacity-100 hover:opacity-75 cursor-pointer'])[1]")).click();
		Thread.sleep(2000);
		
		// Click on confirm button.
		driver.findElement(By.xpath("(//button[normalize-space()='Confirm'])[1]")).click();
		
		//Click account card from details page
		driver.findElement(By.xpath("(//div[@class='account-detail-card cursor-pointer hover:bg-[#506994] transition-colors duration-300 ease-in-out w-80 px-7 pt-5'])[1]")).click();

	//--------------------For declined the account-------------------------------------------
		
		
		driver.findElement(By.xpath("(//button[normalize-space()='Transactions'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1s50f5r'])[1]")).click();
		Thread.sleep(2000);
		
		//Click on view all
		driver.findElement(By.xpath("//div[@class='BeneTxn_ViewallPage hover:bg-custom-cardHover']")).click();
		Thread.sleep(2000);
		
		//Click on All button
		driver.findElement(By.xpath("(//button[normalize-space()='All'])[1]")).click();
		Thread.sleep(2000);
		
		// Click on pending account
		driver.findElement(By.xpath("(//div[normalize-space()='Pending'])[1]")).click();
		Thread.sleep(2000);
		
		//Click on pending card.
		driver.findElement(By.xpath("(//div[@class='beneTxn_view_all_user'])[1]")).click();
		Thread.sleep(2000);
		
		//click on denied button.
		
		driver.findElement(By.xpath("(//div[@class='py-1 border-r-2 border-solid border-blue-900'])[1]")).click();
		Thread.sleep(2000);
		
		// Enter denied reason
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Automation testing");
		Thread.sleep(4000);
		
		// Click on confirm button.
		driver.findElement(By.xpath("(//button[normalize-space()='Confirm'])[1]")).click();
		Thread.sleep(4000);
		
		
		//------------------------------ Click on awaiting details page --------------------------------------
		
		// Click on profile icon for logout acccount
		driver.findElement(By.xpath("(//img[@alt='Profile'])[1]")).click();
		Thread.sleep(4000);
		
		// Logout the account
		driver.findElement(By.xpath("(//div[@class='hover:opacity-60'])[3]")).click();
		Thread.sleep(4000);
		

		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("Q75");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		Thread.sleep(2000);
		
//		login button click
	    driver.findElement(By.id("button")).click();
	    Thread.sleep(2000);
		
	    driver.findElement(By.xpath("(//button[normalize-space()='Transactions'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-6 css-1s50f5r'])[1]")).click();
		Thread.sleep(2000);
		
		//Click on view all
		driver.findElement(By.xpath("//div[@class='BeneTxn_ViewallPage hover:bg-custom-cardHover']")).click();
		Thread.sleep(2000);
		
		//Click on All button
		driver.findElement(By.xpath("(//button[normalize-space()='All'])[1]")).click();
		Thread.sleep(2000);
		
		// Click on awiating verification button.
		driver.findElement(By.xpath("(//div[normalize-space()='Awaiting verification'])[1]")).click();
		Thread.sleep(2000);
		
				
		// click on account card
			driver.findElement(By.xpath("(//div[contains(@class,'hover:bg-custom-cardHover multiSelectBeneTxnViewAllCard relative MuiBox-root css-0')])[1]")).click();
			Thread.sleep(2000);
		
			// Click on awiating verification account.
			driver.findElement(By.xpath("(//div[normalize-space()='Awaiting verification'])[1]")).click();
			Thread.sleep(2000);
		
		
		
		}

	}





	
