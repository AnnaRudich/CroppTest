package com.croppp.tests;

import org.junit.Test;

public class OrderProductE2ETest extends BaseTest{

    @Test
    public void smoke(){
        croppPage.openSite()
                .selectMenuSubmenu("Kobieta", "Swetry")
                .selectFirstProduct()
                .selectSize("XS")
                .assertSizeIsSelected("XS")
                .addProductToCard()
                .assertPrice("39,99")
                .goToBasket();
    }
}
