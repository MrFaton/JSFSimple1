package com.mr_faton.entity;

/**
 * Created by root on 24.06.2015.
 */
public class IntegerPair {
    private int num1;
    private int num2;

    public IntegerPair(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return num1 + "." + num2;
    }
}
/*
This a simple bean, which is a field of an our main bean, which associate with form on the server page
 */