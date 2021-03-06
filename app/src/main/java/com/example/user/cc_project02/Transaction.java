package com.example.user.cc_project02;

import java.io.Serializable;
import java.util.ArrayList;

import enums.TransactionType;

/**
 * Created by user on 08/07/2017.
 */

public class Transaction implements Serializable {

    private String dateString;
    private TransactionType txType;
    private Currency currency;
    private int quantity;
    private int price;

    public Transaction(String dateString, TransactionType txType, Currency currency, int quantity) {
        this.dateString = dateString;
        this.txType = txType;
        this.currency = currency;
        if(txType == TransactionType.BUY) {
            this.quantity = quantity;
        }
        if(txType == TransactionType.SELL) {
            this.quantity = (quantity * -1);
        }

        this.price = currency.getPriceList().getPriceByDate(dateString);
    }

    public String getTxDate() {
        return this.dateString;
    }

    public TransactionType getTxType() {
        return txType;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Integer getTxQuantity() {
        return quantity;
    }

    public Integer getTxPrice() {
        return price;
    }

    public void setTxPrice(int newPrice) {
        this.price = newPrice;
    }

    public Integer getTxSum() {
        int total = this.quantity * this.price;
        return total;
    }

}
