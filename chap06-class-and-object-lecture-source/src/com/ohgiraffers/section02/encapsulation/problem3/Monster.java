package com.ohgiraffers.section02.encapsulation.problem3;

public class Monster {

    /*String name;

    int hp;

    public void setInfo(String info){

        this.name = info;
    }

    public void setHp(int hp){

        if(hp > 0){
            this.hp = hp;
        }else {
            this.hp = 0;
        }
    }

    public String getInfo(){  // String은 리턴값이 있어야함

        return " 몬스터의 이름은 " + this.name + " 이고 체력은 " + this.hp + " 입니다.";
    }*/

    /* String 변수명을 바꿔도 어플리케이션에서 실행 오류가 뜨지 않는다. 우회했기 때문에*/

    String kinds;

    int hp;

    public void setInfo(String info){

        this.kinds = info;
    }

    public void setHp(int hp){

        if(hp > 0){
            this.hp = hp;
        }else {
            this.hp = 0;
        }
    }

    public String getInfo(){  // String은 리턴값이 있어야함

        return " 몬스터의 이름은 " + this.kinds + " 이고 체력은 " + this.hp + " 입니다.";
    }
}
