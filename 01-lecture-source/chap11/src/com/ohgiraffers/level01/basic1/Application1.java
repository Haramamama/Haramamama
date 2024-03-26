package com.ohgiraffers.level01.basic1;

public class Application1 {

    public static void main(String[] args) {

        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65
        System.out.println(y >= 5 || x < 0 && x > 2); // true
        System.out.println(y += 10 - x++); // y=y+10 y=5,x=2 ->13
        System.out.println(x+=2);  // x = x+2 -> 5 // 위에서 x가 증감되었기에 x=3이다.
        System.out.println( !('A' <= c && c <='Z') ); // false
        System.out.println('C'-c); // 2 -> 아스키코드로 검색해서 풀어야함.
        System.out.println('5'-'0'); // 5 -> 문자 5의 아스키코드값과 문자 0의 아스키코드값을 계산.
        System.out.println(c+1); // 66
        System.out.println(++c); // B
        System.out.println(c++); // B
        System.out.println(c); // C

    }
}
