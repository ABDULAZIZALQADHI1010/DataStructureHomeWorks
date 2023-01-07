import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        int[]arr1={54,8,0,3,2,67};
        int[]arr2={2,7,03,1,21,1};
        int[]arr3=new int[arr1.length+ arr2.length];
        int i=0;
        for ( i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[i]=arr2[j];
            i++;
        }
        System.out.println("array1\n"+ Arrays.toString(arr1));
        System.out.println("array2\n"+ Arrays.toString(arr2));
        System.out.println("arrays after merge\n"+ Arrays.toString(arr3));
    }
}
