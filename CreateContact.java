package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the url
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Click on Username
		WebElement eleUserName=driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		
		//Click on Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click on Contacts Button
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		//Click on Create Contact
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		//Enter text on First Name field
		driver.findElement(By.id("firstNameField")).sendKeys("Nirmalin");
		
		//Enter text on LastName field
		driver.findElement(By.id("lastNameField")).sendKeys("Bala");
		
		//Enter text on First Name local field
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Nir");
		
		//Enter text on LastName field
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("bala1");
		
		//Enter text on Department
		driver.findElement(By.name("departmentName")).sendKeys("Learning Selenium");
		
		//Enter text on Description
		driver.findElement(By.name("description")).sendKeys("Happy Learning");
		
		//Enter email id
		driver.findElement(By.name("primaryEmail")).sendKeys("xxxx@gmail.com");
		
		//Select State/Province as NewYork Using Visible Text
		WebElement element=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd=new Select(element);
		dd.selectByVisibleText("New York");
		
		//Click on Create Contact
		driver.findElement(By.name("submitButton")).click();
		
		// Click on edit button 
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear the Description Field using .clear
		driver.findElement(By.name("description")).clear();
		
		//Fill ImportantNote Field with Any text
		driver.findElement(By.name("importantNote")).sendKeys("Hope for the Best");
		
		//Click on update button using Xpath locator
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		//Get the title
		System.out.println("The Title of the page is "+driver.getTitle());
		if(driver.getTitle().contains("Create"))
		{
			System.out.println("The title is Correct");
		}
		else
		{
			System.out.println("The title is not Correct");
		}
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



	}

}
