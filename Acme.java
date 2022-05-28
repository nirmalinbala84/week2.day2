package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Acme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
			//Launch the Browser
			WebDriverManager.edgedriver().setup();
			EdgeDriver driver=new EdgeDriver();
			//Get the url()
			driver.get("https://acme-test.uipath.com/login");
			driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
			driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
			System.out.println("The title of the page is "+driver.getTitle());
			driver.findElement(By.xpath("//a[text()='Log Out']")).click();
			driver.close();
			
			

	}

}
