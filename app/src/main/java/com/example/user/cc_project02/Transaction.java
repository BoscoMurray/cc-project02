package com.example.user.cc_project02;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import enums.TransactionType;

/**
 * Created by user on 08/07/2017.
 */

public class Transaction {

    private String dateString;
    private TransactionType txType;
    private Currency currency;
    private int quantity;
    private int price;

    public Transaction(String dateString, TransactionType txType, Currency currency, int quantity) {
        this.dateString = dateString;
        this.txType = txType;
        this.currency = currency;
        this.quantity = quantity;
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

    public int getTxQuantity() {
        return quantity;
    }

    public int getTxPrice() {
        return price;
    }

    public void setTxPrice(int newPrice) {
        this.price = newPrice;
    }

    public int getTxSum() {
        int total = this.quantity * this.price;
        return total;
    }

    public int getSumOfTxs(ArrayList<Transaction> arrayTxs) {
        int sum = 0;
        for(Transaction tx : arrayTxs) {
            sum += tx.getTxSum();
        }
        return sum;
    }

}
