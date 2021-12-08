public class Sam03 {
    public static void main(String[] args) {
        // i1의 마이너스 값을 구하는 방법은 i1을 0->1로, 1-> 0으로 변경 후 마지막에 1을 더함
        int i1 = 0b0000_0000_0000_0000_0000_0000_0001_0101;

        System.out.println(i1);

        int j1 = 0b1010_1101_0101_1101_1101_0110_1001_0010;
        int j2 = 0b0101_0010_1010_0010_0010_1001_0110_1110;


        System.out.println(j1);
        System.out.println(j2);
        System.out.println(j1 + j2);
    }
    
}
