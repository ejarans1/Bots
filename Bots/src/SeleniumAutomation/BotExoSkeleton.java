package SeleniumAutomation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class BotExoSkeleton {
	
	//static WebDriver driver;
	static Random rand = new Random();
	static Robot robot;
	
//	public static WebDriver getDriver() {
//		return driver;
//	 }
//
//	public static void setDriver(WebDriver driver) {
//		BotExoSkeleton.driver = driver;
//	}

	public static Random getRand() {
		return rand;
	}

	public static void setRand(Random rand) {
		BotExoSkeleton.rand = rand;
	}

	
	public static String chooseRandomTopic(String fileName){
		String topic = "";
		List <String> topics = readInFile(fileName);
		
		
		int  n = rand.nextInt(topics.size()) + 0;
		topic = topics.get(n); 
		return topic;
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
	
	public static void sendMultipleRobotKeys(String messageToSend) throws InterruptedException{
	String [] messageCharacters = messageToSend.split("");
	for (String x: messageCharacters) {
		int robotkeycode = matchRobotKey(x);
		if (robotkeycode == 123456) {
			robot.keyPress(KeyEvent.VK_SHIFT);
			robot.keyPress(KeyEvent.VK_SEMICOLON);
			robot.keyRelease(KeyEvent.VK_SEMICOLON);
			robot.keyRelease(KeyEvent.VK_SHIFT);
		}
		else {
			robot.keyPress(robotkeycode);
			robot.keyRelease(robotkeycode);				
		}
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
		else if (x.equals("/")) {
			toReturn = KeyEvent.VK_BACK_SLASH;
		}
		else if (x.equals(":")) {
			toReturn = 123456;
		}
		else if (x.equals("1")) {
			toReturn = KeyEvent.VK_1;
		}
		return toReturn;
	}	
}
