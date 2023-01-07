import java.util.Arrays;

public class Q1 {
    //Method to revers array using another array//
    public static void rev(int[]arr ,int[]arr2){
        for ( int i = 0 , j= arr.length-1 ; i <arr.length ; i++ , j-- ) {
            arr2[j]=arr[i];
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int[]arr2=new int[arr.length];
        System.out.println("array before revers \n"+Arrays.toString(arr));
        rev(arr,arr2);
        System.out.println("array after revers \n"+Arrays.toString(arr2));
    }
}