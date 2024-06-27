package com.example.utils;

import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUtil {

    public static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        // Set Chrome to run in headless mode
        options.addArguments("--headless");

        // Set window size
        options.addArguments("--window-size=1920,1080");

        // Disable extensions
        options.addArguments("--disable-extensions");

        // Disable sandbox (useful for certain environments)
        options.addArguments("--no-sandbox");

        // Disable GPU (useful for headless mode)
        options.addArguments("--disable-gpu");

        // Ignore certificate errors
        options.addArguments("--ignore-certificate-errors");

        // Accept insecure certificates
        options.addArguments("--allow-running-insecure-content");

        // Disable infobars (such as "Chrome is being controlled by automated test software")
        options.addArguments("--disable-infobars");

        // Disable notifications
        options.addArguments("--disable-notifications");

        // Disable popups
        options.addArguments("--disable-popup-blocking");

        // Disable geolocation
        options.addArguments("--disable-geolocation");

        // Disable save password popup
        options.addArguments("--disable-save-password-bubble");

        // Enable JavaScript
        options.addArguments("--enable-javascript");

        // Set a specific user agent
        // options.addArguments("--user-agent=YourCustomUserAgentString");

        // Set a specific language (e.g., en for English)
        // options.addArguments("--lang=en");

        // Set a specific proxy server
        // options.addArguments("--proxy-server=http://yourproxyserver:port");

        // Set additional capabilities as needed
        // options.setCapability("capabilityName", "capabilityValue");

        return options;
    }
}
