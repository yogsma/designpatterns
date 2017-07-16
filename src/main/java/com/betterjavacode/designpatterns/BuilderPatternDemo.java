package com.betterjavacode.designpatterns;

import java.util.Random;

import com.betterjavacode.designpatterns.builderexample.TransactionalHeader;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        System.out.println(" Builder Pattern Demo ....");
        System.out.println(getTransactionalHeader());

    }

    public static String getTransactionalHeader() {
        String result = "";
        TransactionalHeader th = new TransactionalHeader.Builder().st("ST")
            .transactioncode(TRANSACTION_IDENTIFIER_CODE)
            .transactioncontrolnumber(getTransactionControlNumber())
            .implementationreference("005010X220A1")
            .build();
        result = th.toString();
        return result;
    }

    public static String getTransactionControlNumber() {
        String result = "";
        Random random = new Random();
        int randNum = random.nextInt((999999999 - 1000) + 1) + 1000;
        result = randNum + "";
        return result;
    }

    public static final String TRANSACTION_IDENTIFIER_CODE = "834";

}
