public class Sam11 {

    public static void main(String[] args) {

        int i1 = 12;
        int i1_complement = ~i1;
        int i2 = ~i1 + 1;  // 2의 보수

        System.out.println(i1);
        System.out.println(i1_complement);
        System.out.println(i2);

        System.out.println("----------------");

        int b1 = 0b0000_0000_0000_0000_0000_0000_0000_0100;
        int b1BitOper = 0b0000_0000_0000_0000_0000_0000_0000_0010;
        int b2 = b1 >> 1; // b1의 2진수를 오른쪽으로 1칸씩 이동, 앞에 빈 자리는 0으로 채워줌

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1BitOper);
    }
    
}
