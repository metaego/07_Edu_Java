package temp;

public class temp01 {

    public static void main(String[] args) {

        // 배열, clone()
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1;
    
        System.out.println(arr2[0]); // 1
        
        arr1[0] = 100;
        System.out.println(arr2[0]);  // 100
        // 같은 주소값을 갖기 때문에 데이터가 바뀌면 arr1, arr2 모두 바뀐 값을 출력한다.
        // 여기서 arr1의 원본값을 따로 할당하여, arr1이 바뀌어도 원본값이 바뀌지 않게 arr2에 담고 싶을 경우 clone을 사용한다.

        int[] arr3 = {6, 7, 8, 9, 10};
        int[] arr4 = arr3.clone();

        System.out.println(arr4[0]);  // 6
        
        arr3[0] = 200;
        System.out.println(arr4[0]);  // 6
        
        
    }
    
}
