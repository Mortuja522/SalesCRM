package com.salesCRM.pageObjects;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloudApperPageObject 
{
	
	private WebDriver driver;
    private WebDriverWait wait;

    public CloudApperPageObject(WebDriver driver) 
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void login(String username, String password) 
    {
        driver.get("https://account.cloudapper.com/Account/Login");
        driver.findElement(By.id("txtEmail")).sendKeys("m2sysqa.05+1@gmail.com");
        driver.findElement(By.id("txtUserPassword")).sendKeys("Qatesting@1");
        driver.findElement(By.name("button")).click();
        System.out.println("Login Successful");
        
    }

    public void launchCRMApp() throws InterruptedException 
    {
    	
    	driver.findElement(By.xpath("//*[@id=\"body\"]/app-root/app-home/div/div[2]/app-console/div/div/div/app-list/div/div[2]/a/div"));
    	System.out.println("CRM App launched Successful");
        driver.get("https://web.cloudapper.com/2097447700005960/app/f1cad2ae-4940-4c29-ba38-573205dd8f8e/dashboard");
        
        Thread.sleep(20000);
        System.out.println("Showing CRM Dasshboard");
        
    }

    public void openAcountForm() throws InterruptedException
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
        		By.xpath("//*[contains(@id, 'menuId-cc38f254-f82f-4ccb-9926-23da2bb78abd')]/span")));
    	
    	element.click();
    	
        Thread.sleep(10000);
        System.out.println("Showing CRM Account details");
        
     // Account Add button 
        try {
            
            
        	WebElement switchButtonContainer = driver.findElement(By.id("switchButtonContainer"));
            WebElement addButton = switchButtonContainer.findElement(By.className("dx-button-text"));
            addButton.click();
            Thread.sleep(3000);
            
            //.........................
            try {
                driver.findElement(By.className("dx-scrollview-content"));
                driver.findElement(By.name("stringField3")).sendKeys("Ashek");
                Thread.sleep(4000);
                
                driver.findElement(By.xpath("//*[@id=\"SidebarDrawer\"]/div/div[2]/div/div/div/form-add-ui/div[2]"));
                driver.findElement(By.xpath("//*[@id=\"actionBtns\"]/dx-button[2]")).click();
                Thread.sleep(5000);
                System.out.println("Account added successfully");
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            } 

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
    }
    

    public void openOpportunityForm() throws InterruptedException 
    {
    	
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
        		By.xpath("//*[contains(@id, 'menuId-2fc6f0ab-d6c3-4fd0-93c0-8ed14a77e269')]/span")));
    	
    	element.click();
        Thread.sleep(10000);
        System.out.println("Showing CRM Opportunity details");
        
       //add opportunity button
        try {
            WebElement switchButtonContainer = driver.findElement(By.id("switchButtonContainer"));
            WebElement addButton = switchButtonContainer.findElement(By.className("dx-button-text"));
            addButton.click();
            Thread.sleep(3000);

            //.........................
            try {
                
                driver.findElement(By.className("dx-scrollview-content"));
                driver.findElement(By.className("dx-lookup-field")).click();
                Thread.sleep(3000);
                driver.findElement(By.className("dx-popover-arrow"));
                driver.findElement(By.className("custom-title d-flex justify-content-between flex-row dx-template-wrapper dx-popup-title"));
               
                driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/div[2]/div/span/dx-button")).click();
                driver.findElement(By.xpath("//*[@id=\"SidebarDrawer\"]/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]"));
                
                driver.findElement(By.name("stringField3")).sendKeys("Stark");
                driver.findElement(By.xpath("//*[@id=\"SidebarDrawer\"]/div/div[2]/div/div/div/form-add-ui/div[2]"));
                driver.findElement(By.xpath("//*[@id=\"actionBtns\"]/dx-button[2]/div")).click();
                Thread.sleep(3000);
                
                driver.findElement(By.name("stringField3")).sendKeys("React");
                
                Thread.sleep(4000);
                driver.findElement(By.xpath("//*[@id=\"SidebarDrawer\"]/div/div[2]/div/div/div/form-add-ui/div[2]"));
                driver.findElement(By.xpath("//*[@id=\"actionBtns\"]/dx-button[2]/div")).click();
                Thread.sleep(5000);
                System.out.println("Opportunity added successfully");

            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            } 

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
  	  	
    }
    
    public void openContactList() throws InterruptedException 
    {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
        		By.xpath("//*[contains(@id, 'menuId-a52228fb-b389-42e2-a6bc-0a4ad8b97916')]/span")));
    	
    	element.click();
        Thread.sleep(10000);
        System.out.println("Showing CRM Contact-List details");
       
        //add contact-list button
        try {

            WebElement switchButtonContainer = driver.findElement(By.id("switchButtonContainer"));
            WebElement addButton = switchButtonContainer.findElement(By.className("dx-button-text"));
            addButton.click();
            Thread.sleep(3000);
            
            //.........................
            try {
                
                driver.findElement(By.className("dx-scrollview-content"));
                driver.findElement(By.className("dx-lookup-field")).click();
                Thread.sleep(3000);
                driver.findElement(By.className("dx-popover-arrow"));
                driver.findElement(By.className("custom-title d-flex justify-content-between flex-row dx-template-wrapper dx-popup-title"));
                Thread.sleep(3000);
                
                driver.findElement(By.xpath("//*[@id=\"body\"]/div[3]/div/div[2]/div/span/dx-button")).click();
                driver.findElement(By.xpath("//*[@id=\"SidebarDrawer\"]/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]"));
                Thread.sleep(3000);
                
                driver.findElement(By.name("stringField3")).sendKeys("Stark");
                driver.findElement(By.xpath("//*[@id=\"SidebarDrawer\"]/div/div[2]/div/div/div/form-add-ui/div[2]"));
                driver.findElement(By.xpath("//*[@id=\"actionBtns\"]/dx-button[2]/div")).click();
                Thread.sleep(3000);
                
         
                driver.findElement(By.name("stringField2")).sendKeys("Tony");
                driver.findElement(By.name("stringField3")).sendKeys("tony98@gmail.com");
                driver.findElement(By.id("phone")).sendKeys("01789765001");
                Thread.sleep(4000);
                
                driver.findElement(By.xpath("//*[@id=\"SidebarDrawer\"]/div/div[2]/div/div/div/form-add-ui/div[2]"));
                driver.findElement(By.xpath("//*[@id=\"actionBtns\"]/dx-button[2]/div")).click();
                Thread.sleep(5000);
                System.out.println("Contact-List added successfully");

            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            } 

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

}
