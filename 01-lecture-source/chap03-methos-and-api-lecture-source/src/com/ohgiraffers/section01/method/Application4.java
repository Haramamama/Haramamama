package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {

        /* 수업 목표: 여러개의 전달인자를 이용한 메소드를 호출할 수 있다. */
        /*여러 개의 전달인자를 이용한 메소드 호출 테스트*/

        /*1. 여러 개의 매게변수를 가진 메소드 호출*/
        Application4 a004 = new Application4();
        a004.testMethod("송하람", 22, '여');
       // a004.testMethod("20", "유관순", '여'); // 값의 갯수는 맞지만 순서가 다르기에 호출되지 못한다.

        /*2. 변수에 저장된 값을 전달하여 호출할 수 있다. */
        String name = "송하람";
        int age = 22;
        char gender = '여';

         a004.testMethod(name, age, gender);
    }

    public void testMethod(String name, int age, final char gender){

        /*
        * 매게변수도 일종의 지역변수로 분류된다.
        * 매게변수도 final 키워드를 사용할 수 있다. // final 키워드만 붙일뿐 대문자 사용 안해도 된다.
        * 지역변수에서 final 키워드를 붙여 상수를 만드는 것과 동일하다.
        * final의 매게변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다.*/

        System.out.println("당신의 이름은 " +name+ "이고, 나이는 " +age+"세 이며, 성별은 " + gender+"입니다. ");

    }
}
