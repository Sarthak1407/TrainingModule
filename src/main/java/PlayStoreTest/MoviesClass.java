package PlayStoreTest;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoviesClass {
	
	public static WebDriver driver;
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public void PlayStoreWebsite() {
		driver.manage().window().maximize();
		driver.get("https://play.google.com/");
	}
	
	public void MovieTab() {
		List<WebElement> movie = driver.findElements(By.cssSelector("[href*='movies']"));
		
		try {
			WebElement tab1 = movie.get(0);
			tab1.click();
			System.out.println("User click on first element");
			
		}
		catch(Exception e) {
			WebElement tab2 = movie.get(1);
			tab2.click();
			System.out.println("User click on second element");
		}
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		String expectedURL = "https://play.google.com/store/movies";
		if (currentURL.equals(expectedURL)) {
			System.out.println("User is navigated to the Movies tab");
		} else {
			System.out.println("User is still on same page");
		}
	}
	
	public void ListOfMovies() {
//		WebElement TopChart = driver.findElement(By.cssSelector("[aria-label='Top movies']"));
		
		List<WebElement> MoviesList =driver.findElements(By.xpath("//div[div[div[@aria-label='Rated 4.5 stars out of five stars'] and child::span[text()='₹50.00']]]//div[1]//child::span[1]"));
		
//		List<WebElement> MoviesList =driver.findElements(By.xpath("//div[contains(@aria-label, 'Rated 4.5 stars out of five stars')] and //span[contains(text(),'₹140.00')]"));
		
//		List<WebElement> MoviesList =driver.findElements(By.xpath("//div[contains(@aria-label,'4.5')]//following-sibling::span[contains(text(),'50')]"));
		
		System.out.println("Testing List" + MoviesList.size());
		System.out.println("Values" + MoviesList);
			
		for (WebElement temp:MoviesList) {
			System.out.println("Testing Loop");
			String name=temp.getText();
			if (name.contains("4.5"))
			{
				System.out.println("");
			}
			else {
				System.out.println("Movie Name:"+name);
//				log.info("Movies:"+ name);
			}
		}
		
//		try {
//			WebElement scroll1 = TopChart.get(1); 
//			js.executeScript("arguments[0].scrollIntoView(true);", TopChart);
//			System.out.println("User scroll on first element");
//			
//		}
//		catch(Exception e) {
//			WebElement scroll2 = TopChart.get(0);
//			js.executeScript("arguments[0].scrollIntoView(true);", TopChart);
//			System.out.println("User scroll on second element");
//		}
		
//		js.executeScript("arguments[0].scrollIntoView(true);", TopChart);
	//	js.executeScript("arguments[0].scrollIntoView(true);", TopChart);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"chromedriver.exe");
		
		driver = new ChromeDriver();
		MoviesClass mv = new MoviesClass();
		mv.PlayStoreWebsite();
		mv.MovieTab();
		mv.ListOfMovies();
		
	}

}
