package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {

    public static void main(String[] args) {

        // Launch Chrome normally
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.saucedemo.com/");

        // Maximize window
        driver.manage().window().maximize();

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Success message
        System.out.println("Login Successful");

        // Wait 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close browser
        driver.quit();

        System.exit(0);
    }
}
