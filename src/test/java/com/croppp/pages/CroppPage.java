package com.croppp.pages;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;

public class CroppPage {

    public HomePage openSite() {
        open("https://www.cropp.com/pl/pl/");
        return new HomePage();
    }

}
