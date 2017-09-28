package Assignment;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class web_1 {
  private WebDriver driver;
  
  
  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1() throws Exception {
	  
	  driver.get("file:///C:/tests/WebQA/WeightWatchers/src/Assignment/Web.html");
	  String text = driver.findElement(By.xpath("/html/body/div/span[5]")).getText();
	  String text2 = driver.findElement(By.xpath("/html/body/div/span[9]")).getText();
	  System.out.println(text);
	  System.out.println(text2);
  }
  
  @After
  public void tearDown() throws Exception {
    driver.quit();
    }

 
}
