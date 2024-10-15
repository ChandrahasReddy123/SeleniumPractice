package com.tutorialninja.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigReader {
    private Properties properties;
@Test
    public void ConfigReader() {
        // Specify the path to the config file
        String configFilePath = System.getProperty("user.dir")+"\\Config\\config.properties";
        System.out.println(configFilePath);

        try (FileInputStream fileInputStream = new FileInputStream(configFilePath)) {
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration file: " + configFilePath);
        }
    }

    // Method to get the value of a property
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
