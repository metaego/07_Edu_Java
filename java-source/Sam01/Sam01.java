package Sam01;
public class Sam01 {
    public static void main(String[] args) {

        // int -> 32bit
        int i1 = 10;   // 10진수
        int i2 = 0b10; // 2진수
        int i3 = 0x10; // 16진수;
        int i4 = 010;  // 8진수
        // 2진수 -> 00000000_00000000_00000000_00000000
        // 8진수
        // 16진수 -> 0123456789ABCDEF -> ff_ff_ff_ff
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
}