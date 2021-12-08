package Sam01;
public class Sam07 {
    
    public static void main(String[] args) {
        // 문자형
        // 문자열

        char c1 = '\ubc15'; //유니코드:박
        char last_name = '\uae40';
        char first_name1 = '\uc218'; 
        char first_name2 = '\uc5f0';

        System.out.println(c1);
        System.out.println(last_name);
        System.out.println(first_name1);
        System.out.println(first_name2);

        // char startValue = Character.MIN_VALUE;
        char startValue = '\u0000';
        // char endValue = Character.MAX_VALUE;
        char endValue = '\uffff';
        char koStart = '\uac00';
        char koEnd = '\uD7af';
        for (int i = startValue; i <= endValue; i++) {
            if (i >= (int)koStart && i <= (int)koEnd) {
                char c2 = (char) i;
                System.out.println(c2);
            }
        }
    }
}
