package com.lamtech.luma.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void beforeScenario() throws IOException {
        //load properties file
        Properties prop = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src\\test\\resources\\properties\\env.properties");
        prop.load(fileInputStream);

        if (prop.getProperty("targetBrowser").equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (prop.getProperty("targetBrowser").equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        driver.get(prop.getProperty("targetURL"));



        //driver.get("http://demo-magento2.vuestorefront.io/");
    }

    @After
    public void afterScenario(){
//        driver.close();
//        driver.quit();
    }


}
