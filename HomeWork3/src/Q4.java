public class Q4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        boolean equi=false;//track if both arrays have the same length
        int numOfEqualElements = 0;//counter to count how many elements are equal
        if (arr1.length==arr2.length) {//check if both arrays have the same length
            equi=true;
            for (int i = 0; i < arr1.length; i++) {//loop cross all elements in both arrays
                if (arr1[i]==arr2[i])//check if the corresponding elements are equal
                    numOfEqualElements++;//increase the counter every time we found equal elements
            }
        }
        if (numOfEqualElements == arr1.length&&equi)//check if the counter is equal to the length
            System.out.println("arrays are equivalence");
        else
            System.out.println("arrays are not equivalence");
    }
}