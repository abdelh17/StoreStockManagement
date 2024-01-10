package com.abdel.stockmanagement.exceptions;

public enum ErrorCodes {
    ARTICLE_NOT_FOUND(1000),
    ARTICLE_NOT_VALID(1001),
    ARTICLE_ALREADY_IN_USE(1002),


    CATEGORY_NOT_FOUND(2000),
    CATEGORY_NOT_VALID(2001),
    CATEGORY_ALREADY_IN_USE(2002),

    CLIENT_NOT_FOUND(3000),
    CLIENT_ORDER_NOT_FOUND(4000),
    COMPANY_NOT_FOUND(5000),
    LINE_ORDER_CLIENT_NOT_FOUND(6000),
    LINE_ORDER_SUPPLIER_NOT_FOUND(7000),
    LINE_SALE_NOT_FOUND(8000),
    SALE_NOT_FOUND(9000),
    SUPPLIER_NOT_FOUND(10000),
    SUPPLIER_ORDER_NOT_FOUND(11000),

    STOCK_MOVEMENT_NOT_FOUND(12000),

    USER_NOT_FOUND(13000);


    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
