package com.croppp.pages;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.title;

public class SubMenuPage {
    public ProductPage selectFirstProduct() {
        $$("#categoryProducts article").first().click();
        return new ProductPage();
    }

    public SubMenuPage assertTitleIs(String titleText) {
        title().equals(titleText);
        return this;
    }
}
