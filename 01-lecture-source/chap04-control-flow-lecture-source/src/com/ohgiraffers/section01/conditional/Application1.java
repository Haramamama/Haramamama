package com.ohgiraffers.section01.conditional;

public class Application1 {

    public static void main(String[] args) {

        A_if a = new A_if();
        /* 단독 if 문 흐름 확인용 메소드 출력 */
        //a.testSimpleIfStatement();

        /* 중첩 if문 흐름 확인용 메소드 출력*/
       // a.testNestedStatement();

        B_ifELse b = new B_ifELse();
        /* 단독 if-else 문 흐름 확인용 메소드 호출*/
        //b.simpleIfElseStatement();

        /* 중첩 if-else 문 흐름 확인용 메소드 호출*/
        //b.testNeatedIfELseStatement();

        C_ifElseIf c = new C_ifElseIf();
        //c.testSimpleIfElseIfStatement();
       // c.testNestedIfElseIfStatment();

        D_switch d = new D_switch();
        //d.testSimpleSwitchStatement();
        d.testSwitchVendingMachine();
    }





}
