package fc.java.exam01;  // 현 클래스의 위치를 알 수 있음

/**
 * 문서화 주석 JavaDocs의 주석을 볼수있게 처리함
 * @author Kimself
 */
// 클래스명과 파일명은 동일해야 한다
public class HelloWorld {
    static String helloWorld = "Hello world!";

    public static void main(String[] args) {
        System.out.println(helloWorld);
    }

    // // 자료형 선언시 
    // int age;   // 가능
    // int 0age;  // 불가능
    // int user age;  // 불가능(변수명이 띄어쓰기가 되어있음)
    // int $age;  // 가능
    // int _age;  // 가능(관습적으로 사용하는 지역변수명 규칙)
    // int user_age; // 가능
    // int 나이;  // 가능
    // int age;   // 대소문자구분
    // int Age;   // 대소문자구분
    // int for;   // 불가능(예약어)
    // int age1;  // 여러개 선언 가능
    // int age2;
    // int age3;

    }

// 퍼블릭 클래스는 1개 이상 생성 불가. class 생성은 가능
class HelloWorld2 {

}
