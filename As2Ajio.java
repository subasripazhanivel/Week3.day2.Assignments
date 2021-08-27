package week3.day2.assignments;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class As2Ajio {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// In the search box, type as "bags" and press enter

		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		Thread.sleep(1000);
		// To the left of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(1000);
		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();

		// Print the count of the items Found.
		Thread.sleep(2000);
		String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Total Items Found: " + count);

		// Get the list of brand of the products displayed in the page and print the
		// list(Unique).
		System.out.println(" List of Brands:");
		List<WebElement> bagBrands = driver.findElements(By.xpath("//div[@class='brand']"));
		Set<String> brandName = new LinkedHashSet<String>();
		for (WebElement brand : bagBrands)
		brandName.add(brand.getText());
		System.out.println(brandName);

		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class='name']"));
		System.out.println("\nSize :" + bagNameList.size());
		System.out.println(" Names of the Bags:");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}

}
