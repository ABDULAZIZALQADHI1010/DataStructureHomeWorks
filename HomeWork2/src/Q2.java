import java.util.Arrays;

public class Q2 {
    //Method to clone an array to a backup array
    public static void backup(int []arr ,int []arr2) {
        for (int i = 0; i < arr.length-1; i++) {
            arr2[i]=arr[i];
        }
        System.out.println("array1"+ Arrays.toString(arr));
        System.out.println("array2"+ Arrays.toString(arr2));
    }
    public static void main(String[] args) {
        int[]arr={6,7,8,9,0};
        int[]arr2=new int[arr.length];
        backup(arr,arr2);
    }
}