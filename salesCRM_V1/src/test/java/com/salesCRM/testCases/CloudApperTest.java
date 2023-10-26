package com.salesCRM.testCases;

import org.testng.annotations.Test;

import com.salesCRM.pageObjects.*;

public class CloudApperTest extends BaseClass 
{
	
	
	public static void main(String[] args) throws InterruptedException 
	{
        CloudApperTest test = new CloudApperTest();
        test.runTest();
    }

    @Test
	public void runTest() throws InterruptedException 
    {
        setUp();

        CloudApperPageObject pageObject = new CloudApperPageObject(driver);
        pageObject.login("m2sysqa.05+1@gmail.com", "Qatesting@1");
        
        String currentUrl = driver.getCurrentUrl();

        String expectedRedirectionUrl = "https://web.cloudapper.com/";
        
        if (currentUrl.equals(expectedRedirectionUrl)) 
        {
            System.out.println("Redirection test failed!");
        } 
        else 
        {
            System.out.println("Redirection test passed!");
            driver.get("https://web.cloudapper.com/");
            Thread.sleep(15000);
        }

        pageObject.launchCRMApp();
        Thread.sleep(10000);
        
        pageObject.openAcountForm();
        Thread.sleep(10000);

        pageObject.openOpportunityForm();
        Thread.sleep(10000);
        
        pageObject.openContactList();
        Thread.sleep(10000);
        
        try 
        {
            Thread.sleep(15000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }

        tearDown();
    }


}
