package ru.netology.service;

import org.junit.*;
import org.junit.Test;
import org . junit . Assert .*;
import  java . util .*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testPurchasesFor0() {
        int actual = service.remain(0);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testPurchasesFor900() {
        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testPurchasesFor1000() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testPurchasesFor999() {
        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testPurchasesFor1001() {
        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }
}
