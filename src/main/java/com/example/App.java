package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriverService;

import java.io.File;

public class App {

    public static void main(String[] args) {

        // Force chromedriver path
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();

        // Force system Chrome
        options.setBinary("/usr/bin/google-chrome");

        // Jenkins headless options
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        ChromeDriverService service = new ChromeDriverService.Builder()
                .usingDriverExecutable(new File("/usr/local/bin/chromedriver"))
                .build();

        WebDriver driver = new ChromeDriver(service, options);

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        System.out.println("Login Successful");

        driver.quit();

        System.exit(0);
    }
}
