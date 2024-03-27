package com.ohgiraffers.section3.copy;

public class Application2 {

    public static void main(String[] args) {
        
        /* 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */  // 메소드 ( 클래스 메인 밖에 출력)
        
        /*
        * 얕은 복사의 활용
        * 얕은 복사를 활용하는 것은 주로 메소드 호출시 인자로 사용하는 경우와 
        * 리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다.
        * */
        
        String[] name = {"홍길동", "유관순", "이순신"};

        System.out.println("name.hashCode() = " + name.hashCode()); // 1283928880(해쉬코드)

        /* 1. 인자와 매개변수로 활용*/
        print(name);

        /*2. 리턴값으로 활용*/
        String[] animals = getAnimals();  // static 때문에 바로 호출 가능

        System.out.println("리턴 받은 animals.hashCode() = " + animals.hashCode());  //1989780873

        print(animals);
    }
    public static void print(String[] sarr){  // 메소드 호출

        System.out.println("sarr.hashcode() = " + sarr.hashCode());  //1283928880 , 1989780873
        for (int i = 0; i < sarr.length; i++) {

            System.out.print(sarr[i] + " ");
        }
        System.out.println();
    }



    public static String[] getAnimals(){  // 리턴값만 있는 메소드

        String[] animals = new String[]{"뱀", "판다", "다람쥐"};

        System.out.println("새로만든 animals의 hashcode =" + animals.hashCode());  //1989780873

        return animals;

    }

}
