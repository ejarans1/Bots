package SeleniumAutomation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikipediaBot extends BotExoSkeleton {
	
	static WebDriver driver;
	static Random rand = new Random();
	
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
//		driver = new ChromeDriver();
//		findWikiArticle();
//		getFirstParagraph();
//		driver.quit();
//		//readInFile("C:/BotScripts/topics.txt");
//		
//	}
	
	public static String getFirstParagroup(String topic) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		driver = new ChromeDriver();
		findWikiArticle(topic);
		String firstParagraph = getFirstParagraph();
		driver.quit();
		return firstParagraph;
	}
	
	public static void navigateToHomePage() {
		driver.get("https://www.wikipedia.org/");
		
	}
	

	
	
	public static List<String> readInFile(String fileName){
		List <String> topics = new ArrayList<String>();
		File file = new File(fileName);
		  
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		 
		String st;
		try {
			while ((st = br.readLine()) != null) {
				System.out.println(st);
				topics.add(st);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return topics;
	}
	
	public static void findWikiArticle(String topic) throws InterruptedException {
		//String topic = chooseRandomTopic("C:/BotScripts/topics.txt");
		driver.get("https://www.wikipedia.org/wiki/" + topic);
	}
	
	public static String getFirstParagraph() {
		WebElement firstParagraph = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/p[1]"));
		return firstParagraph.getText();
		
	}
	
	

}
