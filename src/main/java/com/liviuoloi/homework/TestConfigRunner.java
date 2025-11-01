package com.liviuoloi.homework;

import static com.liviuoloi.homework.BrowserType.*;

public class TestConfigRunner {
    public static void main(String[] args) {

        BrowserConfig chrome = new BrowserConfig(CHROME, "22.54", true);
        BrowserConfig firefox = new BrowserConfig(FIREFOX, "18.23");
        BrowserConfig edge = new BrowserConfig(EDGE);
        BrowserConfig defaultConfig = BrowserConfig.createDefaultChromeConfig();
        chrome.afiseazaConfig();
        firefox.afiseazaConfig();
        edge.afiseazaConfig();
        defaultConfig.afiseazaConfig();

    }
}
