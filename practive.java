package newPackage;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.*;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;

public class practive {
	public static void main(String[] args) {
		try{
		String expected="Mobiles- Buy Products Online at Best Price in India - All Categories | Flipkart.com",actual;
		List<String> mobiles =new ArrayList<String>();  
		List<String> prices =new ArrayList<String>();
		System.setProperty("webdriverchrome.driver", "C:\\Chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		
		actual=driver.getTitle();
		// Assert.assertEquals(expected, actual);
		System.out.println(actual);
		for(int i=2;i<=12;i++) {
			TimeUnit.SECONDS.sleep(5);
			String locatorM = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div["+i+"]/div/div/div/a/div[2]/div[1]/div[1]";
			String locatorP = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div["+i+"]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]";
			String mobile = driver.findElement(By.xpath(locatorM)).getText();
			String price =  driver.findElement(By.xpath(locatorP)).getText();
			price=price.replaceAll("[^0-9]", "");
			System.out.println(mobile+"-"+price);
			mobiles.add(mobile);
			prices.add(price);
		}
//		System.out.println("Printing List: "+mobiles);  
//		System.out.println("Printing List: "+prices);
		
		String mobile_name;
		String mobile_price;
		int int_price;
		HashMap<Integer, String> map_final_mobiles = new HashMap<Integer,String>();
		
		String[] priceArray = new String[prices.size()];
		prices.toArray(priceArray);
		
		String[] mobileArray = new String[mobiles.size()];
		mobiles.toArray(mobileArray);
		
		List<String> newList =new ArrayList<String>();
		for(int i=0;i<10;i++) {
			mobile_name=mobileArray[i];
			mobile_price=priceArray[i];
			mobile_price=mobile_price.replaceAll("[^0-9]", "");
			int_price= Integer.parseInt(mobile_price);
			map_final_mobiles.put(int_price, mobile_name);
//			String value = myArray[i],newValue;
//			String[] arrOfStr = value.split("\\?");
////			newValue = value.replace("\\?", "0");
////			newList.add(newValue);
//			newValue = arrOfStr[0];
//			newList.add(newValue);
		}
		
		Set<Integer> keys = map_final_mobiles.keySet();
		ArrayList<Integer> key_prices = new ArrayList<Integer>(keys);
		
		Collections.sort(key_prices);
		
		int high_price = key_prices.get(key_prices.size()-1);
		int low_price = key_prices.get(0);
		System.out.println("Mobile with Highest Price : " + high_price + " and Mobile Name is: " + map_final_mobiles.get(high_price));
		System.out.println("Mobile with Lowest Price : " + low_price + " and Mobile Name is: " + map_final_mobiles.get(low_price));
		driver.quit();
	}catch (Exception e) {
		System.out.print(e);
	}
		
	}
}
