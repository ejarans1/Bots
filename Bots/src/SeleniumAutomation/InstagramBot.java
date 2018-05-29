package SeleniumAutomation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InstagramBot extends BotExoSkeleton{
	static WebDriver driver;
	//static Random rand = new Random();
	//static Robot robot;
	static ImageBot imgBot;
	static String basicFileDirectory = "c:/users/ejarans1/pictures/";
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		driver = new ChromeDriver();
		robot = new Robot();
		String chosenTopic = chooseRandomTopic("C:/BotScripts/topics.txt");
		navigateToHomePage();
		TimeUnit.SECONDS.sleep(5);
		enterUserName("meandmymother@protonmail.com");
		TimeUnit.SECONDS.sleep(2);
		enterPassword("Chomper145!");
		TimeUnit.SECONDS.sleep(4);
		hitLoginButton();
		//switchToApplicationStyle();
		TimeUnit.SECONDS.sleep(6);
		//hitNotNowButton();
		//switchToDevMode();
		TimeUnit.SECONDS.sleep(2);
		hitNotNowNotificationButton();
		TimeUnit.SECONDS.sleep(2);
		switchToDevMode();
		TimeUnit.SECONDS.sleep(2);
		switchToApplicationStyle();
		TimeUnit.SECONDS.sleep(2);
		refreshPage();
		TimeUnit.SECONDS.sleep(2);
		controlShiftJ();
		TimeUnit.SECONDS.sleep(2);
		hitAddPhotoButton1();
		TimeUnit.SECONDS.sleep(4);
		
		findAndSelectPhoto(basicFileDirectory+chosenTopic);
		TimeUnit.SECONDS.sleep(2);
		hitNext();
		TimeUnit.SECONDS.sleep(2);
		addDescription(WikipediaBot.getFirstParagroup(chosenTopic));
		TimeUnit.SECONDS.sleep(2);
		 
		TimeUnit.SECONDS.sleep(200);
		driver.quit();
	
		 
	}
	
	
	public static void navigateToHomePage() {
		driver.get("https://www.instagram.com/accounts/login/");
		
	}
	
	public static void enterUserName(String username) {
		WebElement loginField = driver.findElements(By.tagName("input")).get(0); 
		loginField.sendKeys(username);
	}
	
	public static void enterPassword(String password) {
		WebElement loginField = driver.findElements(By.tagName("input")).get(1); 
		loginField.sendKeys(password);
	}
	
	public static void hitLoginButton() {
		WebElement loginButton = driver.findElements(By.tagName("button")).get(0);
		loginButton.click();
	}
	public static void switchToDevMode() {
		robot.keyPress(KeyEvent.VK_F12);
		robot.keyRelease(KeyEvent.VK_F12);
	}
	
	public static void refreshPage() {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_R);
	}
	
	public static void switchToApplicationStyle() {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_M);
	}
	
	
	public static void controlShiftJ() {
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_J);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_J);
	}
	

	public static void hitAddPhotoButton() {
		Actions builder = new Actions(driver);
		WebElement basebar = driver.findElements(By.tagName("div")).get(0);
		builder.moveToElement(basebar, 10, 25).click().build().perform();
	}
	
	public static void hitNotNowButton() {
		driver.findElement(By.xpath("//*[@id='react-root']/div/div[2]/a[2]")).click();;
		
	}
	
	public static void hitNotNowNotificationButton() {
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/button[2]")).click();;
	}
	
	public static void hitAddPhotoButton1() {
		driver.findElement(By.xpath("//*[@id='react-root']/section/nav[2]/div/div/div[2]/div/div/div[3]/div")).click();
	}
	
	public static void hitNext() {
		driver.findElement(By.xpath("//*[@id='react-root']/section/div[1]/header/div/div[2]/button")).click();
	}
	
	public static void addDescription(String description) {
		driver.findElement(By.xpath("//*[@id='react-root']/section/div[2]/section[1]/div/textarea")).sendKeys(description);;
	}
	
	public static void findAndSelectPhoto(String filePath) {
		try {
			sendMultipleRobotKeys(filePath);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
	}
	

	
	public static void hitShareButton() {
		driver.findElement(By.xpath("//*[@id='react-root']/section/div[1]/header/div/div[2]/button")).click();
	}
	
}
