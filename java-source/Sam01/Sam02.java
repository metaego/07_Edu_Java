package Sam01;
public class Sam02 {

    public static void main(String[] args) {

        // int j1 = 0b0000_0000_0000_0000_0000_0000_0000_0001;
        // int j2 = 0b0000_0000_0000_0000_0000_0000_0000_0001;
        // /int j3 = j1 + j2;

        // System.out.println(j1);
        // System.out.println(j3);

        int i1 =   0b0000_0000_0000_0000_0000_0000_0000_1100; // -> 1
        int i1_1 = 0b0000_0000_0000_0000_0000_0000_0000_0011; // i1에 대한 1의 보수(i1의 반대비트)
        int i1_2 = i1_1 + 1;     // i1에 대한 2의 보수 -> i1에 대한 1의 보수 +1
                                // (i1에 대한 2의 보수 구하기 위해 i1에 대한 1의 보수+1)
        int i2 =   0b1111_1111_1111_1111_1111_1111_1111_0100; // 1에 대한 2의 보수
        //         0b0000_0000_0000_0000_0000_0000_0000_0000; -> 0
        // int i2 = 0b10000000000000000000000000001100;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1_2);
        System.out.println(i1 + i2);


    }
}
