package Sam01;
public class Sam04 {
    
    public static void main(String[] args){
        long l1 = 0b0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0000_0001;
        long l2 = 0x00_00_00_00_00_00_00_01;

        System.out.println(l1);
        System.out.println(l2);

        // 정수형 int의 최댓값과 최솟값????
        int i1 = 0b0111_1111_1111_1111_1111_1111_1111_1111;
        int i2 = 0b1000_0000_0000_0000_0000_0000_0000_0000;

        System.out.println(i1);
        System.out.println(i2);

        int ii1 = Integer.MAX_VALUE;
        int ii2 = Integer.MIN_VALUE;
        System.out.println(ii1);
        System.out.println(ii2);
    }
}
