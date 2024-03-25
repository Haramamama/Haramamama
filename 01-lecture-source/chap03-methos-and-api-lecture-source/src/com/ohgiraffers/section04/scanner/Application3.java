package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        
        /* 수업 목표: Scanner 사용 시 주의 사항에 대해 이해하고 사용시 주의 사항을 고려하여 사용할 수 있다.*/
        /* Scanner의 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
        * 그래서 크게 두 가지 사항을 주의해야한다.
        *  1. next()로 문자열 입력을 받은 후 정수, 실수, 논리값을 받을 때
        *  2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열을 받을 때
        * */
        
        /* Scanner 객체 생성*/
        Scanner sc = new Scanner(System.in); // import class 만들어줘야함
        
        /* 1.next()로 문자열 입력을 받은 후 정수, 실수, 논리값을 받을 때*/
        System.out.print("문자열을 입력해주세요. : ");
        String str1 = sc.next(); // next뒤에 String을 붙이지 않는 이유: String type = next와 nextLine만 사용하기로 약속함.
        System.out.println("str1 = " + str1); //soutv 단축키

        // sc.nextLine(); // 클리어 기능. (한 줄을 비워주는 경우)

        System.out.print("숫자를 입력해주세요. : ");
        int num1 = sc.nextInt();
        System.out.println("num1 = " + num1);

        /* 2. 정수, 실수, 논리값 입력 후 nextLine()로 문자열을 받을 때*/
        System.out.print(" 다시 숫자를 입력해주세요. : ");
        int num2 = sc.nextInt();
        System.out.println("num2 = " + num2);

        sc.nextLine();

        System.out.print("공백이 있는 문자열을 하나 입력해주세요 : ");
        String str2 = sc.nextLine();
        System.out.println("str2 = " + str2);
        
        
    }
}
