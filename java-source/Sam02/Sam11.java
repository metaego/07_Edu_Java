package Sam02;
import java.util.Scanner;

public class Sam11 {
    public static void main(String[] sargs) {

        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        // for 문
        // for (int i = 1; i <= 9; i++){
        //     System.out.println(dan + " x " + i + " = " + (dan * i));
        // }
        
        // while 문(조건을 만족한 후 수행)
        // int i = 1;
        
        // while (i++ <= 9) {
        //     System.out.println(dan + " x " + i + " = " + (dan * i));
        //     i++;
        // }

        // do while 문(무조건 수행한 후 조건에 따라 수행)
        // int i = 1;

        // do {
        //     System.out.println(dan + " x " + i + " = " + (dan * i));
        //     i++;
        // } while (i<= 9);



        for (int i = 1; i <= 9; i++){
            if (i == 4){
                continue;
                // break;
            }
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
        


    }


}
