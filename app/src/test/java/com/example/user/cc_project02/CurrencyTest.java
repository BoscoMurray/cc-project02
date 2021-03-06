package com.example.user.cc_project02;

import org.junit.Before;
import org.junit.Test;

import enums.CurrencyName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 09/07/2017.
 */

public class CurrencyTest {

    Currency bitcoin;

    @Before
    public void before() {
        bitcoin = new Currency(CurrencyName.BITCOIN, "bitcoin", 1000);
    }

    @Test
    public void canGetCurrencyName() {
        assertEquals(CurrencyName.BITCOIN, bitcoin.getName());
    }

    @Test
    public void canGetImage() {
        assertEquals("bitcoin", bitcoin.getImage());
    }

    @Test
    public void canGetBasePrice() {
        assertEquals(1000, bitcoin.getBasePrice());
    }

    @Test
    public void canGetPriceByDate() {
        assertNotNull(bitcoin.getPriceList().getPriceByDate("20170704"));
    }

}
