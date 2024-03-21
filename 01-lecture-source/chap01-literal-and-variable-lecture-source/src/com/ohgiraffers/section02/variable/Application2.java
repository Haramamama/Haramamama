package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[]args){

        /* 수업목표: 변수를 선언하고 값을 혈당하여 사용할 수 있다 */
        /* 변수를 사용하는 방법
        * 1. 변수를 준비한다(선언)
        * 2. 변수의 값을 대입한다(값 대입 및 초기화)
        * 3. 변수를 사용한다. */

        /* 자료형이란?
        * 다양한 값을 형태별로 어느 정도의 크기를 하나의 값으로 취급할 것인지 미리 Compiler와 약속한 키워드이다.
        * 예) 앞에서 사용한 int 자료형은 정수를 4byte만큼 읽어서 하나의 값으로 취급하겠다는 약속이다.
        *    이러한 자료형은 기본자료형(primary type)과 참조자료형(Reference type)으로 나누어진다
        *    그 중 기본자료형 8가지부터 살펴보기로 한다. */

        /* 목차1-1-1 숫자를 취급하는 자료형 */
        /* 정수를 취급하는 자료형에는 4가지가 있다 */

        byte bnum;    // 1byte

        short snum;   // 2byte

        int inum;    //4byte

        long lnum;   //8byte


        /* 실수를 취급하는 자료형은 2가지가 있다 */

        float fnum;   //4byte

        double dnum;  //8byte


        /* 목차1-1-2 문자를 취급하는 자료형 */
        /* 문자를 취급하는 자료형은 한 가지가 있다 */

        char ch;     //2byte
        char ch2;

        /* 목차1-1-3 논리값을 취급하는 자료형 */
        boolean isTrue;   //1byte

        /* 이상 8가지를 기본자료형이라고 한다 */

        /*1-1-4 문자열을 취급하는 자료형 */
        String str;    //4byte(엄밀히 이야기하면 주소값은 4byte 정수값)  - 주소값은 메모리값안에 들어갈수 있는 값

        /*2. 변수의 값을 대입한다. (값 대입 및 초기화) */

        /*목차2-1 정수를 취급하는 자료형에 값 대입 */

        bnum =1;  //-128 ~ 127까지 가능
        snum =2;  //-32768 ~ 32767 //~는 ~다,가 아니라 변수안에 가능한 숫자 아무거나 넣은거다.
        inum =3;  // -2147483648 ~ 2147483647
        // lnum =8;  // 아무 문제 없을 것 같지만 뒤에 대문자 L을 붙여야한다. 그 이유는 형변환에서 알아보자.
        lnum =8L;

        /* 2-2 실수를 취급하는 자료형 값 대입 */
        // fnum =4.8; // 에러 발생 소문자 f를 사용해줘야함
        fnum =4.0f;
        dnum =8.0;

        /* 2-3 문자를 취급하는 자료형 값 대입 */
        ch = 'a';  // 문자 형태의 값을 저장할 수 있다
        ch2 = 97;  //'a'는 '97'이라는 숫자이기에 숫자로도 저장할 수 있다. (아스키코드와 유니코드)

        /* 2-4 논리를 취급하는 자료형에 값 대입 */
        isTrue = true;
        System.out.println("isTrue의 값 출력: " + isTrue);

        isTrue = false;

        /*2-5 문자열을 취급하는 자료형에 값 대입 */

        str = "   ";
        System.out.println("str 의 값 출력: " + str);

        str = "안녕하세요";

        /* 일반적으로 사용하는 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을 대표자료형이라고 하며
        * 정수는 int 실수는 double이 대표 자료형이다*/

        /* 목차3 변수를 사용한다 */
        /* 변수에 저장한 값을 출력 */
        System.out.println("======= 변수에 지정된 값을 출력 ======");
        System.out.println("bnum 의 값 출력: " + bnum);
        System.out.println("snum 의 값 출력: " + snum);
        System.out.println("inum 의 값 출력: " + inum);
        System.out.println("lnum 의 값 출력: " + lnum);

        System.out.println("fnum 의 값 출력: " + fnum);
        System.out.println("dnum 의 값 출력: " + dnum);

        System.out.println("ch 의 값 출력: " + ch);
        System.out.println("ch2 의 값 출력: " + ch2);

        System.out.println("isTrue의 값 출력: " + isTrue); //프로그램은 위에서 아래로 적용되기에 마지막에 변수 선언해준 false값이 나오게 된다

        System.out.println("str 의 값 출력: " + str);








    }
}
