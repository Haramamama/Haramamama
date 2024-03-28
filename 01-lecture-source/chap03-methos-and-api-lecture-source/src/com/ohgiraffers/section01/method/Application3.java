package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {

        /* 수업 목표: 메소드 전달인자와 매게변수에 대해 이해하고 메소드 호출 시 사용할 수 있다. */
        /*
        * 전달인자(argument)와 매게변수(parameter) 를 이용한 메소드 호출
        * 지금까지 우리가 배운 변수는 지역변수에 해당합니다.
        * */

        /* 변수의 종류*/
        /*1. 지역변수
        * 2. 매개변수
        * 3. 전역변수(필드변수)
        * 4. 클래스(static)변수
        * */

        /* 지역변수는 선언한 메소드 블럭 내부에서 사용이 가능함. 이것을 지역변수의 스코프라고 함
        * 다른 메소드 간의 서로 공유해야하는 값이 존재하는 경우 메소드를 호출 시 괄호 이용해서
        * 값을 전달할 수 있다.
        * 이때 전달하는 값을 전달인자(argument)라고 부르고
        * 메소드 선언부 괄호안에 전달인자를 받기 위해 선언하는 변수를 매게변수(parameter)라고 부른다.
        * */

        Application3 aoo3 = new Application3();
        /* 전달인자와 매게 변수를 이용한 메소드 호출 테스트 */
        /* 1. 전달인자로 값 전달 테스트*/
        aoo3.testMethod(40);
        // aoo3.testMethod("40"); // 매게 변수는 int형이지만 전달인자가 String이기에 호출할 수 없다.
       //  aoo3.testMethod(20,30,40);// 매게 변수는 int형이지만 전달인자가 3개이기에 호출할 수 없다.

       /*2. 변수에 저장한 값 전달 테스트*/
       /*2-1. 변수에 저장한 값을 이용하여 값을 전달할 수 있다. */
       int age = 20;
       aoo3.testMethod(age);

       /*2-2 자동형변환을 이용하여 값을 전달할 수 있다. */
        byte byteAge = 10;
        aoo3.testMethod(byteAge);

        /* 2-3 강제형변환을 이용하여 값을 전달할 수 있다. */
        long longAge = 80;
       //  aoo3.testMethod(longAge); //  자동 형변환을 할 수 없어서 에러 발생
        aoo3.testMethod((int)longAge);  // 데이터 손실에 주의.

        /*2-4 연산 결과를 이용해서 값을 전달할 수 있다. */
        aoo3.testMethod(age * 3);
        aoo3.testMethod(age - 3);

    }

    public void testMethod(int age){

        System.out.println("당신의 나이는 " +  age + "세 입니다.");

    }
}
