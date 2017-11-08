package dailymile;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class mile {
	
	
	                  WebDriver driver;
	
  @Test(priority=1,description="This test specifies if DAily Mile login is working fine")
    
    public void dailyMile() 	 //daily mile--working
        {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\alam\\geckodriver.exe");
        driver = new FirefoxDriver();
	    SoftAssert assertion=new SoftAssert();
		driver.get("https://platform.gethealth.io/v1/health/user/auth/dailymile?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
		driver.findElement(By.xpath(".//*[@id='user_email']")).sendKeys("deviceapidemo@gmail.com");
		driver.findElement(By.xpath(".//*[@id='user_password']")).sendKeys("device@1212");
		driver.findElement(By.xpath(".//input[@id='user_submit']")).click();
		driver.findElement(By.xpath(".//input[@class='orangeButton medium block']")).click();
		assertion.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/get_health_logo.png']")).isDisplayed());
	
		driver.quit();
		assertion.assertAll();
		
		}
	
	
	@Test(priority=2,description="This test specifies if Map My Walk Login is working fine")
	
	public void MapmyWalk()  //may my walk-- working

	   {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\alam\\geckodriver.exe");
        driver = new FirefoxDriver();
		SoftAssert assertion=new SoftAssert();
		driver.get("https://platform.gethealth.io/v1/health/user/auth/mapmywalk?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
		driver.findElement(By.xpath(".//*[@id='id_email']")).sendKeys("deviceapidemo@gmail.com");
		driver.findElement(By.xpath(".//*[@id='id_password']")).sendKeys("device@1212");
		driver.findElement(By.xpath(".//*[@id='login_button']")).click();
		assertion.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/get_health_logo.png']")).isDisplayed());


		driver.quit(); 
		assertion.assertAll();
		
	  }
	
	@Test(priority=3,description="This test specifies if Vita Doc Login is working fine")
	
	 public void VitaDoc() throws Exception    //Vita Doc----not working
	  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\alam\\geckodriver.exe");
        driver = new FirefoxDriver();
		SoftAssert assertion=new SoftAssert();
		driver.get("https://platform.gethealth.io/v1/health/user/auth/vitadock?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='j_username']")).sendKeys("deviceapidemo@gmail.com");
		driver.findElement(By.xpath(".//*[@id='j_password']")).sendKeys("Device@1212");
		driver.findElement(By.xpath(".//*[@id='proceed']")).click();
		assertion.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/get_health_logo.png']")).isDisplayed());
	
		Thread.sleep(5000);
		driver.quit(); 
		assertion.assertAll();
		
	 }
	
	
	@Test(priority=4,description="This test specifies if Vita Doc Login is working fine")
	
	 public void Misfit()  	//Misfit ---working
	
	 {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\alam\\geckodriver.exe");
		driver = new FirefoxDriver();
		SoftAssert assertion=new SoftAssert();
		driver.get("https://platform.gethealth.io/v1/health/user/auth/misfit?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
		driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("sharib@trialx.com");
		driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("M1isfit000");
		driver.findElement(By.xpath(".//button[@id='login-btn']")).click();
		assertion.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/get_health_logo.png']")).isDisplayed());
		
		driver.quit();
		assertion.assertAll();
		
	 }
	
	
	@Test(priority=5,description="This test specifies if Fit Bit Login is working fine")
	
	public void FitBit()  //Fit Bit---working
	
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\alam\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		SoftAssert assertion=new SoftAssert();
		
		driver.get("https://platform.gethealth.io/v1/health/user/auth/fitbit?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
		driver.findElement(By.xpath(".//input[@tabindex='23']")).sendKeys("deviceapidemo@gmail.com");
		driver.findElement(By.xpath(".//input[@tabindex='24']")).sendKeys("device@1212");
		driver.findElement(By.xpath(".//button[@class='common-btn common-btn-submit track-Auth-Login-ClickFitbit']")).click();
		driver.findElement(By.xpath(".//button[@id='allow-button']")).click();
		assertion.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/get_health_logo.png']")).isDisplayed());
		
	
		driver.quit();
		assertion.assertAll();
		
	}
	
	@Test(priority=6,description="This test specifies if Withings Login is working fine")
	
	public void Withings() throws Exception  //Withings---working 
	
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\alam\\geckodriver.exe");
		driver = new FirefoxDriver();
		
        SoftAssert assertion=new SoftAssert();
        
		driver.get("https://platform.gethealth.io/v1/health/user/auth/withings?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
		driver.findElement(By.xpath(".//input[@type='email']")).sendKeys("sai@trialx.com");
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("trialx39");
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		driver.findElement(By.xpath(".//input[@id='accepter']")).click();
		Thread.sleep(5000);
	    assertion.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/get_health_logo.png']")).isDisplayed());
	
		driver.quit();
		assertion.assertAll();
		
		
	} 
	
	
		@Test(priority=7,description="This test specifies if Fat Secret Login is working fine")
	    
		public void FatSecret() throws Exception  //Fat Secret----working
		{
			
		System.setProperty("webdriver.gecko.driver","C:\\Users\\alam\\geckodriver.exe");
        driver = new FirefoxDriver();
        
		SoftAssert assertion=new SoftAssert();
		driver.get("https://platform.gethealth.io/v1/health/user/auth/fatsecret?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
		driver.findElement(By.xpath(".//input[@name='Name']")).sendKeys("shahidashraf");
		driver.findElement(By.xpath(".//input[@name='Password']")).sendKeys("device@1212");
		driver.findElement(By.xpath(".//input[@name='Login']")).click();
	    assertion.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/get_health_logo.png']")).isDisplayed());
		
	   
		Thread.sleep(10000);
		driver.quit();
		assertion.assertAll();
		
		}
	
		@Test(priority=8,description="This test specifies if JawBone Login is working fine")
	    
		public void JawBoneUp() throws Exception  // Jaw Bone Up---passwordincorrect
		
		{
			
		System.setProperty("webdriver.gecko.driver","C:\\Users\\alam\\geckodriver.exe");
        driver = new FirefoxDriver();
        
		SoftAssert assertion=new SoftAssert();
		driver.get("https://platform.gethealth.io/v1/health/user/auth/jawbone?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
		driver.findElement(By.xpath(".//*[@id='jawbone-signin-email']")).sendKeys("deviceapidemo@gmail.com");
		driver.findElement(By.xpath(".//*[@id='jawbone-signin-password']")).sendKeys("Device@1212");
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		assertion.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/get_health_logo.png']")).isDisplayed());
		
		


		driver.quit();
		assertion.assertAll();
     
		}
	
	
	
	@Test(priority=9,description="This test specifies if Strava Login is working fine")
	
	public void Strava() throws Exception
	
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\alam\\geckodriver.exe");   //Strava----working
		driver = new FirefoxDriver();
		
		SoftAssert assertion=new SoftAssert();
		driver.get("https://platform.gethealth.io/v1/health/user/auth/strava?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
		driver.findElement(By.xpath(".//input[@id='email']")).sendKeys("shahidashraff@gmail.com");
		driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("device@1212");
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		assertion.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/get_health_logo.png']")).isDisplayed());
		


		
		Thread.sleep(3000);
		driver.quit();
		assertion.assertAll();
		
	}
	 
  @Test(priority=10,description="This test specifies if Microsoft Login is working fine")
	                  
      public void Microsoft()
    {
	           		   
	               
	                      System.setProperty("webdriver.gecko.driver","C:\\Users\\alam\\geckodriver.exe");   //Strava----working
	           	          driver = new FirefoxDriver();
	           	       	  SoftAssert assertion=new SoftAssert();
	           	          driver.get("https://platform.gethealth.io/v1/health/user/auth/microsoft?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
	           	          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	                      driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sarah@trialx.org");
	           		      driver.findElement(By.cssSelector("#idSIButton9")).click();
	           		      driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("phr&123");
	           		      boolean ans = driver.findElement(By.xpath("//input[@type='submit' and @value='Sign in']")).isEnabled();
	           		      System.out.println("value is "+ans);
	           		 
	           		     //mouse hover
	           		       Actions act= new Actions(driver);
	           		       act.moveToElement( driver.findElement(By.cssSelector("#idSIButton9"))).click().build().perform();
	           		       driver.findElement(By.xpath(".//*[@value='Yes']")).click();
	           		       assertion.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/get_health_logo.png']")).isDisplayed());
	           			
	           		       driver.quit();
	           		       assertion.assertAll();
	   }
	           		

		
	@Test(priority=11,description="This test checks if Google Fit log in is working Fine")
	
    public void GoogleFit(){
	   
   
		
		
	   System.setProperty("webdriver.gecko.driver","C:\\Users\\alam\\geckodriver.exe");   
	   driver = new FirefoxDriver();
	    
	   SoftAssert assertion=new SoftAssert();
	
		
		driver.get("https://platform.gethealth.io/v1/health/user/auth/googlefit?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("deviceapidemo@gmail.com");
		driver.findElement(By.cssSelector("#identifierNext")).click();
		
		
		
		new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("device@1212");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")).click();
		assertion.assertTrue(driver.findElement(By.xpath("//img[@src='/static/images/get_health_logo.png']")).isDisplayed());
		
		
		driver.quit(); 
		assertion.assertAll();
	}
		
      
		
	/*	//Run Keeper--not done

	 @Test(priority=12,description="This test specifies if Microsoft Login is working fine")
	                 
	                  
	 public void RunKeeper()
	 {
	           		   
	               
	         System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\Downloads\\geckodriver.exe"); 
	       
	         driver = new FirefoxDriver();
	    
		
		  driver.get("https://platform.gethealth.io/v1/health/user/auth/runkeeper?access_token=CDA13BC6684C04BD7EDDA6A1A275A88383B9B0F3");
		  driver.findElement(By.xpath("//input[@id='emailInput' and @name='email' and @type='email']")).sendKeys("shahidashraff@gmail.com");

          //wait for the element not visible
		
		  new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("cprogramming123");
		  driver.findElement(By.xpath(".//button[@id='loginSubmit']")).click();
		  driver.quit(); 
	 }  
		*/





@AfterClass
public void closeApp()
{
	driver.quit();
}
}


