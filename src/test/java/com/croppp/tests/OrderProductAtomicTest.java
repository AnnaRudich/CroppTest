package com.croppp.tests;

import org.junit.Test;

public class OrderProductAtomicTest extends BaseTest{

    @Test
    public void selectMenuSubMenuTest(){
        croppPage.openSite()
                .selectMenuSubmenu("Kobieta", "Swetry")
                .assertTitleIs("Modne swetry damskie z kolekcji Cropp – odkryj najnowsze trendy");
    }

    @Test
    public void selectSizeTest(){
        croppPage.openSite()
                .selectMenuSubmenu("Polecane", "Basic")
                .selectFirstProduct()
                .selectSize("XS")
                .assertSizeIsSelected("XS");
    }
}
