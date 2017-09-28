package Assignment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class web_2 {
  private WebDriver driver;
  
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test2() throws Exception {
	  
	  driver.get("file:///C:/tests/WebQA/WeightWatchers/src/Assignment/Web.html");
	  
	  WebElement itemsContent = driver.findElement(By.className("itemContent"));
	  List<WebElement> titles = itemsContent.findElements(By.className("title"));
	  List<WebElement> descriptions = itemsContent.findElements(By.className("description"));
	  
	  Map<String, String> items = new HashMap<String, String>();
	  
	  for (int i = 0; i < titles.size(); i++) {
		  
		items.put(titles.get(i).getText(),descriptions.get(i).getText());
		
	}
	  
      for (Entry<String, String> item : items.entrySet()) {
    	  
    	  System.out.println(item.getKey() + " " + item.getValue());
	}	  
	 
  }
  
  @After
  public void tearDown() throws Exception {
    driver.quit();
    }

 
}
