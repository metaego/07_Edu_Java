package Sam01;
public class Sam14 {
    
    public static void main(String[] args) {

        int age = 15;
        char gender = 'M';
        String item = "";
        String subItem = "";
        String genderItem = "";

        //성인인지 확인
        if (age > 19) {
            item = "아이템1"; 
            subItem = "서브아이템1";
            
            if (gender == 'F') {
                genderItem = "여성아이템1";
                
            }

        } else if (age > 14) {
            item = "아이템2"; 
            subItem = "서브아이템2";

        } else if (age > 10) {
            item = "아이템3"; 
            subItem = "서브아이템3";

        } else {
            item = "없음";
            subItem = "없음";

        }

        System.out.println("item: " + item);
        System.out.println("subItem: " + subItem);

    }
}
