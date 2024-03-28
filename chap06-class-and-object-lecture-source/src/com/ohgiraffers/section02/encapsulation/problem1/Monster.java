package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {

    /*1. 필드로 몬스터 이름과 체력을 저장할 공간을 선언*/
     // String name;
    //int hp; //  정확한 값이 나오지 않아서 (음수) 주석 처리함.

    /*                                                     */
    /*2. setHp를 이용해서 필드에 간접 접근하기 */

    /*
    * hp에 음수가 저장하는 것을 방지하고자 hp가 양수인 경우에만 입력한 hp로 변경하고
    * 0보다 작은 경우에 0으로 변경할 수 있도록 작성해보자
    * 메소드를 이용하면 된다.
    * */

    String name;

    int hp;   // 인스턴스 변수 = 전역변수

    public void setHp (int hp) {  // int hp는 전달인자 ? 매게변수. 반환하지 않기에 static이 아닌 void를 사용
        if (hp > 0 ){
            System.out.println("양수 값이 입력되어 몬스터 체력을 입력한 값으로 변경합니다.");
            /* this는 인스턴스가 생성되었을 때 자신의 주소를 저장하는 레퍼런스 변수이다.
            * 지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선으로 접근하기 때문에
            * 전역변수에 접근하기 위해서는 this.를 명시해야한다.
            * */
            this.hp = hp;  // 지역변수인 hp를 전역변수 this.hp에 넣는다.

        }else{
            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터 체력을 0으로 변경합니다.");

            this.hp = 0;
        }
    }
}
