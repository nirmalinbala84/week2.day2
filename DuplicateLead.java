package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch the Browser
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		//Get the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the username
		WebElement eleUserName=driver.findElement(By.xpath("//p[@class='top']/input[@id='username']"));
		eleUserName.sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		//Click Login Button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Click on CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click on Leads Tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click on Find Leads Tab
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Click on Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		//Enter email
		driver.findElement(By.name("emailAddress")).sendKeys("nirmalin@gmail.com");
		
		//Capture name of First resulting lead
		String s=driver.findElement(By.linkText("Haja")).getText();
		System.out.println("The name is "+s);
		
		//Click on First resulting lead
		driver.findElement(By.linkText("Haja")).click();
		
		//Click on Duplicate Lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		
		//Verify the title as Duplicate Lead
		driver.findElement(By.xpath("//div[text()='Duplicate Lead']"));
		System.out.println("The title is "+driver.getTitle());
		if(driver.getTitle().contains("Duplicate"))
		{
			System.out.println("The title is correct");
		}
		else
		{
			System.out.println("The Title is wrong");
		}
		
		//Click on Create lead
		driver.findElement(By.className("smallSubmit")).click();
		
		//Verify Duplicated lead name is same as captured name
		
		String text2=(driver.findElement(By.id("viewLead_firstName_sp")).getText());
		if(s.equals(text2))
		{
			System.out.println("The Duplicate Lead name is same as Captured name");
		}
		else
		{
			System.out.println("The Duplicate Lead name is not same as Captured name");
		}
		
		//Close the browser
		driver.close();
		
				
			
	}

}
