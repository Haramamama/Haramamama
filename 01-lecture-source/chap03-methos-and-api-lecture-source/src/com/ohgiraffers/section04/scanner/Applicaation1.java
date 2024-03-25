package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Applicaation1 {

    public static void main(String[] args) {

        /* 수업 목표: java.util.scanner을 이용한 다양한 자료형 값 입력 받기*/

        /*
        * 1. Scanner 객체 선언
        * 1-1. 원래 이렇게 scanner 객체를 만들어야 한다. (java.lang 은 생략 가능하다.)
        * */

         //java.util.Scanner sc = new java.util.Scanner(java.lang.System.in);//

         /* 1-2. 다른 클래스에 클래스 사용 시 패키지명 생략하기 위해 사용하는 구문 (import) 사용*/

        Scanner sc = new Scanner(System.in); // 객체선언

        /* 2. 자료형 값 입력 받기*/
        /* 2-1. 문자열 입력받기*/
        /*nextLine() : 입력 받은 값을 문자열로 반환해줌*/
        System.out.print("이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 " + name + "입니다.");

        /*2-2. 정수값 입력 받기*/
        /*nextInt() : 입력받은 값을 int형으로 반환한다. */

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 " + age + "입니다.");

        /*2-3. 실수값 입력 받기*/
        /*nextDouble() : 입력받은 값을 double형으로 반환한다. */  //  정수 값을 넣어도 실수로 반환후 동작이된다.
        System.out.print("키를 입력하세요 : ");
        double height = sc.nextDouble();
        System.out.println("입력하신 키는 " + height + "cm입니다.");

        /*2-4 논리형 입력 받기*/
        /*nextBoolean() : 입력받은 값을 boolean형으로 반환한다.*/
        System.out.print("참과 거짓의 한가지를 true or false 입력해주세요. : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리값은 " + isTrue + "입니다.");

        /* 문자형 값 입력 받기*/
        /*CharAt(int index)를 사용한다.*/
        sc.nextLine();
        System.out.print("아무 문자나 입력해주세요 : ");
        char ch = sc.nextLine().charAt(2); // 0은 첫글자를 알아보겠다는 뜻
        System.out.println("입력하신 문자는" + ch + "입니다.");




    }
}
