package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main(String[] args) 
    {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        // Perform login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        System.out.println("Login Successful ");

        // Wait for few seconds (optional but useful)
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser (IMPORTANT)
        driver.quit();
    }
}
