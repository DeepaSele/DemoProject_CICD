package demopackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TEST01 {
	
public static WebDriver driver;	
	
@BeforeMethod
public void startbrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	 
}
	
@Test
public void test1() {
	driver.navigate().to("https://automationtalks.com/");
	System.out.println("Test1 title is : " +driver.getTitle());
}

@Test
public void test2() {
driver.navigate().to("https://automationtalks.com/");
System.out.println("Test1 title is : " +driver.getTitle());
}

@Test
public void test3() {
driver.navigate().to("https://automationtalks.com/");
System.out.println("Test1 title is : " +driver.getTitle());
}
}
