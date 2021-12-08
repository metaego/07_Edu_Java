package Sam01;
public class Sam09 {
    
    public static void main(String[] args) {
        // 연산자(나머지연산자)
        int i1 = 12 % 7;

        System.out.println(i1);

        // 삼항연산자: 조건을 만족하면 참에 해당하는 값을 실행하고, 그렇지 않으면 거짓에 해당하는 값을 실행한다
        //(조건) ? (참) : (거짓);
        int result = ( 3 > 4 ) ?  10 : 20;
        System.out.println("result: " + result); // output: 20
    }
}
