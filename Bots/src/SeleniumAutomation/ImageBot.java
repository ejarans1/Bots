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

public class ImageBot {
	static WebDriver driver;
	static Random rand = new Random();
	static Robot robot;
	
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
		//expandedImage.click();
		//Actions action= new Actions(driver);
		//action.contextClick(expandedImage).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		
		Actions builder = new Actions(driver);
		TimeUnit.SECONDS.sleep(2);
		//builder.moveToElement(expandedImage).build().perform();
		System.out.println("Before Context Click");
		
		//builder.contextClick(expandedImage).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
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
		//builder.sendKeys(Keys.ARROW_DOWN).build().perform();
		//action.moveToElement(expandedImage).moveToElement(driver.findElement(By.xpath("/expression-here"))).click().build().perform();

		TimeUnit.SECONDS.sleep(10);
		//.sendKeys(Keys.RETURN).build().perform();	
	}
	
	public static void sendMultipleRobotKeys(String messageToSend) throws InterruptedException{
		String [] messageCharacters = messageToSend.split("");
		for (String x: messageCharacters) {
			robot.keyPress(matchRobotKey(x));
			TimeUnit.SECONDS.sleep(1);
		}
	}
	
	
	public static int matchRobotKey(String x) {
		int toReturn = -1;
		if(x.equals("a")) {
			toReturn = KeyEvent.VK_A;
		}
		else if (x.equals("b")) {
			toReturn = KeyEvent.VK_B;
		}
		else if (x.equals("c")) {
			toReturn = KeyEvent.VK_C;
		}
		else if (x.equals("d")) {
			toReturn = KeyEvent.VK_D;
		}
		else if (x.equals("e")) {
			toReturn = KeyEvent.VK_E;
		}
		else if (x.equals("f")) {
			toReturn = KeyEvent.VK_F;
		}
		else if (x.equals("g")) {
			toReturn = KeyEvent.VK_G;
		}
		else if (x.equals("h")) {
			toReturn = KeyEvent.VK_H;
		}
		else if (x.equals("i")) {
			toReturn = KeyEvent.VK_I;
		}
		else if (x.equals("j")) {
			toReturn = KeyEvent.VK_J;
		}
		else if (x.equals("k")) {
			toReturn = KeyEvent.VK_K;
		}
		else if (x.equals("l")) {
			toReturn = KeyEvent.VK_L;
		}
		else if (x.equals("m")) {
			toReturn = KeyEvent.VK_M;
		}
		else if (x.equals("n")) {
			toReturn = KeyEvent.VK_N;
		}
		else if (x.equals("o")) {
			toReturn = KeyEvent.VK_O;
		}
		else if (x.equals("p")) {
			toReturn = KeyEvent.VK_P;
		}
		else if (x.equals("q")) {
			toReturn = KeyEvent.VK_Q;
		}
		else if (x.equals("r")) {
			toReturn = KeyEvent.VK_R;
		}
		else if (x.equals("s")) {
			toReturn = KeyEvent.VK_S;
		}
		else if (x.equals("t")) {
			toReturn = KeyEvent.VK_T;
		}
		else if (x.equals("u")) {
			toReturn = KeyEvent.VK_U;
		}
		else if (x.equals("v")) {
			toReturn = KeyEvent.VK_V;
		}
		else if (x.equals("w")) {
			toReturn = KeyEvent.VK_W;
		}
		else if (x.equals("x")) {
			toReturn = KeyEvent.VK_X;
		}
		else if (x.equals("y")) {
			toReturn = KeyEvent.VK_Y;
		}
		else if (x.equals("z")) {
			toReturn = KeyEvent.VK_Z;
		}
		return toReturn;
	}
}
