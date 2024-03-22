package com.ohgiraffers.section01.method;

public class Calculator {

    public int minNumberDf(int first, int second){       //non-static

        return (first>second)? second : first;
    }

    public static int maxNumberDf(int first, int second){

        return (first>second)? first : second;
    }
}
