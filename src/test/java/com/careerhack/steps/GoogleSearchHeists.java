package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchHeists {

	WebDriver driver;
	
	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
	   
	}
	
	@When("I enter a search {string}")
	public void i_enter_a_search(String string) {
		
		//step1: identify the web element and give the element a name 
		//8 locators: id, name, tag, class name, linktext, partial linktext, xpath, css-selector
		
		WebElement searchBox;
		searchBox = driver.findElement(By.name("q"));
		
		//step2: perform action 
		searchBox.sendKeys(string);
	    
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		
		WebElement searchBtn;
		searchBtn = driver.findElement(By.name("btnK"));
		
		//searchBtn.click();
		searchBtn.submit();
		
	  
	}

	@Then("I see the number of results return")
	public void i_see_the_number_of_results_return() {
		
		WebElement resultStats;
		resultStats = driver.findElement(By.id("result-stats"));
		 String results = resultStats.getText();
		 
		 System.out.println("======================================================================================");
		 System.out.println(results);
		 System.out.println("======================================================================================");
	 
	}
}
