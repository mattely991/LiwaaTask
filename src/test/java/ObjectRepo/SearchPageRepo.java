package ObjectRepo;

import org.openqa.selenium.By;

import Common.Config;

public class SearchPageRepo extends Config {
	
	public By searchBox= By.name("q");
	public By repo_count_searchresults = By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/nav[1]/a[1]/span");
	public By results_list = By.xpath(".//div[@class='px-2']/ul");
	public By results_lists = By.xpath("//li/div[2]/div/a");
	public By readme_section = By.xpath("//div[@id='readme']");
	
	
	public By img_build= By.xpath("//*[@id='readme']/div[2]/article/a[1]/img");
	public By img_Tests =By.xpath("//*[@id=\"readme\"]/div[2]/article/a[2]/img");
	public By img_AzurePiplines =By.xpath("//*[@id=\"readme\"]/div[2]/article/a[3]");
	public By img_codecov =By.xpath("//*[@id=\"readme\"]/div[2]/article/a[4]/img");
	public By img_zulip =By.xpath("//*[@id=\"readme\"]/div[2]/article/a[5]/img");
	
	
}
