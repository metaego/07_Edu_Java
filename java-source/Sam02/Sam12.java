package Sam02;

public class Sam12 {

    public static void main(String[] args) {

        String[] str = {"홍길동", "이순신", "세종대왕"};

        // for문
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        // foreach 
        for(String s : str) {
            System.out.println(s);
        }
    }
    
}
