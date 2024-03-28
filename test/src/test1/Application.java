package test1;

public class Application {

    public static void main(String[] args) {


        //1.
       byte b = 2;
       short s = 3;
       int i = 4;
       long l =5L;

       float f = 5.5f;
       double d = 6.0;

       char c = 8;

       boolean isTrue = true;

       //2.
        int a =i + (int)l;
        System.out.println("두 정수의 합계는 = " + a);

        //3. 9는 0보다 크면 양수이고 0보다 작으면 음수입니다.

        String result = (a > 0)? "양수입니다." : "음수입니다.";
        System.out.println("a는" +result);


    }
}


