package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the browser
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		//Get the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Enter the username
		WebElement eleUserName=driver.findElement(By.xpath("//p[@class='top']/input[@id='username']"));
		eleUserName.sendKeys("DemoSalesManager");
		
		//Enter the password
		//driver.findElement(By.xpath("//input[@name='PASSWORD']/parent::p[@class='top']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		//Click Login Button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Click on CRM/SFA link
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		//Click on Leads Tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click on Find Leads Tab
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Click on Phone tab
		driver.findElement(By.xpath("//*[text()='Phone']/parent::span")).click();
		
		//Enter Phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("6379802582");
		
				
		//Click Find Leads Button
		driver.findElement(By.xpath("//em/button")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		//To get the Lead id of first resulting lead
		String text=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("The Lead id is "+text);
		
		//Click First resulting Lead
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		//Delete the First resulting Lead
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		//Click on Find Leads
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//Enter the captured Lead ID
		driver.findElement(By.name("id")).sendKeys("10272");
		
		//Click on Find Leads Button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String text1=driver.findElement(By.className("x-paging-info")).getText();
		System.out.println("The Successful deletion message is "+text1);
		if(text1.equals(text1))
		{
			System.out.println("There are no records to display");
		}
		else
		{
			System.out.println("There are records");
		}
		driver.close();
		
		//Need Clarification for the output 
		//Not getting output as "No records to display" for Successful deletion message
		
		/*The Lead id is 10280
		The Successful deletion message is Displaying records 1 - 20 of 3184
		There are no records to display*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
