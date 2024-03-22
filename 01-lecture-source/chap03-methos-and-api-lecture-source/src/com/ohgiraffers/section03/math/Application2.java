package com.ohgiraffers.section03.math;

public class Application2 {

    public static void main(String[] args) {

        /* 사용자 지정 범위의 난수를 발생 시킬 수 있다. */
        /* 난수의 활용
        * Math.random()을 이용해 발생한 난수는 0부터 1천까지의 실수 범위의 난수값을 반환한다.
        * 필요에 따라 정수 형태의 값을 원하는 범위만큼 발생시켜야 하는 경우도 존재한다.
        * */

        /* 원하는 범위의 난수를 구하는 공식
        * (int)(Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값 // *은 곱하기 아님.
        * */

        /* 1. 0부터 9까지의 정수로 된 난수 발생*/
        int random1 = (int)(Math.random() * 10 );  //소수점 밑이 절삭되기에 데이터 손실 일어날 수 있다.

        System.out.println("0부터 9까지의 정수로 된 난수 : " + random1);  // 10부터는 나오지 않는다. 범위 내의 숫자만 나온다.

        /* 2. 1부터 10까지의 난수를 발생시켜보자 */
        int random2 = (int)(Math.random() * 10) + 1;  //1을 더하는 이유는 프로그램의 기본값은 0이기 때문에 1부터 출력하기 위해 1을 더해준다.
        System.out.println("1부터 10사이의 난수 : " + random2);

        /*3. 10부터 15까지의 난수를 발생시켜보자*/
        int random3 = (int)(Math.random() * 6) +10; //최소값 10을 더해준다. 공식
        System.out.println("10부터 15까지의 난수 : " + random3);




    }
}
