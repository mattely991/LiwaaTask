package Github;
import java.util.List;
import org.testng.annotations.Test;
import ObjectRepo.SearchPageRepo;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Search extends SearchPageRepo {
	

WebElement search = driver.findElement(searchBox);
WebElement firstResult;
  @Test(priority=1, description = "Opening github.com should show a search box in the header panel, with placeholder text of Search Github. ")
  public void Part3_1() {
	  
	   System.out.println("Make Sure that the Search box is displayed and the place holder for this field is Search Github");
	  boolean x = search.isDisplayed();
	   assertTrue(x, "The Search box should be displayed");

	  String searchBox_PlaceHolder = search.getAttribute("placeholder");
	  assertEqual(searchBox_PlaceHolder, "Search GitHub");
	   System.out.println("************************************************");
  }
  
  
  @Test(priority=2, description = "Searching for the text (repo) “python/cpython”")
  public void Part3_2() {
	 String  count;
	 System.out.println("Searching for Python/Cpython ");
	 search.click();
	 search.sendKeys("Python/Cpython");
  	 search.submit();
  	 
  	 // to get the correct count
  	 WebElement rep_count = driver.findElement(repo_count_searchresults);
  	count = rep_count.getText();
  	assertTrue(driver.getPageSource().contains(count + " repository results" ), "The count for the list results should match the repository");
  		System.out.println("************************************************"); 
  	 
  	 
  
  }
  
  
  
	
 @Test (priority = 3, description ="The first result for the search term should be the repo “python/cpython” with the following URL https://github.com/python/cpython ")
 public void part3_3(){
	 WebElement matchingResult= driver.findElement(results_list);
	 List<WebElement> listResult= matchingResult.findElements(results_lists);

	System.out.println(listResult.size() + " results per page");
	
	System.out.println("Check if the first result is eqaul \"python/cpython\" with the url =https://github.com/python/cpython ");
	 firstResult = listResult.get(0);
	
	assertEqual(firstResult.getText(), ("python/cpython"));
	String firstResult_URL = firstResult.getAttribute("href");
	assertEqual(firstResult_URL, ("https://github.com/python/cpython"));
	System.out.println("*************************************************");

 }
  
  @Test (priority = 4,description=" Clicking on the repo, should open its page")
  		public void part3_4() {
	  
	  System.out.println(" Clicking on the repo, should open its page");
	  firstResult.click();
	  
	  assertEqual(driver.getCurrentUrl(), "https://github.com/python/cpython");
	System.out.println("*************************************************");
	  }
 @Test (priority = 5,description= " confirm the existence of the CI statuses bar ")
 
 public void part3_5() {
	 System.out.println(" confirm the existence of the CI statuses bar");
	 
boolean a = driver.findElement(img_build).isDisplayed(); 
System.out.print(a);

boolean  b = driver.findElement(img_Tests).isDisplayed();
System.out.print(b);
boolean c = driver.findElement(img_AzurePiplines).isDisplayed();
System.out.print(c);
boolean  d = driver.findElement(img_codecov).isDisplayed();
System.out.print(d);

boolean  e = driver.findElement(img_zulip).isDisplayed();
System.out.print(e);





 }
	  		
  @BeforeTest
  public void beforeTest() throws InterruptedException {
		System.out.println("Preparing Browser");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);

	
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Close the browser");
  driver.close();
  }

}
