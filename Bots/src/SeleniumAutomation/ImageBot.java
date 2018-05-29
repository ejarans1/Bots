package SeleniumAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ImageBot extends BotExoSkeleton{
	static WebDriver driver;
	//static Random rand = new Random();
	//static Robot robot;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.gecko.driver", "C:\\tools\\geckodriver.exe");
		driver = new FirefoxDriver();
		robot = new Robot();
		navigateToGoogleImages();
		enterSearchText("tacos");
		getFirstImageResult();
		TimeUnit.SECONDS.sleep(20);
		//driver.getTitle();

		driver.quit();
		//readInFile("C:/BotScripts/topics.txt");
		
	}
	
	public static void getImageBasedOnTopic() {
		
	}
	
	public static void navigateToGoogleImages() {
		driver.get("https://images.google.com/");
	}
	
	public static void enterSearchText(String searchTerm) throws InterruptedException {
		WebElement searchBox = driver.findElement(By.xpath("//*[@id='lst-ib']"));
		searchBox.sendKeys(searchTerm);
		searchBox.sendKeys(Keys.RETURN);
		TimeUnit.SECONDS.sleep(2); 
	}
	
	public static void getFirstImageResult() throws InterruptedException, AWTException{
		WebElement firstImage = driver.findElement(By.xpath("//*[@id=\'_TwfWF8Ena0hzM:\']"));

		firstImage.click();
		TimeUnit.SECONDS.sleep(2); 
		WebElement expandedImage = driver.findElement(By.xpath("/html/body/div[5]/div[3]/div[3]/div[2]/div/div[2]/div[2]/div/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/a/img"));
		TimeUnit.SECONDS.sleep(2);
		
		Actions builder = new Actions(driver);
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Before Context Click");
		
				builder.contextClick(expandedImage).build().perform();
		Robot robot = new Robot();
		// To press D key.
		robot.keyPress(KeyEvent.VK_DOWN);
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_DOWN);
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_DOWN);
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_DOWN);
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_DOWN);
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_DOWN);
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_DOWN);
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_DOWN);
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_DOWN);
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_DOWN);
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_DOWN);
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_ENTER);
		TimeUnit.SECONDS.sleep(2);
		sendMultipleRobotKeys("tacos");
		TimeUnit.SECONDS.sleep(2);
		robot.keyPress(KeyEvent.VK_ENTER);
		TimeUnit.SECONDS.sleep(10);
	}
	

	
	

}
