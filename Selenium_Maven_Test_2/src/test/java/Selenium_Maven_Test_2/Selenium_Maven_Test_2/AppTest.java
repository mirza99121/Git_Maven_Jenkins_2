package Selenium_Maven_Test_2.Selenium_Maven_Test_2;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {

	WebDriver driver;
	
	@Test
	public void setUp() throws InterruptedException{
		
		System.out.println("in setUp");
		
		// System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\Temp\\Selenium\\Chrome_Driver\\chromedriver_win32\\chromedriver.exe");  

        // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();

        
        // -----------------------------------------------------------
        // For Headless, un-comment the code below:
        /*
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
	        WebDriver driver = new ChromeDriver(options);
	      */
	     // -----------------------------------------------------------
        
        driver.navigate().to("http://www.javatpoint.com");
		//driver.get("http://www.google.com");
        System.out.println("Go to javatpoint site");

        
		driver.manage().window().maximize();
        System.out.println("maximize browser");

		// Click on the Custom Search text box and send value  
	    //driver.findElement(By.id("gsc-i-id1")).sendKeys("Java");
        
        //To reproduce a build failure
        // Click on the Custom Search text box and send value
        driver.findElement(By.id("gsc-i-id2")).sendKeys("Java");
        
        System.out.println("Type Java");
        
	        // Click on the Search button  
		driver.findElement(By.className("gsc-search-button")).click();
        System.out.println("Search");

	}
}
